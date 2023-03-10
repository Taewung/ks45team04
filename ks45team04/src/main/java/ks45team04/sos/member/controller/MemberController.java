package ks45team04.sos.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ks45team04.sos.member.dto.LoginHistory;
import ks45team04.sos.member.dto.LoginInfo;
import ks45team04.sos.member.dto.MMember;
import ks45team04.sos.member.mapper.MemberMapper;
import ks45team04.sos.member.service.MMemberService;

@Controller
public class MemberController {
	


	private final MMemberService memberService;
	private final MemberMapper memberMapper;
	
public MemberController(MMemberService memberService,
						MemberMapper membermapper) {
	this.memberService = memberService;
	this.memberMapper = membermapper;
}

private static final Logger log = LoggerFactory.getLogger(MemberController.class);



/*
 * // 로그인 내역 등록
 * 
 * @PostMapping("/getloginLogoutCode") public String
 * getloginLogoutCode(LoginLogoutCode loginLogoutCode) { String
 * newLoginLogoutCode = MMemberService.getloginLogoutCode("login_logout",
 * "login_logout_code"); System.out.println (newLoginLogoutCode +
 * "<-- newPKCode Controller.java");
 * MMemberService.getloginLogoutCode(newLoginLogoutCode);
 * 
 * return "redirect:/"; }
 */



	@PostMapping("/removeMember")
	public String removeMember(@RequestParam(value="memId") String memId,
								@RequestParam(value="memPw") String memPw,
								RedirectAttributes reAttr) {
		log.info("memId : {}, memPw :{}", memId, memPw);
		
		Map<String, Object> checkResult = memberService.checkPwByMemId(memId, memPw);
		
		boolean isChecked = (boolean) checkResult.get("result");
		
		String redirectURI ="redirect:/main";
		
		if(!isChecked) {
			redirectURI="redirect:/member/removeMember/" + memId;
			reAttr.addAttribute("msg", "입력하신 회원의 정보가 일치하지 않습니다.");
		}else {
			MMember mmember = (MMember) checkResult.get("memInfo");
			memberService.removeMember(mmember);
		}
		return redirectURI;
	}

	
	@GetMapping("/removeMember")
	public String removeMember(@RequestParam(value="msg", required = false) String msg,
								HttpSession session,
								Model model) {
	
    	LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
    	String memId = (String) session.getAttribute("SID");		
		model.addAttribute("title", "회원 탈퇴");
		model.addAttribute("memId", memId);
		if(msg != null) model.addAttribute("msg", msg);
		session.invalidate();
		return  "member/member/remove_member";
	}			





	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/main";
	}
	
	@PostMapping("/login")
	public String login(	@RequestParam(name="memId", required=false) String memId
							   ,@RequestParam(name="memPw", required=false) String memPw
							   ,RedirectAttributes reAttr
							   ,HttpSession session
							   ,HttpServletRequest request
							   ,HttpServletResponse response) {
		
		log.info("memId : {}, memPw : {}", memId, memPw);
		
		Map<String,Object> checkResult = memberService.checkPwByMemId(memId, memPw);
		log.info("checkResult:{}",checkResult);
		
		boolean isChecked = (boolean) checkResult.get("result");
		
		String redirectURI = "redirect:/main";
		
		// 1. 비밀번호가 일치하지 않을 시에는 로그인 폼으로 리다이렉트
		// /member/removeMember?memberId=id001
		if(!isChecked) {			
			redirectURI = "redirect:/login";
			reAttr.addAttribute("msg", "입력하신 회원의 정보가 일치하지 않습니다.");
		}else {
			// 2. 비밀번호 일치 시 세션 저장 
			MMember mmember = (MMember) checkResult.get("memInfo");
			session.setAttribute("SID", memId);
			session.setAttribute("SLEVEL", mmember.getMemLevelName());
			session.setAttribute("SNAME", mmember.getMemName());
			
			LoginInfo loginInfo = new LoginInfo(memId, mmember.getMemLevelName());
			
			session.setAttribute("S_MEM_INFO", loginInfo);
			
			LoginInfo linfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
			
			log.info("memberCont login info : {} ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", linfo);
			Cookie cookie = new Cookie("loginKeepId", memId);
			cookie.setPath("/");
			cookie.setMaxAge(60 * 60 * 24);
			response.addCookie(cookie);
		}
		return redirectURI;
	}
	
	@GetMapping("/login")
	public String login(Model model
							  ,@RequestParam(value="msg", required = false) String msg,
							  	HttpSession httpSession) {
		model.addAttribute("title","로그인");
		if(msg != null) model.addAttribute("msg", msg);
		String redirectURI="user/user/userLogin";
		LoginInfo loginInfo= (LoginInfo) httpSession.getAttribute("S_MEM_INFO");
		if(loginInfo!=null){
			redirectURI="redirect:/myPage";
		}
		return "member/login/login";
	}
	
	@GetMapping("/loginHistory")
	@SuppressWarnings("unchecked")
	public String getLoginHistory(Model model
											 ,@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage) {
		
		Map<String, Object> paramMap = memberService.getLoginHistory(currentPage);
		int lastPage = (int) paramMap.get("lastPage");
		List<LoginHistory> loginHistory = (List<LoginHistory>) paramMap.get("loginHistory");
		int startPageNum = (int) paramMap.get("startPageNum");
		int endPageNum = (int) paramMap.get("endPageNum");
		
		model.addAttribute("title", "로그인이력");
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("loginHistory", loginHistory);
		model.addAttribute("lastPage", lastPage);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);
		
		return "member/login/loginHistory";
	}



	//아이디 중복체크 처리
	@RequestMapping(value="/checkId", method= {RequestMethod.GET})
	@ResponseBody
	public HashMap<String, String> checkId(@RequestParam Map<String, Object> param) {
		
		HashMap<String, String> data = new HashMap<String, String>();
		
		String memId = (String) param.get("memId");
		log.info("memId :{}", memId);
		int result=memberService.checkId(memId);
		
		if(result == 1) {
			data.put("result", "성공");
		}else {
			data.put("result", "실패");
		}
		
		return data;
	}
	

	
    // 회원가입 처리
    @PostMapping("/addMember")
    public String addMember(MMember mmember){
    	
        log.info("회원가입 :{}", mmember);
        
        memberService.addMember(mmember);

        return "redirect:/main";
    }
    
	//회원가입 화면
	@GetMapping("/addMember")
    public String addMember(Model model) {
		
        model.addAttribute("title","회원가입");
        
        return "member/member/add_member";
    }

    
    //특정 회원 개인 정보 수정 처리
    @PostMapping("/modifyMemberInfo")
    public String modifyMemberInfo(MMember mmember) {
    	memberService.modifyMemberInfo(mmember);
    	
    	return "redirect:/myPage";
    }
    
    
    //특정 회원 개인 정보 수정 화면
    @GetMapping("/modifyMemberInfo")
    public String modifyMemberInfo(HttpSession session
    								,Model model){
    	
    	LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
    	String memId = (String) session.getAttribute("SID");
    	log.info("Id : {}", memId);
    	MMember mmember = memberService.getMemberInfo(loginInfo.getLoginLogoutId());
    	memberService.MemberList(memId);
    	
    	model.addAttribute("title", "특정 회원 정보 수정");
    	model.addAttribute("modifyMemberInfo", mmember);
    	
    	return "member/member/modify_member_info";
    }
    
    //특정 회원 상세 조회 화면
    @GetMapping("/memberInfo")
    public String memberInfo(@RequestParam(value="memId") String memId
    		,Model model) {
    	
    	MMember memberInfo = memberService.getMemberInfo(memId);
    	
    	model.addAttribute("title", "상세 회원 조회");
    	model.addAttribute("memberInfo", memberInfo);
    	
    	return "member/member/memberInfo";
    }


	//회원 개인 목록 조회
//	@GetMapping("/memberList")
//	public String memberList(Model model) {
		
//		List<MMember> memberList = memberService.MemberList();
//		model.addAttribute("title", "회원 개인 정보 조회");
//		model.addAttribute("memberList", memberList);
//		return  "member/member/member_list";		
//	}
	
	
	
	
	
	
	
	
	
    
    

	
	@GetMapping("/findId")
	public String findId(Model model) {
		model.addAttribute("title", "아이디 찾기");
		return  "member/member/find_id";		
	}
	
	@GetMapping("/findPw")
	public String findPw(Model model) {
		model.addAttribute("title", "비밀번호 찾기");
		return  "member/member/find_pw";		
	}
	
	@GetMapping("/findIdResult")
	public String findIdResult(Model model) {
		model.addAttribute("title", "아이디 찾기 결과");
		return  "member/member/find_id_result";		
	}
	
	@GetMapping("/findPwResult")
	public String findPwResult(Model model) {
		model.addAttribute("title", "비밀번호 찾기 결과");
		return  "member/member/find_pw_result";		
	}	
	
}
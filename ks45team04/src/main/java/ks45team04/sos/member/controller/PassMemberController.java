package ks45team04.sos.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import ks45team04.sos.member.dto.LoginInfo;
import ks45team04.sos.member.dto.MPassMember;
import ks45team04.sos.member.service.MPassMemberService;

@Controller
public class PassMemberController {
	private static final Logger log = LoggerFactory.getLogger(ChallengeController.class);
	
	private final MPassMemberService mPassMemberService;
	
	public PassMemberController(MPassMemberService mPassMemberService) {
		this.mPassMemberService = mPassMemberService;
	}
	@GetMapping("/passMemberRequest")
	public String passMemberRequest(Model model) {
		model.addAttribute("title", "합격회원 인증 신청 화면");
		return  "member/passMember/pass_member_request";		
	}

	//합격 인증 여부 조회
	@GetMapping("/passMemberList")
	public String passMemberList(HttpSession session
								,@RequestParam(value="memId", required = false) String memId
								,Model model) {
		
	    LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
	    String pmId = (String) session.getAttribute("SID");
	    
	    List<MPassMember> PassMemberList = mPassMemberService.PassMemberList(loginInfo.getLoginLogoutId());
	    
		model.addAttribute("title", "합격회원 승인 여부 조회 화면");
		model.addAttribute("passMemberList", PassMemberList);
		
		log.info("passMemberList : {}", PassMemberList);
		return  "member/passMember/pass_member_list";		
	}	
	
	
}
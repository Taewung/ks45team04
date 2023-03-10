package ks45team04.sos.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.member.dto.ChallengeFinish;
import ks45team04.sos.member.dto.ChallengeGoal;
import ks45team04.sos.member.dto.ChallengeState;
import ks45team04.sos.member.dto.LoginInfo;
import ks45team04.sos.member.service.ChallengeService;

@Controller
public class ChallengeController {
	private static final Logger log = LoggerFactory.getLogger(ChallengeController.class);

	private final ChallengeService challengeService;

	public ChallengeController(ChallengeService challengeService) {
		this.challengeService = challengeService;
	}

	// 특정 회원 챌린지 도전 내역 화면
//	@GetMapping("/challengeState")
//	public String challengeState(@RequestParam(value="memId") String memId
	//							,Model model) {
	//	ChallengeState challengeState = challengeService.getChallengeState(memId);
		
//		 model.addAttribute("title", "챌린지 회원 도전 내역 조회");
//		 model.addAttribute("challengeState", challengeState);
		
//		 return "member/challenge/challengeState";
//	}
	

		//챌린지 결과 조회
		@GetMapping("/challengeFinish")
		public String challengeFinish(HttpSession session,
										@RequestParam(value="cgCode", required = false)String cfCgCode,
										Model model) {
			
		    //LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
		    //String cfId = (String) session.getAttribute("SID");
		    
		    ChallengeFinish challengeFinish = challengeService.challengeFinish(cfCgCode);
		    
			model.addAttribute("title", "챌린지 이력");
			model.addAttribute("challengeFinish", challengeFinish);
			log.info("ChallengeFinish : {}", challengeFinish);
			return "member/challenge/challenge_finish";
			}
	
	
	
	
	
		//챌린지 도전내역 조회
		@GetMapping("/challengeHistory")
		public String challengeHistory(HttpSession session,
										@RequestParam(value="memId", required = false) String memId
										,Model model) {
		
	    LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
	    String cgId = (String) session.getAttribute("SID");
	    
		List<ChallengeGoal> ChallengeHistory = challengeService.ChallengeHistory(loginInfo.getLoginLogoutId());
		
		
		model.addAttribute("title", "챌린지 이력");
		model.addAttribute("ChallengeHistory", ChallengeHistory);
		log.info("challengeHistory : {}", ChallengeHistory);
		return "member/challenge/challenge_history";
		}
	
	
	
	
	  // 특정 과목정보 조회
	  @GetMapping("/getSubjectInfoForChallenge")
	  @ResponseBody
	  public LicenseSubject getSubjectInfoForChallenge (@RequestParam(value="lsCode") String lsCode){
		  LicenseSubject subjectInfoForChallenge =  challengeService.getSubjectInfoForChallenge(lsCode);
		  log.info("특정 과목정보 조회 : {}", subjectInfoForChallenge);
		  return subjectInfoForChallenge;
	  	} 
	  
	  // 자격증별 과목목록 조회
	  @GetMapping("/getSubjectListForChallenge")
	  @ResponseBody
	  public List<LicenseSubject> getSubjectListForChallenge (@RequestParam(value="liCode") String liCode){
		  List<LicenseSubject> subjectListForChallenge = challengeService.getSubjectListForChallenge(liCode);
		  log.info("자격증별 과목목록 조회 : {}", subjectListForChallenge);
		  return subjectListForChallenge;
	  	}
	  
	  
	  // 중분류별 자격증목록 조회
	  @GetMapping("/getLicenseListForChallenge")
	  @ResponseBody
	  public List<LicenseInfo> getLicenseListForChallenge (@RequestParam(value="lscCode") String lscCode){
		  List<LicenseInfo> liListForChallenge = challengeService.getLiListForChallenge(lscCode);
		  log.info("중분류별 자격증목록 조회 : {}", liListForChallenge);
		  return liListForChallenge;
	  	}
	  
	  // 대분류별 중분류 조회
	  @GetMapping("/getSubListForChallenge")
	  @ResponseBody 
	  	public List<LicenseSub> getSubListForChallenge (@RequestParam(value="lmcCode") String lmcCode){ List<LicenseSub>
	  		subListForChallenge = challengeService.getSubListForChallenge(lmcCode);
	  		log.info("대분류별 중분류목록 조회 : {}", subListForChallenge);
	  		return subListForChallenge;
	  	}
	  
	  
	  //챌린지 목표 등록 처리
	  @PostMapping("/challengeGoal")
	  public String challengeGoal(ChallengeGoal challengeGoal) {
		 //cgCode 자동생성
	  String newCgCode = challengeService.getNewCgCode("cg", "cg_code");
	  challengeGoal.setCgId("id005");
	  challengeGoal.setCgCode(newCgCode);
	  challengeService.challengeGoal(challengeGoal);
	  log.info("챌린지 목표 등록 쿼리파라미터 : {}", challengeGoal);
	  return "redirect:/challengeState";
	  }
	 

	// 챌린지 목표 등록 화면
	@GetMapping("/challengeGoal")
	public String challengeGoal(HttpSession session,
								@RequestParam(value="memId", required = false) String memId
								,Model model) {
		// 대분류 목록조회
		List<LicenseMain> mainListForChallenge = challengeService.getMainListForChallenge();
		model.addAttribute("title", "챌린지 도전 및 목표 등록");
		log.info("mainListForChallenge : {}", mainListForChallenge);
		model.addAttribute("mainListForChallenge", mainListForChallenge);
		return "member/challenge/challenge_goal";
	}

	
	

}
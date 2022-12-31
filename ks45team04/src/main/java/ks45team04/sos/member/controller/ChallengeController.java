package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChallengeController {
	
	@GetMapping("/challengeGoal")
	public String challengeGoal(Model model) {
		model.addAttribute("title", "챌린지 도전 및 목표 등록");
		return  "member/challenge/challenge_goal";		
	}	

	@GetMapping("/challengeState")
	public String challengeState(Model model) {
		model.addAttribute("title", "챌린지 수행 내역 및 진행 상태 조회");
		return  "member/challenge/challenge_state";		
	}	
	
	@GetMapping("/challengeResult")
	public String challengeResult(Model model) {
		model.addAttribute("title", "챌린지 결과 조회");
		return  "member/challenge/challenge_result";		
	}		

	@GetMapping("/challengeDataCal")
	public String challengeDataCal(Model model) {
		model.addAttribute("title", "챌린지 진행 일수 계산");
		return  "member/challenge/challenge_data_cal";		
	}
	
	@GetMapping("/challengeHistory")
	public String challengeHistory(Model model) {
		model.addAttribute("title", "개인 챌린지 도전 내역 조회");
		return  "member/challenge/challenge_history";		
	}

	@GetMapping("/challengeSuccessorfailuerState")
	public String challengeSuccessorfailuerState(Model model) {
		model.addAttribute("title", "챌린지 성공 여부 확인");
		return  "member/challenge/challenge_succesorfailuer_state";		
	}
	
}
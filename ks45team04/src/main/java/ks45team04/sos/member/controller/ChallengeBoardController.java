package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/challengeBoard") //큰폴더명
public class ChallengeBoardController {

	@GetMapping("/challengeBoardList")
	public String challengeBoardList(Model model) {
		model.addAttribute("title", "챌린지 인증글 전체 목록 조회");
		return  "member/challengeBoard/challenge_board_list";		
	}	

	@GetMapping("/challengeBoardWrite")
	public String challengeBoardWrite(Model model) {
		model.addAttribute("title", "챌린지 인증 글쓰기 및 수정");
		return  "member/challengeBoard/challenge_board_write";		
	}	
	
}
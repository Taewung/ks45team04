package ks45team04.sos.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks45team04.sos.admin.dto.CheatMember;
import ks45team04.sos.admin.mapper.AdminCheatMemberMapper;
import ks45team04.sos.admin.service.CheatMemberService;

@Controller
public class ACheatMemberController {

private final CheatMemberService cheatMemberService;
private final AdminCheatMemberMapper cheatMemberMapper;

public ACheatMemberController(@Qualifier("adminChaetMemberService") CheatMemberService cheatMemberService,
							AdminCheatMemberMapper cheatMemberMapper) {
	this.cheatMemberService = cheatMemberService;
	this.cheatMemberMapper = cheatMemberMapper;
}
	
private static final Logger log = LoggerFactory.getLogger(ACheatMemberController.class);


 	// 부정회원 목록 조회 화면
	@GetMapping("/cheatMemberList")
	public String cheatMemberList(Model model) {
		
		List<CheatMember> cheatMemberList = cheatMemberService.CheatMemberList();
		model.addAttribute("title", "부정 회원 조회");
		model.addAttribute("cheatMemberList", cheatMemberList);
		log.info("cheatMemberList :{}", cheatMemberList);
		return  "admin/cheatMember/cheat_member_list";
	}	

	// 부정회원 신고 화면
	@GetMapping("/cheatMemberJudge")
	public String cheatMemberJudge(Model model) {
		model.addAttribute("title", "부정 회원 심사");
		return  "admin/cheatMember/cheat_member_judge";		
	}
	
	// 부정회원 신고 처리
	@PostMapping("/cheatMemberJudge")
	public String cheatMemberJudge(CheatMember CheatMember) {
		System.out.println(CheatMember);
		cheatMemberService.addCheatMember(CheatMember);
		
		return "redirect:/cheatMemberList";
	}
	
	
	
	
	
	
	
	
	
	public AdminCheatMemberMapper getCheatMemberMapper() {
		return cheatMemberMapper;
	}
	
}
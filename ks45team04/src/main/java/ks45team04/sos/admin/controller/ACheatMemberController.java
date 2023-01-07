package ks45team04.sos.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


	//특정 부정회원 정보 수정 처리
	@PostMapping("/totalModifyCheatMemberInfo")
	public String modifyCheatMemberInfo(CheatMember cheatMember) {
		
		cheatMemberService.modifyCheatMemberInfo(cheatMember);
		
		return "redirect:/cheatMemberList";
	}


	//특정 부정회원 정보 수정 화면
	@GetMapping("/totalModifyCheatMemberInfo")
	public String modifyCheatMemberInfo(@RequestParam(value="cmId") String cmId
										,Model model) {
	CheatMember cheatMember = cheatMemberService.getTotalCheatMemberInfo(cmId);
	
	model.addAttribute("title", "특정 부정회원 정보 수정");
	model.addAttribute("totalModifyCheatMemberInfo", cheatMember);
	
	return "admin/cheatMember/total_modify_cheat_member_info";
	}

	//특정 부정회원 상세 조회 화면
	@GetMapping("/totalCheatMemberInfo")
	public String totalCheatMemberInfo(@RequestParam(value="cmId") String cmId
			,Model model) {
	CheatMember toalCheatMemberInfo = cheatMemberService.getTotalCheatMemberInfo(cmId);
	
	model.addAttribute("title", "부정회원 상세 조회");
	model.addAttribute("totalCheatMemberInfo", toalCheatMemberInfo);
	
	return "admin/cheatMember/total_cheat_member_info";
	}
	
	
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
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

import ks45team04.sos.admin.dto.PassMember;
import ks45team04.sos.admin.mapper.AdminPassMemberMapper;
import ks45team04.sos.admin.service.PassMemberService;

@Controller
public class APassMemberController {

private final PassMemberService passMemberService;
private final AdminPassMemberMapper passMemberMapper;

public APassMemberController(@Qualifier("adminPassMemberService") PassMemberService passMemberService,
							AdminPassMemberMapper passMemberMapper) {
	this.passMemberService = passMemberService;
	this.passMemberMapper = passMemberMapper;
}

private static final Logger log = LoggerFactory.getLogger(APassMemberController.class);


	// 특정 합격 회원 정보 수정 처리
	@PostMapping("/totalModifyPassMemberInfo")
	public String modifyPassMemberInfo(PassMember passMember) {
		
		passMemberService.modifyPassMemberInfo(passMember);
		
		return "redirect:/totalPassMemberList";
	}


	// 특정 합격 회원 정보 수정 화면
	@GetMapping("/totalModifyPassMemberInfo")
	public String modifyMemberInfo(@RequestParam(value="pmId") String pmId
									,Model model) {
		PassMember passMember = passMemberService.getTotalPassMemberInfo(pmId);
		
		model.addAttribute("title", "합격 회원 정보 수정 화면");
		model.addAttribute("totalModifyPassMemberInfo", passMember);
		
		return "admin/passMember/total_modify_pass_member_info";
	}



	//합격 회원 상세 조회 화면
	@GetMapping("/totalPassMemberInfo")
	public String totalPassMemberInfo(@RequestParam(value="pmId") String pmId
			,Model model) {
		
		PassMember totalPassMemberInfo = passMemberService.getTotalPassMemberInfo(pmId);
		
		model.addAttribute("title", "상세 합격 회원 조회");
		model.addAttribute("totalPassMemberInfo", totalPassMemberInfo);
		
		return "admin/passMember/total_pass_member_info";
	}


	//합격 회원 목록 조회
	@GetMapping("/totalPassMemberList")
	public String passMemberList(Model model) {
		
		List<PassMember> passMemberList = passMemberService.PassMemberList();
		model.addAttribute("title", "합격 인증 멤버 조회");
		model.addAttribute("passMemberList", passMemberList);
		log.info("passMemberList :{}", passMemberList);
		return "admin/passMember/total_pass_member_list";
	}
	
	@GetMapping("/passMemberJudge")
	public String passMemberJudge(Model model) {
		model.addAttribute("title", "합격 인증 신청 회원 심사");
				return "admin/passMember/pass_member_judge";
	}
	
	public AdminPassMemberMapper getPassMemberMapper() {
		return passMemberMapper;
	}
}

package ks45team04.sos.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

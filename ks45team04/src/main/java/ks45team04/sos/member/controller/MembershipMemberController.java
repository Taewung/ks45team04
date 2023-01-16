package ks45team04.sos.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks45team04.sos.member.dto.MMembershipMember;
import ks45team04.sos.member.mapper.MMembershipMemberMapper;
import ks45team04.sos.member.service.MMembershipMemberService;

@Controller
public class MembershipMemberController {
	
	private final MMembershipMemberService membershipMemberService;
	private final MMembershipMemberMapper mmembershipMemberMapper;
	
	public MembershipMemberController(@Qualifier("MembershipMemberService") MMembershipMemberService mmembershipMemberService,
									MMembershipMemberMapper membershipMemberMapper) {
		
			this.mmembershipMemberMapper = membershipMemberMapper;
			this.membershipMemberService = mmembershipMemberService;
	}
		
	private static final Logger log = LoggerFactory.getLogger(MembershipMemberController.class);
	
	
	//조회
	@GetMapping("/membershipMemberList")
	public String MembershipMemberList(Model model) {
		
		List<MMembershipMember> mmembershipMemberList =  membershipMemberService.MembershipMemberList();
				
		model.addAttribute("title", "멤버십 회원 조회");
		model.addAttribute("mmembershipMemberList", mmembershipMemberList);

		log.info("mmembershipMemberList : {}", mmembershipMemberList);
		
		return "member/membershipMember/membership_member_list";
	}
	
	
	
	@GetMapping("/totalMembershipRequest")
	public String totalMembershipRequest(Model model) {
		model.addAttribute("title", "멤버십 신청");

		return "membershipMember/membership_request";

	}
	
}
package ks45team04.sos.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import ks45team04.sos.member.dto.LoginInfo;
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
	public String MembershipMemberList(HttpSession session
										,@RequestParam(value="memId", required = false)String memId
										,Model model) {

	    LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
	    String mmsId = (String) session.getAttribute("SID");
		
		List<MMembershipMember> MembershipMemberList = membershipMemberService.MembershipMemberList(mmsId);
				
		model.addAttribute("title", "멤버십 회원 조회");
		model.addAttribute("mmembershipMemberList", MembershipMemberList);

		log.info("mmembershipMemberList : {}", MembershipMemberList);
		
		return "member/membershipMember/membership_member_list";
	}
	
	
	
	@GetMapping("/totalMembershipRequest")
	public String totalMembershipRequest(Model model) {
		model.addAttribute("title", "멤버십 신청");

		return "membershipMember/membership_request";

	}
	
}
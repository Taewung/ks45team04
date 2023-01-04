package ks45team04.sos.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks45team04.sos.admin.dto.WithdrawalMember;
import ks45team04.sos.admin.mapper.WithdrawalMemberMapper;
import ks45team04.sos.admin.service.WithdrawalMemberService;

@Controller
public class AWithdrawalMemberController {
	
	private final WithdrawalMemberService withdrawalMemberService;
	private final WithdrawalMemberMapper withdrawalMemberMapper;

	public AWithdrawalMemberController (WithdrawalMemberService withdrawalMemverService,
										WithdrawalMemberMapper withdrawalMemberMapper) {
					this.withdrawalMemberService = withdrawalMemverService;
					this.withdrawalMemberMapper = withdrawalMemberMapper;
				}
		private static final Logger log = LoggerFactory.getLogger(AWithdrawalMemberController.class);
	
	@GetMapping("/withdrawalMemberList")
	public String withdrawalMemberList(Model model) {
		List<WithdrawalMember> withdrawalMemberList = withdrawalMemberService.WithdrawalMemberList();
		model.addAttribute("title", "전체 회원 목록");
		model.addAttribute("withdrawalMemberList", withdrawalMemberList);
		log.info("withdrawalmemberList : {}", withdrawalMemberList);
		return  "admin/withdrawalMember/withdrawal_member_list";
	}
	
	
}

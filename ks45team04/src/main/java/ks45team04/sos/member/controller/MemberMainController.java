package ks45team04.sos.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
import ks45team04.sos.member.dto.LoginInfo;
import ks45team04.sos.member.dto.MCheatMember;
import ks45team04.sos.member.service.MCheatMemberService;

@Controller
public class MemberMainController {
	
	private static final Logger log = LoggerFactory.getLogger(MemberMainController.class);
	
	private final MCheatMemberService mCheatMemberService;
	
	public MemberMainController(MCheatMemberService mCheatMemberService) {
		this.mCheatMemberService = mCheatMemberService;
	}
	
	@GetMapping("/main")
	public String memberMain(Model model, HttpSession session) {
		model.addAttribute("title", "메인화면");
		LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
		log.info("login info : {} ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", loginInfo);
		return "member/main";
	}
	@GetMapping("/myPage")
	public String myPage(Model model) {
		model.addAttribute("title", "메인화면");
		return "member/myPage";
	}
	@GetMapping("/customerCenter")
	public String customerCenter(Model model) {
		model.addAttribute("title", "고객센터");
		return "member/customerCenter";
	}
	@PostMapping("/customerCenter")
	public String customerCenter(@RequestPart(name = "cheatFiles", required = false) MultipartFile[] uploadfile
								,MCheatMember mCheatMember) {
		//model.addAttribute("title", "고객센터");
		
		log.info("uploadfile : {}", uploadfile[0]);
		log.info("mCheatMember : {}",mCheatMember);
		
		mCheatMemberService.cheatRequest(uploadfile, mCheatMember);
		
		return "redirect:/customerCenter";
	}
}
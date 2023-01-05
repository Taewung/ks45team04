package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.admin.service.QuestionSettingService;

@Controller
public class QuestionSettingController {
	
	private final QuestionSettingService questionSettingService;
	
	public QuestionSettingController(QuestionSettingService questionSettingService) {
		this.questionSettingService = questionSettingService;
	}

	@GetMapping("/addQSetting")
	public String addQSetting(Model model) {
		model.addAttribute("title", "문제요소등록");
		return "admin/questionSetting/add_q_setting";
	}
	@GetMapping("/checkQSetting")
	public String checkQSetting(Model model) {
		model.addAttribute("title", "문제요소상세정보");
		return "admin/questionSetting/check_q_setting";
	}
	@GetMapping("/modifyQSetting")
	public String modifyQSetting(Model model) {
		model.addAttribute("title", "문제요소수정");
		return "admin/questionSetting/modify_q_setting";
	}
	
	
	
	// 문제 목록조회
	@GetMapping("/qSettingList")
	public String qSettingList(Model model) {
		List<Question> questionList = questionSettingService.getQuestionList();
		model.addAttribute("questionList", questionList);
		model.addAttribute("title", "문제목록");
		return "admin/questionSetting/q_setting_list";
	}
}
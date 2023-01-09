package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.admin.service.QuestionSettingService;

@Controller
public class QuestionSettingController {
	
	private final QuestionSettingService questionSettingService;
	
	public QuestionSettingController(QuestionSettingService questionSettingService) {
		this.questionSettingService = questionSettingService;
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
	
	// 문제요소등록
	@GetMapping("/addQSetting")
	public String addQSetting(Model model) {
		model.addAttribute("title", "문제요소등록");
		List<LicenseMain> licenseMainListForQSet = questionSettingService.getLicenseMainListForQSet();
		model.addAttribute("licenseMainListForQSet", licenseMainListForQSet);
		return "admin/questionSetting/add_q_setting";
	}
	// 자격증별 과목목록 조회
	@GetMapping("/getSubjectCategoryForQSet")
	@ResponseBody
	public List<LicenseSubject> getSubjectListForQSet (@RequestParam(value="liCode") String liCode){
		List<LicenseSubject> subjectListForQSet = questionSettingService.getSubjectListForQSet(liCode);
		System.out.println(subjectListForQSet+"<------------------------------------subjectListForQSet");
		return subjectListForQSet;
	}	
	// 중분류별 자격증목록 조회
	@GetMapping("/getLicenseCategoryForQSet")
	@ResponseBody
	public List<LicenseInfo> getLicenseCategoryForQSet (@RequestParam(value="lscCode") String lscCode){
		List<LicenseInfo> licenseListForQSet = questionSettingService.getLicenseListForQSet(lscCode);
		return licenseListForQSet;
	}	
	// 대분류별 중분류 조회
	@GetMapping("/getLicenseSubCategoryForQSet")
	@ResponseBody
	public List<LicenseSub> getLicenseSubCategoryForQSet (@RequestParam(value="lmcCode") String lmcCode){
		List<LicenseSub> licenseSubListForQSet = questionSettingService.getLicenseSubListForQSet(lmcCode);
		return licenseSubListForQSet;
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
package ks45team04.sos.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.SubjectPassScore;
import ks45team04.sos.admin.service.LicensePassScoreService;
import ks45team04.sos.admin.service.LicenseSubjectService;
import ks45team04.sos.admin.service.SubjectPassScoreService;

@Controller
public class PassScoreController {
	
	private static final Logger log = LoggerFactory.getLogger(PassScoreController.class);
	
	private final LicensePassScoreService licensePassScoreService;
	private final SubjectPassScoreService subjectPassScoreService;
	
	public PassScoreController(LicensePassScoreService licensePassScoreService
							  ,SubjectPassScoreService subjectPassScoreService) {
		this.licensePassScoreService = licensePassScoreService;
		this.subjectPassScoreService = subjectPassScoreService;
	}
	
	/* ***************************과목합격기준점수******************************** */
	// 특정 과목합격기준점수 수정화면
	@GetMapping("/modifySubjectPassScore")
	public String modifySubjectPassScore(Model model, @RequestParam(value="lsPScoreCode", required=false) String lsPScoreCode) {
		SubjectPassScore subjectPassScoreByCode = subjectPassScoreService.getSubjectPassScoreByCode(lsPScoreCode);
		model.addAttribute("subjectPassScoreByCode", subjectPassScoreByCode);
		model.addAttribute("title", "과목합격기준점수 수정");
		log.info("특정 과목합격기준점수 조회 : {}", subjectPassScoreByCode);
		return "admin/passScore/modify_subject_pass_score";
	}
	// 특정 과목합격기준점수 수정
	@PostMapping("/modifySubjectPassScore")
	public String modifySubjectPassScore(SubjectPassScore subjectPassScore) {	
		subjectPassScore.setLsPScoreRegId("id002");
		subjectPassScoreService.modifySubjectPassScore(subjectPassScore);
		log.info("특정 과목합격기준점수 수정 : {}", subjectPassScore);	
		return "redirect:/subjectPassScoreList?liCode=${liCode}";
	}
	// 과목합격기준점수 등록처리
	@PostMapping("/addSubjectPassScore")
	public String addSubjectPassScore(SubjectPassScore subjectPassScore) {
		// lsPScoreCode 자동생성
		String newLsPScoreCode = subjectPassScoreService.getNewLsPScoreCode("subject_pass_score", "ls_p_score_code");
		subjectPassScore.setLsPScoreRegId("id002");
		subjectPassScore.setLsPScoreCode(newLsPScoreCode);
		subjectPassScoreService.addSubjectPassScore(subjectPassScore);
		log.info("과목합격기준점수등록 쿼리파라미터: {}", subjectPassScore);
		String liCode = subjectPassScore.getLiCode();
		return "redirect:/subjectPassScoreList?liCode="+liCode;
	}
	// 과목합격기준점수 등록화면
	@GetMapping("/addSubjectPassScore")
	public String addSubjectPassScore(Model model, @RequestParam(value="liCode", required=false) String liCode) {
		LicensePassScore liInfoForLsPScore = subjectPassScoreService.getLiInfoForLsPScore(liCode);
		List<LicenseSubject> liSubListForLsPScore = subjectPassScoreService.getLiSubListForLsPScore(liCode);
		model.addAttribute("liSubListForLsPScore", liSubListForLsPScore);
		model.addAttribute("liInfoForLsPScore", liInfoForLsPScore);
		model.addAttribute("title", "합격기준점수 등록");
		log.info("특정 자격증정보 조회 : {}", liInfoForLsPScore);	
		log.info("특정 자격증 과목목록 조회 : {}", liSubListForLsPScore);	
		
		return "admin/passScore/add_subject_pass_score";
	}
	// 특정 자격증 과목정보 조회
	@GetMapping("/getLsInfoForLsPScore")
	@ResponseBody
	public LicenseSubject getLsInfoForLsPScore(@RequestParam(value="lsCode") String lsCode) {
		LicenseSubject lsInfoForLsPScore = subjectPassScoreService.getLsInfoForLsPScore(lsCode);
		log.info("특정 과목정보 조회 : {}", lsInfoForLsPScore);
		return lsInfoForLsPScore;
	}
	// 자격증별 과목합격기준점수목록 조회
	@GetMapping("/subjectPassScoreList")
	public String getsubjectPassScoreList(Model model, @RequestParam(value="liCode", required=false) String liCode) {
		List<SubjectPassScore> subjectPassScoreList = subjectPassScoreService.getsubjectPassScoreList(liCode); 
		SubjectPassScore liCodeForLsPScore = subjectPassScoreService.getLiCodeForLsPScore(liCode);
		model.addAttribute("liCodeForLsPScore", liCodeForLsPScore);
		model.addAttribute("subjectPassScoreList", subjectPassScoreList);
		model.addAttribute("title", "과목별 합격기준점수 목록");	
		log.info("자격증정보 : {}", liCodeForLsPScore);
		log.info("과목합격기준점수목록 : {}", liCode);
	return "admin/passScore/subject_pass_score_list";
	}
	// 자격증별 합격기준점수 상세정보 조회
	@GetMapping("/checkLicensePassScore")
	public String checkLicensePassScore(@RequestParam(value="liPScoreCode", required=false) String liPScoreCode
										,Model model) {
		LicensePassScore licensePassScoreByCode = licensePassScoreService.getLicensePassScoreByCode(liPScoreCode);
		model.addAttribute("title", "자격증합격점수상세조회");
		model.addAttribute("licensePassScoreByCode", licensePassScoreByCode);
		return "admin/passScore/check_license_pass_score";
	}
	
	/* ***************************자격증합격기준점수******************************** */
	
	// 특정 자격증합격기준점수 수정
	@PostMapping("/modifyLicensePassScore")
	public String modifyLicensePassScore(LicensePassScore licensePassScore) {	
		licensePassScore.setLiPScoreRegId("id003");
		log.info("특정 자격증합격기준점수 : {}", licensePassScore);		
		licensePassScoreService.modifyLicensePassScore(licensePassScore);	
		return "redirect:/licensePassScoreList";
	}
	// 특정 자격증합격기준점수 수정화면
	@GetMapping("/modifyLicensePassScore")
	public String modifyLicensePassScore(@RequestParam(value="liPScoreCode", required=false) String liPScoreCode
										 ,Model model) {
		
		LicensePassScore licensePassScoreByCode = licensePassScoreService.getLicensePassScoreByCode(liPScoreCode);
		model.addAttribute("title", "특정자격증합격기준점수 수정");
		model.addAttribute("licensePassScoreByCode", licensePassScoreByCode);
		
		return "admin/passScore/modify_license_pass_score";
	}
	// 자격증별 합격기준점수 등록
	@PostMapping("/addLicensePassScore")
	public String addLicensePassScore(LicensePassScore licensePassScore) {
			
	   //테이블명과 pk 자동 완성 할 컬럼명 입력 후 pk조회 후 DTO 셋팅 후 -> 입력처리 하면 된다
	   String newLiPScoreCode = licensePassScoreService.getNewLiPassScoreCode("license_pass_score", "li_p_score_code");
	   licensePassScore.setLiPScoreRegId("id003");
	   licensePassScore.setLiPScoreCode(newLiPScoreCode);
	   log.info("자격증별 합격기준 등록 쿼리파라미터: {}", licensePassScore);
	   licensePassScoreService.addLicensePassScore(licensePassScore);
	   return "redirect:/licensePassScoreList";		
	}	
	// 자격증별 합격기준점수 등록
	@GetMapping("/addLicensePassScore")
	public String addLicensePassScore(Model model) {
		List<LicenseMain> licenseMainList = licensePassScoreService.getLicenseMainList();
		model.addAttribute("licenseMainList", licenseMainList);
		return "admin/passScore/add_license_pass_score";
	}
	// 중분류별 자격증목록 조회
	@GetMapping("/getLicenseCategory")
	@ResponseBody
	public List<LicenseInfo> getLicenseCategory (@RequestParam(value="lscCode") String lscCode){
		List<LicenseInfo> licenseList = licensePassScoreService.getLicenseList(lscCode);
		return licenseList;
	}	
	// 대분류별 중분류 조회
	@GetMapping("/getLicenseSubCategory")
	@ResponseBody
	public List<LicenseSub> getLicenseSubCategory (@RequestParam(value="lmcCode") String lmcCode){
		List<LicenseSub> licenseSubList = licensePassScoreService.getLicenseSubList(lmcCode);
		return licenseSubList;
	}	
	// 자격증 합격기준점수목록 조회
	@GetMapping("/licensePassScoreList")
	public String licensePassScoreList(Model model
									  ,@RequestParam(value="searchKey", required = false) String searchKey
									  ,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue) {
		List<LicensePassScore> licensePassScoreList = licensePassScoreService.getLicensePassScoreList(searchKey, searchValue);		
		model.addAttribute("licensePassScoreList", licensePassScoreList);
		model.addAttribute("title", "자격증별 합격기준점수 목록");	
		return "admin/passScore/license_pass_score_list";
	}
}
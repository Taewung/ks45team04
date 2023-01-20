package ks45team04.sos.member.controller;

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
import ks45team04.sos.member.service.MLicenseInfoService;

@Controller

public class LicenseMainPageController {
	private MLicenseInfoService mLicenseInfoService;
	
	public LicenseMainPageController(MLicenseInfoService mLicenseInfoService) {
		
		this.mLicenseInfoService = mLicenseInfoService;
	}
	
	

	
	// 자격증 정보 상세보기 화면
	@GetMapping("/licenseInfoDetail")
	public String licenseInfoDetail(@RequestParam(value="liCode") String liCode
									,Model model) {
		
		List<LicenseInfo> licenseInfoList = mLicenseInfoService.getLicenseInfo(liCode);
		
		
		
		String licenseInfoListLiName = licenseInfoList.get(0).getLiName();
		String licenseInfoListLimcName = licenseInfoList.get(0).getLmcName();
		String licenseInfoListLiscName = licenseInfoList.get(0).getLscName();
		String licenseInfoListLiOverview = licenseInfoList.get(0).getLiOverview();
		String licenseInfoListLiqualification = licenseInfoList.get(0).getLiQualification();
		String licenseInfoListLdPeriod = licenseInfoList.get(0).getLicenseDate().getLdPeriod();
		String licenseInfoListLdDate = licenseInfoList.get(0).getLicenseDate().getLdDate();
		String licenseInfoListLdAcceptanceDate = licenseInfoList.get(0).getLicenseDate().getLdAcceptanceDate();
		String licenseInfoListLdCost = licenseInfoList.get(0).getLicenseDate().getLdCost();
		String licenseInfoListImage = licenseInfoList.get(0).getLiImage();
		System.out.println(licenseInfoListImage);
		
		
		model.addAttribute("title", "자격증 상세보기 화면 조회");
		model.addAttribute("licenseInfoList", licenseInfoList);
		System.out.println(licenseInfoList);
		
		model.addAttribute("licenseInfoListLiName", licenseInfoListLiName);
		model.addAttribute("licenseInfoListLimcName", licenseInfoListLimcName);
		model.addAttribute("licenseInfoListLiscName", licenseInfoListLiscName);
		model.addAttribute("licenseInfoListLiOverview", licenseInfoListLiOverview);
		model.addAttribute("licenseInfoListLiqualification", licenseInfoListLiqualification);
		model.addAttribute("licenseInfoListLdPeriod", licenseInfoListLdPeriod);
		model.addAttribute("licenseInfoListLdDate", licenseInfoListLdDate);
		model.addAttribute("licenseInfoListLdAcceptanceDate", licenseInfoListLdAcceptanceDate);
		model.addAttribute("licenseInfoListLdCost", licenseInfoListLdCost);
		model.addAttribute("licenseInfoListImage", licenseInfoListImage);
		
		
		
		
		
		return "member/licenseInfo/license_info_detail";
	}
	
	
	
	// 중분류별 자격증목록 조회
	@GetMapping("/MLicenseCategory")
	@ResponseBody
	public List<LicenseInfo> getLicenseInfoList (@RequestParam(value="lscCode") String lscCode){
		
		List<LicenseInfo> licenseList = mLicenseInfoService.getLicenseInfoList(lscCode);
		
		return licenseList;
	}	
	

	
	// 대분류별 중분류 조회
	@GetMapping("/MLicenseSubCategory")
	@ResponseBody
	public List<LicenseSub> licenseSubList (@RequestParam(value="lmcCode") String lmcCode){
		
		List<LicenseSub> licenseSubList = mLicenseInfoService.getlicenseSubList(lmcCode);
		
		
		return licenseSubList;
	}	
	
	
	
	//자격증 메인페이지 
	@GetMapping("/licenseMain")
	public String licenseMain(Model model) {
		
		List<LicenseInfo> licenseInfoList = mLicenseInfoService.licenseInfoList();
		List<LicenseMain> licenseMainList = mLicenseInfoService.getlicenseMainList();

		model.addAttribute("title", "자격증 메인페이지");
		model.addAttribute("licenseInfoList", licenseInfoList);
		model.addAttribute("licenseMainList", licenseMainList);
		
		return "member/licenseMainPage/license_main_page";
	}
	
	
	
	
	
	
}

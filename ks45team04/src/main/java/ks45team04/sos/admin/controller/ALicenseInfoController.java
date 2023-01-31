package ks45team04.sos.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.mapper.LicenseInfoMapper;
import ks45team04.sos.admin.service.LicenseInfoService;


@Controller
public class ALicenseInfoController {
	
private final LicenseInfoService licenseInfoService;
private final LicenseInfoMapper licenseInfoMapper;
	
	public ALicenseInfoController(LicenseInfoService licenseInfoService
								 ,LicenseInfoMapper licenseInfoMapper) {
		
		this.licenseInfoService = licenseInfoService;
		this.licenseInfoMapper = licenseInfoMapper;
	}	
		
		// 자격증 정보 삭제 처리
			@PostMapping("/deletelicenseInfo")
			public String deletelicenseInfo(LicenseInfo LicenseInfo) {
				
				return "";
			}
		
		// 자격증 정보 삭제 화면
		@GetMapping("/deletelicenseInfo")
		public String deletelicenseInfo(Model model) {
			model.addAttribute("title", "자격증 대분류 정보 수정");
			
			return "admin/licenseInfo/license_info_delete";
		}
	
	
		//자격증 정보 수정 처리
		@PostMapping("/modifylicenseInfo")
		public String modifylicenseInfo(LicenseInfo LicenseInfo) {
			
			licenseInfoService.modifyLicenseInfo(LicenseInfo);
				
			return "redirect:/licenseInofoList";
		}
			
		// 자격증 정보 수정 화면
		@GetMapping("/modifylicenseInfo")
		public String modifylicenseInfo(@RequestParam(value="liCode") String liCode
										,Model model) {
			LicenseInfo licenseInfo = licenseInfoService.getLicenseInfoByCode(liCode);
			System.out.println(licenseInfo);
			
			
			model.addAttribute("title", "자격증 정보 수정");
			model.addAttribute("licenseInfo", licenseInfo);
				
			return "admin/licenseInfo/license_info_modify";
		}
		
		// 관리자 아이디 인증
		@GetMapping("/liCodeCheck")
		@ResponseBody
		public boolean idCheck(@RequestParam(value="inputId") String inputId) {
			
			boolean isChecked = licenseInfoMapper.getIdCheck(inputId);
			
			return isChecked;
		}
		
		//자격증 정보 등록 처리
		@PostMapping("/addlicenseInfo")
		
		public String addlicenseInfo(LicenseInfo LicenseInfo) {
			
			licenseInfoService.addLicenseInfo(LicenseInfo);
			
			return "redirect:/licenseInofoList";
		}
		
		
		// 자격증 대분류별 중분류 조회
		@GetMapping("/ALicenseSubCategory")
		@ResponseBody
		public List<LicenseSub> licenseSubList (@RequestParam(value="lmcCode") String lmcCode){
			
			List<LicenseSub> licenseSubList = licenseInfoService.licenseSubList(lmcCode);
			System.out.println(licenseSubList);
			
			
			return licenseSubList;
		}	
		
		// 자격증 정보 등록 화면
		@GetMapping("/addlicenseInfo")
		public String addlicenseInfo(Model model) {
			
			List<LicenseInfo> getLicenseInfoList = licenseInfoMapper.getLicenseInfoList();
			List<LicenseMain> licenseMainList = licenseInfoService.licenseMainList();
			System.out.println(licenseMainList);
			
			model.addAttribute("title", "자격증 정보 등록");
			model.addAttribute("getLicenseInfoList", getLicenseInfoList);
			model.addAttribute("licenseMainList", licenseMainList);
			
			
			return "admin/licenseInfo/license_info_insert";
		}
		
		// 자격증 정보 조회
		@GetMapping("/licenseInofoList")
		public String licenseInofoList(Model model
									  ,@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage
									  ,@RequestParam(value="searchKey", required = false) String searchKey
									  ,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue) {
			
			Map<String, Object> paramMap = licenseInfoService.licenseInfoList(currentPage, searchKey, searchValue);
			int lastPage = (int) paramMap.get("lastPage");
			List<LicenseInfo> licenseInfoList = (List<LicenseInfo>) paramMap.get("licenseInfoList");
			int startPageNum = (int) paramMap.get("startPageNum");
			int endPageNum = (int) paramMap.get("endPageNum");
			
			model.addAttribute("title", "자격증별 합격기준점수 목록");
			model.addAttribute("currentPage", currentPage);
			model.addAttribute("licenseInfoList", licenseInfoList);
			model.addAttribute("lastPage", lastPage);
			model.addAttribute("startPageNum", startPageNum);
			model.addAttribute("endPageNum", endPageNum);

			return "admin/licenseInfo/license_info_list";
		}

}

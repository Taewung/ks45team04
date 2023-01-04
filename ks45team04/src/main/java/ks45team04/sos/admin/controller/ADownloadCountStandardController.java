package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.DownloadCountStandard;
import ks45team04.sos.admin.mapper.DownloadCountStandardMapper;
import ks45team04.sos.admin.service.DownloadCountStandardService;





@Controller
public class ADownloadCountStandardController {
	
private final DownloadCountStandardService downloadCountStandardService;
private final DownloadCountStandardMapper downloadCountStandardMapper;
	
	public ADownloadCountStandardController(DownloadCountStandardService downloadCountStandardService
										   ,DownloadCountStandardMapper downloadCountStandardMapper) {
		
		this.downloadCountStandardService = downloadCountStandardService;
		this.downloadCountStandardMapper = downloadCountStandardMapper;
	}
	
		
		// 다운로드 횟수 기준 삭제 처리
		@PostMapping("/deletedownloadCountStandard")
		public String deletedownloadCountStandard(DownloadCountStandard DownloadCountStandard) {
					
			return "";
		}
		
		// 다운로드 횟수 기준 삭제 화면
		@GetMapping("/deletedownloadCountStandard")
		public String deletedownloadCountStandard(Model model) {
			model.addAttribute("title", "다운로드 횟수 기준 삭제 화면");
				
			return "admin/noteDownloadCountStandard/dwonload_count_standard_delete";
		}
	
		
		// 다운로드 횟수 기준 수정 처리
		@PostMapping("/modifydownloadCountStandard")
		public String modifydownloadCountStandard(DownloadCountStandard DownloadCountStandard) {
					
			return "";
		}
				
		// 다운로드 횟수 기준 수정 화면
		@GetMapping("/modifydownloadCountStandard")
		public String modifydownloadCountStandard(Model model) {
			model.addAttribute("title", "다운로드 횟수 기준 정보 수정");
				
			return "admin/noteDownloadCountStandard/dwonload_count_standard_modify";
		}
		
		// 관리자 인증
		@GetMapping("/dcsIdCheck")
		@ResponseBody
		public boolean idCheck(@RequestParam(value="inputId") String inputId) {
			
			boolean isChecked = downloadCountStandardMapper.getIdCheck(inputId);
			
			return isChecked;
		}
		
		
		// 다운로드 횟수 기준 등록 처리
		@PostMapping("/adddownloadCountStandard")
		public String adddownloadCountStandard(DownloadCountStandard downloadCountStandard) {
			
			downloadCountStandardService.addDownloadCountStandard(downloadCountStandard);
			
			return "redirect:/downloadCountStandardList";
		}
		
		// 다운로드 횟수 기준 등록 화면
		@GetMapping("/adddownloadCountStandard")
		public String adddownloadCountStandard(Model model) {
			
			List<DownloadCountStandard> downloadCountStandardList = downloadCountStandardMapper.DownloadCountStandardList();
			
			model.addAttribute("title", "다운로드 횟수 기준 등록");
			model.addAttribute("downloadCountStandardList", downloadCountStandardList);
			
			return "admin/noteDownloadCountStandard/dwonload_count_standard_insert";
		}
	
		
		// 다운로드 횟수 기준 조회
		@GetMapping("/downloadCountStandardList")
		public String downloadCountStandardList(Model model) {
			
			List<DownloadCountStandard> downloadCountStandardList = downloadCountStandardService.DownloadCountStandardList();

			model.addAttribute("title", "다운로드 횟수 기준 조회");
			model.addAttribute("downloadCountStandardList", downloadCountStandardList);
						
			return "admin/noteDownloadCountStandard/dwonload_count_standard_list";
			}
}

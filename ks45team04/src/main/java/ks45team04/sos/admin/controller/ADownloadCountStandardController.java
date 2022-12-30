package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.DownloadCountStandard;



@Controller
@RequestMapping("/admin")
public class ADownloadCountStandardController {

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
	
		// 다운로드 횟수 기준 등록 처리
		@PostMapping("/adddownloadCountStandard")
		public String adddownloadCountStandard(DownloadCountStandard downloadCountStandard) {
			
			return "";
		}
		
		// 다운로드 횟수 기준 등록 화면
		@GetMapping("/adddownloadCountStandard")
		public String adddownloadCountStandard(Model model) {
			model.addAttribute("title", "다운로드 횟수 기준 등록");
			
			return "admin/noteDownloadCountStandard/dwonload_count_standard_insert";
		}
	
		
		// 다운로드 횟수 기준 조회
		@GetMapping("/downloadCountStandardList")
		public String downloadCountStandardList(Model model) {
		model.addAttribute("title", "다운로드 횟수 기준 조회");
						
			return "admin/noteDownloadCountStandard/dwonload_count_standard_list";
			}
}

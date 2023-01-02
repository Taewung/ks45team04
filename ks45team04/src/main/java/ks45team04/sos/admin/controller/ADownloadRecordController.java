package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.DownloadRecord;
import ks45team04.sos.admin.service.DownloadRecordService;



@Controller
public class ADownloadRecordController {
	
	private final DownloadRecordService downloadRecordService;
	
	public ADownloadRecordController(DownloadRecordService downloadRecordService) {
		this.downloadRecordService = downloadRecordService;
	}

		// 다운로드 기록 삭제 처리
		@PostMapping("/deleteDownloadRecord")
		public String deleteDownloadRecord(DownloadRecord DownloadRecord) {
					
			return "";
		}
		
		// 다운로드 기록 삭제 화면
		@GetMapping("/deleteDownloadRecord")
		public String deleteDownloadRecord(Model model) {
			model.addAttribute("title", "다운로드 횟수 기준 삭제 화면");
				
			return "admin/noteDownloadRecord/dwonload_record_delete.html";
		}
	
		
		// 다운로드 기록 수정 처리
		@PostMapping("/modifyDownloadRecord")
		public String modifyDownloadRecord(DownloadRecord DownloadRecord) {
					
			return "";
		}
				
		// 다운로드 기록 수정 화면
		@GetMapping("/modifyDownloadRecord")
		public String modifyDownloadRecord(Model model) {
			model.addAttribute("title", "다운로드 횟수 기준 정보 수정");
				
			return "admin/noteDownloadRecord/dwonload_record_modify";
		}
	
		

		// 다운로드 기록 조회
		@GetMapping("/downloadRecordList")
		public String downloadRecordList(Model model) {
		
		List<DownloadRecord> downloadRecordList =downloadRecordService.downloadRecordList(); 
			
		model.addAttribute("title", "다운로드 횟수 기준 조회");
		model.addAttribute("downloadRecordList", downloadRecordList);
						
			return "admin/noteDownloadRecord/dwonload_record_list";
			}
}

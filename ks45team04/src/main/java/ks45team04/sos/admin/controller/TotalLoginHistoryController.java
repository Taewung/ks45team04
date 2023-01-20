package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team04.sos.admin.dto.TotalLoginHistory;
import ks45team04.sos.admin.mapper.TotalLoginHistoryMapper;
import ks45team04.sos.admin.service.TotalLoginHistoryService;

@Controller
public class TotalLoginHistoryController {
	
	private final TotalLoginHistoryService totalLoginHistoryService;
	private final TotalLoginHistoryMapper totalLoginHistoryMapper;
	
	public TotalLoginHistoryController(@Qualifier("totalLoginHistoryService") TotalLoginHistoryService totalLoginHistoryService,
																	TotalLoginHistoryMapper totalLoginHistoryMapper) {
		this.totalLoginHistoryService = totalLoginHistoryService;
		this.totalLoginHistoryMapper = totalLoginHistoryMapper;
	}

	
	//전체 회원 로그인 내역 조회
	@GetMapping("/totalLoginHistory")
	public String totalLoginHistory(Model model
			,@RequestParam(value="searchKey", required = false)String searchKey
			,@RequestParam(value="searchValue", required = false, defaultValue="") String searchValue) {

		List<TotalLoginHistory> totalLoginHistory = totalLoginHistoryService.TotalLoginHistory(searchKey, searchValue);
		model.addAttribute("title", "전체 회원 로그인 /로그아웃 내역 조회");
		model.addAttribute("totalLoginHistory", totalLoginHistory);
		return  "admin/login/total_login_history";
	}
}
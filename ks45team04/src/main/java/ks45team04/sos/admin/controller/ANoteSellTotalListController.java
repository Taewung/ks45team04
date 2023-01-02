package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.NoteSellTotalList;
import ks45team04.sos.admin.service.NoteSellTotalListService;

@Controller
public class ANoteSellTotalListController {
	
	private final NoteSellTotalListService noteSellTotalListService;
	public ANoteSellTotalListController(NoteSellTotalListService noteSellTotalListService) {
		this.noteSellTotalListService = noteSellTotalListService;
	}

	// 노트 판매내역 조회
	@GetMapping("/noteSellTotalList")
	public String noteSellTotalList(Model model) {
		
		List<NoteSellTotalList> noteSellTotalList = noteSellTotalListService.NoteSellTotalList();
		
		model.addAttribute("title", "노트 판매내역 조회");
		model.addAttribute("noteSellTotalList", noteSellTotalList );
		
		return "admin/note/note_sell_total_list";

	}
}

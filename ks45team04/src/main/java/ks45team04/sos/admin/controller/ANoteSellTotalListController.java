package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ANoteSellTotalListController {
	

	// 노트 판매내역 조회
	@GetMapping("/noteSellTotalList")
	public String noteSellTotalList(Model model) {
		model.addAttribute("title", "노트 판매내역 조회");
		
		return "admin/note/note_sell_total_list";

	}
}

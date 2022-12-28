package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoteSellTotalListController {

	@GetMapping("/noteSellTotalList")
	public String noteSellTotalList(Model model) {
		model.addAttribute("title", "노트총판매목록");
		return "admin/note/note_sell_total_list";
	}
}

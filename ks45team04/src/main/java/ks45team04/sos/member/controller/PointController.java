package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/point")
public class PointController {

	//포인트 적립 기준 조회
		@GetMapping("PointSaveStandardList")
		public String PointSaveStandardList(Model model) {
			model.addAttribute("title", "포인트 적립 기준 조회");
			
			return "member/point/point_standard_list";
		}
}

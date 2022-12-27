package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/point")
public class APointController {
	
	//포인트 적립 기준 등록
	@GetMapping("/addPointSaveStandard")
	public String addPointSaveStandard(Model model) {
		model.addAttribute("title", "포인트 적립 기준 등록");
		
		return "admin/point/point_save_standard_insert";
	}
	
	//포인트 적립 기준 수정
	@GetMapping("/modifyPointSaveStandard")
	public String modifyPointSaveStandard(Model model) {
		model.addAttribute("title", "포인트 적립 기준 수정");
		
		return "admin/point/point_save_standard_modify";
	}
	
	//포인트 적립 기준 삭제
	@GetMapping("deletePointSaveStandard")
	public String deletePointSaveStandard(Model model) {
		model.addAttribute("title", "포인트 적립 기준 삭제");
		
		return "admin/point/point_save_standard_delete";
	}
	
	//포인트 수수료율 등록
	@GetMapping("/addPointfeeRate")
	public String addPointfeeRate(Model model) {
		model.addAttribute("title", "포인트 수수료율 등록");
		
		return "admin/point/point_fee_rate_insert";
	}
		
	//포인트 수수료율 수정
	@GetMapping("/modifyPointfeeRate")
	public String modifyPointfeeRate(Model model) {
		model.addAttribute("title", "포인트 수수료율 수정");
		
		return "admin/point/point_fee_rate_insert";
	}
		
	//포인트 수수료율 삭제
	@GetMapping("deletePointfeeRate")
	public String deletePointfeeRate(Model model) {
		model.addAttribute("title", "포인트 수수료율 삭제");
		
		return "admin/point/point_fee_rate_delete";
	}
		
}

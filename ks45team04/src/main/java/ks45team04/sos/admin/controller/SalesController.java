package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	@RequestMapping("/sales")
	public class SalesController {
		
			//일별 매출 조회
			@GetMapping("/listDailySales")
			public String listDailySales(Model model) {
				model.addAttribute("title", "일별 매출 조회");
				return "admin/sales/daily_sales_list";
				}
			
			//월별 매출 조회
			@GetMapping("/listMonthlySales")
			public String listMonthlySales(Model model) {
				model.addAttribute("title", "월별 매출 조회");
				return "admin/sales/monthly_sales_list";
				}
			
			//년별 매출 조회
			@GetMapping("/listAnnualSales")
			public String listAnnualSales(Model model) {
				model.addAttribute("title", "년별 매출 조회");
				return "admin/sales/annual_sales_list";
				}
			
			//매출 메인
			@GetMapping("/mainSales")
			public String mainSales(Model model) {
				model.addAttribute("title", "매출 메인");
				return "admin/sales/sales_main_list";
				}
			
	}



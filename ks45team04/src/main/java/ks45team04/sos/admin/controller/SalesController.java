package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.AnnualRefund;
import ks45team04.sos.admin.dto.AnnualSales;
import ks45team04.sos.admin.dto.AnnualTotal;
import ks45team04.sos.admin.dto.DailyRefund;
import ks45team04.sos.admin.dto.DailySales;
import ks45team04.sos.admin.dto.DailySalesAndRefund;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.MonthlySalesAndRefund;
import ks45team04.sos.admin.dto.MonthlyTotal;
import ks45team04.sos.admin.service.LicenseInfoService;
import ks45team04.sos.admin.service.SalesService;

	@Controller
	public class SalesController {
		
	private final SalesService salesService;
		
	public SalesController(SalesService salesService) {
			this.salesService = salesService;
		}	
		
			//일별 매출 조회
			@GetMapping("/listDailySales")
			public String listDailySales(Model model) {
				
				List<DailySales> dailySalesList = salesService.DailySalesList();
				List<DailyRefund> dailyRefundList  = salesService.DailyRefundList();
				List<DailySalesAndRefund> dailySalesAndRefundList  = salesService.DailySalesAndRefundList();
				model.addAttribute("title", "일별 매출 조회");
				model.addAttribute("dailySalesList", dailySalesList);
				model.addAttribute("dailyRefundList", dailyRefundList);
				model.addAttribute("dailySalesAndRefundList", dailySalesAndRefundList);
				
				return "admin/sales/daily_sales_list";
				}
			
			
			//월별 매출 조회
			@GetMapping("/listMonthlySales")
			public String listMonthlySales(Model model) {
				List<MonthlyTotal> monthlyTotalList = salesService.MonthlyTotalList();
				List<MonthlySalesAndRefund> monthlySalesAndRefundList = salesService.MonthlySalesAndRefundList();
				model.addAttribute("title", "월별 매출 조회");
				model.addAttribute("monthlySalesAndRefundList", monthlySalesAndRefundList);
				model.addAttribute("monthlyTotalList", monthlyTotalList);
				
				return "admin/sales/monthly_sales_list";
				}
			
			//년별 매출 조회
			@GetMapping("/listAnnualSales")
			public String listAnnualSales(Model model) {
				List<AnnualSales> annualSalesList = salesService.AnnualSalesList();
				List<AnnualRefund> annualRefundList = salesService.AnnualRefundList();
				List<AnnualTotal> annualTotalList = salesService.AnnualTotalList();
				model.addAttribute("title", "년별 매출 조회");
				model.addAttribute("annualSalesList", annualSalesList);
				model.addAttribute("annualRefundList", annualRefundList);
				model.addAttribute("annualTotalList", annualTotalList);
				return "admin/sales/annual_sales_list";
				}
			
			//매출 메인
			@GetMapping("/mainSales")
			public String mainSales(Model model) {
				model.addAttribute("title", "매출 메인");
				return "admin/sales/sales_main_list";
				}
			
	}



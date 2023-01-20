package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.AnnualRefund;
import ks45team04.sos.admin.dto.AnnualSales;
import ks45team04.sos.admin.dto.AnnualTotal;
import ks45team04.sos.admin.dto.DailyRefund;
import ks45team04.sos.admin.dto.DailySales;
import ks45team04.sos.admin.dto.DailySalesAndRefund;
import ks45team04.sos.admin.dto.MonthlySalesAndRefund;
import ks45team04.sos.admin.dto.MonthlyTotal;
import ks45team04.sos.admin.mapper.SalesMapper;

@Service
public class SalesService {

private final SalesMapper salesMapper;

	public SalesService(SalesMapper salesMapper) {
		this.salesMapper = salesMapper;
	}
	
	//일별 매출 목록 조회
	public List<DailySales> DailySalesList(){
		List<DailySales> dailySalesList = salesMapper.DailySalesList();
		
		return dailySalesList;
		
	}
	
	//일별 환불 목록 조회
		public List<DailyRefund> DailyRefundList(){
			List<DailyRefund> dailyRefundList = salesMapper.DailyRefundList();
			
			return dailyRefundList;
			
		}
		
	//일별 매출 및 환불 목록 조회
		public List<DailySalesAndRefund> DailySalesAndRefundList(){
			List<DailySalesAndRefund> dailySalesAndRefundList = salesMapper.DailySalesAndRefundList();
			
			return dailySalesAndRefundList;
			
		}	
		
	//월별 매출 및 환불 목록 조회
		public List<MonthlySalesAndRefund> MonthlySalesAndRefundList(){
			List<MonthlySalesAndRefund> monthlySalesAndRefundList = salesMapper.MonthlySalesAndRefundList();
					
			return monthlySalesAndRefundList;
					
		}		
		
		
	//월별 손익합계 조회
		public List<MonthlyTotal> MonthlyTotalList(){
			 List<MonthlyTotal> monthlyTotalList = salesMapper.MonthlyTotalList();
					
			 return monthlyTotalList;
					
		}		
		
	//년별 매출 조회
		public List<AnnualSales> AnnualSalesList(){
			 List<AnnualSales> annualSalesList = salesMapper.AnnualSalesList();
							
			 return annualSalesList;
							
				}		
					
		
	//년별 환불 조회
		public List<AnnualRefund> AnnualRefundList(){
			 List<AnnualRefund> annualRefundList = salesMapper.AnnualRefundList();
							
			 return annualRefundList;
							
				}			
		
	//년별 손익 조회
		public List<AnnualTotal> AnnualTotalList(){
			 List<AnnualTotal> annualTotalList = salesMapper.AnnualTotalList();
								
			 return annualTotalList;
								
				}				
		
		
		
		
		
		
}

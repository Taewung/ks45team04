package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.AnnualRefund;
import ks45team04.sos.admin.dto.AnnualSales;
import ks45team04.sos.admin.dto.AnnualTotal;
import ks45team04.sos.admin.dto.DailyRefund;
import ks45team04.sos.admin.dto.DailySales;
import ks45team04.sos.admin.dto.DailySalesAndRefund;
import ks45team04.sos.admin.dto.MonthlySalesAndRefund;
import ks45team04.sos.admin.dto.MonthlyTotal;


@Mapper
public interface SalesMapper {
	
	//일별 매출 조회
	public List<DailySales> DailySalesList();
	
	//일별 환불 조회
	public List<DailyRefund> DailyRefundList();
	
	//일별 매출 및 환불 조회
	public List<DailySalesAndRefund> DailySalesAndRefundList();
	
	//월별 매출 및 환불 조회
	public List<MonthlySalesAndRefund> MonthlySalesAndRefundList();
	
	//월별 손익 합계 조회
	public List<MonthlyTotal> MonthlyTotalList();
	
	//년별 매출 조회
	public List<AnnualSales> AnnualSalesList();
	
	//년별 환불 조회
	public List<AnnualRefund> AnnualRefundList();

	//년별 손익 조회
	public List<AnnualTotal> AnnualTotalList();
}

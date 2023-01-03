package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.DailyRefund;
import ks45team04.sos.admin.dto.DailySales;
import ks45team04.sos.admin.dto.DailySalesAndRefund;
import ks45team04.sos.admin.dto.MonthlySalesAndRefund;


@Mapper
public interface SalesMapper {
	
	//일별매출조회
	public List<DailySales> DailySalesList();
	
	//일별환불조회
	public List<DailyRefund> DailyRefundList();
	
	//일별 매출 및 환불조회
	public List<DailySalesAndRefund> DailySalesAndRefundList();
	
	//월별 매출 및 환불조회
	public List<MonthlySalesAndRefund> MonthlySalesAndRefundList();
}

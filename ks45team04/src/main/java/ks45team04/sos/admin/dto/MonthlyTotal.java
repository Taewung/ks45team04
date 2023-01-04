package ks45team04.sos.admin.dto;

public class MonthlyTotal {
	private String mtCode;
	private String msarEndGroup;
	private String mtSalesPayment;
	private String mtRefundPayment;
	private String monthlyIncome;
	private String incomeCalculationStartDate;
	private String incomeCalculationEndDate;
	private String mtRegDate;
	private String memId;
	private String mtYearAndMonth;
	public String getMtCode() {
		return mtCode;
	}
	public void setMtCode(String mtCode) {
		this.mtCode = mtCode;
	}
	public String getMsarEndGroup() {
		return msarEndGroup;
	}
	public void setMsarEndGroup(String msarEndGroup) {
		this.msarEndGroup = msarEndGroup;
	}
	public String getMtSalesPayment() {
		return mtSalesPayment;
	}
	public void setMtSalesPayment(String mtSalesPayment) {
		this.mtSalesPayment = mtSalesPayment;
	}
	public String getMtRefundPayment() {
		return mtRefundPayment;
	}
	public void setMtRefundPayment(String mtRefundPayment) {
		this.mtRefundPayment = mtRefundPayment;
	}
	public String getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public String getIncomeCalculationStartDate() {
		return incomeCalculationStartDate;
	}
	public void setIncomeCalculationStartDate(String incomeCalculationStartDate) {
		this.incomeCalculationStartDate = incomeCalculationStartDate;
	}
	public String getIncomeCalculationEndDate() {
		return incomeCalculationEndDate;
	}
	public void setIncomeCalculationEndDate(String incomeCalculationEndDate) {
		this.incomeCalculationEndDate = incomeCalculationEndDate;
	}
	public String getMtRegDate() {
		return mtRegDate;
	}
	public void setMtRegDate(String mtRegDate) {
		this.mtRegDate = mtRegDate;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMtYearAndMonth() {
		return mtYearAndMonth;
	}
	public void setMtYearAndMonth(String mtYearAndMonth) {
		this.mtYearAndMonth = mtYearAndMonth;
	}
	@Override
	public String toString() {
		return "MonthlyTotal [mtCode=" + mtCode + ", msarEndGroup=" + msarEndGroup + ", mtSalesPayment="
				+ mtSalesPayment + ", mtRefundPayment=" + mtRefundPayment + ", monthlyIncome=" + monthlyIncome
				+ ", incomeCalculationStartDate=" + incomeCalculationStartDate + ", incomeCalculationEndDate="
				+ incomeCalculationEndDate + ", mtRegDate=" + mtRegDate + ", memId=" + memId + ", mtYearAndMonth="
				+ mtYearAndMonth + "]";
	}
	
	
}

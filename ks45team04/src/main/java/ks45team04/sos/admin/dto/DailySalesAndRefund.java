package ks45team04.sos.admin.dto;

public class DailySalesAndRefund {
	private String dsarCode;
	private String dsarEndGroup;
	private String dsarTotalPayment;
	private String salesOrRefund;
	private String relatedTable;
	private String relatedWork;
	private String dsarRegDate;
	private String memId;
	private String msarEndGroup;
	private String dsarYearAndMonth;
	public String getDsarCode() {
		return dsarCode;
	}
	public void setDsarCode(String dsarCode) {
		this.dsarCode = dsarCode;
	}
	public String getDsarEndGroup() {
		return dsarEndGroup;
	}
	public void setDsarEndGroup(String dsarEndGroup) {
		this.dsarEndGroup = dsarEndGroup;
	}
	public String getDsarTotalPayment() {
		return dsarTotalPayment;
	}
	public void setDsarTotalPayment(String dsarTotalPayment) {
		this.dsarTotalPayment = dsarTotalPayment;
	}
	public String getSalesOrRefund() {
		return salesOrRefund;
	}
	public void setSalesOrRefund(String salesOrRefund) {
		this.salesOrRefund = salesOrRefund;
	}
	public String getRelatedTable() {
		return relatedTable;
	}
	public void setRelatedTable(String relatedTable) {
		this.relatedTable = relatedTable;
	}
	public String getRelatedWork() {
		return relatedWork;
	}
	public void setRelatedWork(String relatedWork) {
		this.relatedWork = relatedWork;
	}
	public String getDsarRegDate() {
		return dsarRegDate;
	}
	public void setDsarRegDate(String dsarRegDate) {
		this.dsarRegDate = dsarRegDate;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMsarEndGroup() {
		return msarEndGroup;
	}
	public void setMsarEndGroup(String msarEndGroup) {
		this.msarEndGroup = msarEndGroup;
	}
	public String getDsarYearAndMonth() {
		return dsarYearAndMonth;
	}
	public void setDsarYearAndMonth(String dsarYearAndMonth) {
		this.dsarYearAndMonth = dsarYearAndMonth;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DailySalesAndRefund [dsarCode=");
		builder.append(dsarCode);
		builder.append(", dsarEndGroup=");
		builder.append(dsarEndGroup);
		builder.append(", dsarTotalPayment=");
		builder.append(dsarTotalPayment);
		builder.append(", salesOrRefund=");
		builder.append(salesOrRefund);
		builder.append(", relatedTable=");
		builder.append(relatedTable);
		builder.append(", relatedWork=");
		builder.append(relatedWork);
		builder.append(", dsarRegDate=");
		builder.append(dsarRegDate);
		builder.append(", memId=");
		builder.append(memId);
		builder.append(", msarEndGroup=");
		builder.append(msarEndGroup);
		builder.append(", dsarYearAndMonth=");
		builder.append(dsarYearAndMonth);
		builder.append("]");
		return builder.toString();
	}
	
	
}

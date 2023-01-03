package ks45team04.sos.admin.dto;

public class DailySales {
	private String dsCode;
	private String dsEndGroup;
	private String dsTotalPayment;
	private String dsRegDate;
	private String memId;
	private String msEndGroup;
	private String dsYearAndMonth;
	
	public String getDsCode() {
		return dsCode;
	}
	public void setDsCode(String dsCode) {
		this.dsCode = dsCode;
	}
	public String getDsEndGroup() {
		return dsEndGroup;
	}
	public void setDsEndGroup(String dsEndGroup) {
		this.dsEndGroup = dsEndGroup;
	}
	public String getDsTotalPayment() {
		return dsTotalPayment;
	}
	public void setDsTotalPayment(String dsTotalPayment) {
		this.dsTotalPayment = dsTotalPayment;
	}
	public String getDsRegDate() {
		return dsRegDate;
	}
	public void setDsRegDate(String dsRegDate) {
		this.dsRegDate = dsRegDate;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMsEndGroup() {
		return msEndGroup;
	}
	public void setMsEndGroup(String msEndGroup) {
		this.msEndGroup = msEndGroup;
	}
	public String getDsYearAndMonth() {
		return dsYearAndMonth;
	}
	public void setDsYearAndMonth(String dsYearAndMonth) {
		this.dsYearAndMonth = dsYearAndMonth;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DailySales [dsCode=");
		builder.append(dsCode);
		builder.append(", dsEndGroup=");
		builder.append(dsEndGroup);
		builder.append(", dsTotalPayment=");
		builder.append(dsTotalPayment);
		builder.append(", dsRegDate=");
		builder.append(dsRegDate);
		builder.append(", memId=");
		builder.append(memId);
		builder.append(", msEndGroup=");
		builder.append(msEndGroup);
		builder.append(", dsYearAndMonth=");
		builder.append(dsYearAndMonth);
		builder.append("]");
		return builder.toString();
	}
	
	
	

	
}

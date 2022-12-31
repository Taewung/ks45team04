package ks45team04.sos.admin.dto;


public class LicenseMain {
	
	private String lmcCode;
	private String lmcRegId;
	private String lmcName;
	private String lmcRegDatetime;
	
	public String getLmcCode() {
		return lmcCode;
	}
	public void setLmcCode(String lmcCode) {
		this.lmcCode = lmcCode;
	}
	public String getLmcRegId() {
		return lmcRegId;
	}
	public void setLmcRegId(String lmcRegId) {
		this.lmcRegId = lmcRegId;
	}
	public String getLmcName() {
		return lmcName;
	}
	public void setLmcName(String lmcName) {
		this.lmcName = lmcName;
	}
	public String getLmcRegDatetime() {
		return lmcRegDatetime;
	}
	public void setLmcRegDatetime(String lmcRegDatetime) {
		this.lmcRegDatetime = lmcRegDatetime;
	}
	
	@Override
	public String toString() {
		return "LicenseMain [lmcCode=" + lmcCode + ", lmcRegId=" + lmcRegId + ", lmcName=" + lmcName
				+ ", lmcRegDatetime=" + lmcRegDatetime + "]";
	}
	
	

}

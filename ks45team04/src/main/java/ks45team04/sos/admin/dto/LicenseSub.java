package ks45team04.sos.admin.dto;

public class LicenseSub {
	private String lscCode;
	private String lmcCode;
	private String lmcName;
	private String lscName;
	private String lscRegId;
	private String lscRegDatetime;
	
	public String getLscCode() {
		return lscCode;
	}
	public void setLscCode(String lscCode) {
		this.lscCode = lscCode;
	}
	public String getLmcCode() {
		return lmcCode;
	}
	public void setLmcCode(String lmcCode) {
		this.lmcCode = lmcCode;
	}
	public String getLmcName() {
		return lmcName;
	}
	public void setLmcName(String lmcName) {
		this.lmcName = lmcName;
	}
	public String getLscName() {
		return lscName;
	}
	public void setLscName(String lscName) {
		this.lscName = lscName;
	}
	public String getLscRegId() {
		return lscRegId;
	}
	public void setLscRegId(String lscRegId) {
		this.lscRegId = lscRegId;
	}
	public String getLscRegDatetime() {
		return lscRegDatetime;
	}
	public void setLscRegDatetime(String lscRegDatetime) {
		this.lscRegDatetime = lscRegDatetime;
	}
	@Override
	public String toString() {
		return "LicenseSub [lscCode=" + lscCode + ", lmcCode=" + lmcCode + ", lmcName=" + lmcName + ", lscName="
				+ lscName + ", lscRegId=" + lscRegId + ", lscRegDatetime=" + lscRegDatetime + "]";
	}
	
	

}

package ks45team04.sos.admin.dto;

public class LicenseInfo {
	private String liCode;
	private String lmcCode;
	private String lscCode;
	private String liName;
	private String liOverview;
	private String liQualification;
	private String liRegId;
	private String liRegDatetime;
	
	
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getLscCode() {
		return lscCode;
	}
	public void setLscCode(String lscCode) {
		this.lscCode = lscCode;
	}
	public String getLiName() {
		return liName;
	}
	public void setLiName(String liName) {
		this.liName = liName;
	}
	public String getLiOverview() {
		return liOverview;
	}
	public void setLiOverview(String liOverview) {
		this.liOverview = liOverview;
	}
	public String getLiQualification() {
		return liQualification;
	}
	public void setLiQualification(String liQualification) {
		this.liQualification = liQualification;
	}
	public String getLiRegId() {
		return liRegId;
	}
	public void setLiRegId(String liRegId) {
		this.liRegId = liRegId;
	}
	public String getLiRegDatetime() {
		return liRegDatetime;
	}
	public void setLiRegDatetime(String liRegDatetime) {
		this.liRegDatetime = liRegDatetime;
	}
	
	public String getLmcCode() {
		return lmcCode;
	}
	public void setLmcCode(String lmcCode) {
		this.lmcCode = lmcCode;
	}
	
	@Override
	public String toString() {
		return "LicenseInfo [liCode=" + liCode + ", lmcCode=" + lmcCode + ", lscCode=" + lscCode + ", liName=" + liName
				+ ", liOverview=" + liOverview + ", liQualification=" + liQualification + ", liRegId=" + liRegId
				+ ", liRegDatetime=" + liRegDatetime + "]";
	}
	
	
}

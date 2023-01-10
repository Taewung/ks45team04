package ks45team04.sos.admin.dto;

public class LicenseInfo {
	private String liCode;
	private String lmcCode;
	private String lmcName;
	private String lscCode;
	private String lscName;
	private String liName;
	private String liOverview;
	private String liQualification;
	private String liRegId;
	private String liRegDatetime;
	
	private LicenseDate licenseDate;
	
	private LicenseSubject licenseSubject;
	
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
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
	public String getLscCode() {
		return lscCode;
	}
	public void setLscCode(String lscCode) {
		this.lscCode = lscCode;
	}
	public String getLscName() {
		return lscName;
	}
	public void setLscName(String lscName) {
		this.lscName = lscName;
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
	public LicenseDate getLicenseDate() {
		return licenseDate;
	}
	public void setLicenseDate(LicenseDate licenseDate) {
		this.licenseDate = licenseDate;
	}
	public LicenseSubject getLicenseSubject() {
		return licenseSubject;
	}
	public void setLicenseSubject(LicenseSubject licenseSubject) {
		this.licenseSubject = licenseSubject;
	}
	@Override
	public String toString() {
		return "LicenseInfo [liCode=" + liCode + ", lmcCode=" + lmcCode + ", lmcName=" + lmcName + ", lscCode="
				+ lscCode + ", lscName=" + lscName + ", liName=" + liName + ", liOverview=" + liOverview
				+ ", liQualification=" + liQualification + ", liRegId=" + liRegId + ", liRegDatetime=" + liRegDatetime
				+ ", licenseDate=" + licenseDate + ", licenseSubject=" + licenseSubject + "]";
	}
	

	
	
}

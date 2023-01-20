package ks45team04.sos.admin.dto;

public class LicenseDate {

	private String ldCode;
	private String liCode;
	private String liName;
	private String ldPeriod;
	private String ldDate;
	private String ldAcceptanceDate;
	private String ldCost;
	private String ldRegId;
	private String ldRegDatetime;
	
	private LicenseInfo licenseInfo;
	
	public String getLdCode() {
		return ldCode;
	}
	public void setLdCode(String ldCode) {
		this.ldCode = ldCode;
	}
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getLdPeriod() {
		return ldPeriod;
	}
	public void setLdPeriod(String ldPeriod) {
		this.ldPeriod = ldPeriod;
	}
	public String getLdDate() {
		return ldDate;
	}
	public void setLdDate(String ldDate) {
		this.ldDate = ldDate;
	}
	public String getLdAcceptanceDate() {
		return ldAcceptanceDate;
	}
	public void setLdAcceptanceDate(String ldAcceptanceDate) {
		this.ldAcceptanceDate = ldAcceptanceDate;
	}
	public String getLdCost() {
		return ldCost;
	}
	public void setLdCost(String ldCost) {
		this.ldCost = ldCost;
	}
	public String getLdRegId() {
		return ldRegId;
	}
	public void setLdRegId(String ldRegId) {
		this.ldRegId = ldRegId;
	}
	public String getLdRegDatetime() {
		return ldRegDatetime;
	}
	public void setLdRegDatetime(String ldRegDatetime) {
		this.ldRegDatetime = ldRegDatetime;
	}
	public String getLiName() {
		return liName;
	}
	public void setLiName(String liName) {
		this.liName = liName;
	}
	public LicenseInfo getLicenseInfo() {
		return licenseInfo;
	}
	public void setLicenseInfo(LicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}
	
	@Override
	public String toString() {
		return "LicenseDate [ldCode=" + ldCode + ", liCode=" + liCode + ", liName=" + liName + ", ldPeriod=" + ldPeriod
				+ ", ldDate=" + ldDate + ", ldAcceptanceDate=" + ldAcceptanceDate + ", ldCost=" + ldCost + ", ldRegId="
				+ ldRegId + ", ldRegDatetime=" + ldRegDatetime + ", licenseInfo=" + licenseInfo + "]";
	}
	
	
	
	
	
	
	
}

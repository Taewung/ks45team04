package ks45team04.sos.member.dto;

import ks45team04.sos.admin.dto.LicenseInfo;

public class DDay {
	private String dDayCode;
	private String memId;
	private String liCode;
	private String liName;
	private String dDayContent;
	private String dDayDate;
	private String dDayWriteDate;
	
	private LicenseInfo licenseInfo;

	public String getdDayCode() {
		return dDayCode;
	}

	public void setdDayCode(String dDayCode) {
		this.dDayCode = dDayCode;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getLiCode() {
		return liCode;
	}

	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}

	public String getLiName() {
		return liName;
	}

	public void setLiName(String liName) {
		this.liName = liName;
	}

	public String getdDayContent() {
		return dDayContent;
	}

	public void setdDayContent(String dDayContent) {
		this.dDayContent = dDayContent;
	}

	public String getdDayDate() {
		return dDayDate;
	}

	public void setdDayDate(String dDayDate) {
		this.dDayDate = dDayDate;
	}

	public String getdDayWriteDate() {
		return dDayWriteDate;
	}

	public void setdDayWriteDate(String dDayWriteDate) {
		this.dDayWriteDate = dDayWriteDate;
	}

	public LicenseInfo getLicenseInfo() {
		return licenseInfo;
	}

	public void setLicenseInfo(LicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	@Override
	public String toString() {
		return "DDay [dDayCode=" + dDayCode + ", memId=" + memId + ", liCode=" + liCode + ", liName=" + liName
				+ ", dDayContent=" + dDayContent + ", dDayDate=" + dDayDate + ", dDayWriteDate=" + dDayWriteDate
				+ ", licenseInfo=" + licenseInfo + "]";
	}
	
	
}

package ks45team04.sos.admin.dto;

import java.util.List;

public class LicenseSub {
	private String lscCode;
	private String lmcCode;
	private String lmcName;
	private String lscName;
	private String lscRegId;
	private String lscRegDatetime;
	
	private List<LicenseInfo> licenseInfoList;

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

	public List<LicenseInfo> getLicenseInfoList() {
		return licenseInfoList;
	}

	public void setLicenseInfoList(List<LicenseInfo> licenseInfoList) {
		this.licenseInfoList = licenseInfoList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LicenseSub [lscCode=");
		builder.append(lscCode);
		builder.append(", lmcCode=");
		builder.append(lmcCode);
		builder.append(", lmcName=");
		builder.append(lmcName);
		builder.append(", lscName=");
		builder.append(lscName);
		builder.append(", lscRegId=");
		builder.append(lscRegId);
		builder.append(", lscRegDatetime=");
		builder.append(lscRegDatetime);
		builder.append(", licenseInfoList=");
		builder.append(licenseInfoList);
		builder.append("]");
		return builder.toString();
	}
	

}

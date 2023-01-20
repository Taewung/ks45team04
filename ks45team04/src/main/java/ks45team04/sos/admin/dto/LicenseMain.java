package ks45team04.sos.admin.dto;

import java.util.List;

public class LicenseMain {
	
	private String lmcCode;
	private String lmcRegId;
	private String lmcName;
	private String lmcRegDatetime;
	
	private List<LicenseSub> licenseSubList;

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

	public List<LicenseSub> getLicenseSubList() {
		return licenseSubList;
	}

	public void setLicenseSubList(List<LicenseSub> licenseSubList) {
		this.licenseSubList = licenseSubList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LicenseMain [lmcCode=");
		builder.append(lmcCode);
		builder.append(", lmcRegId=");
		builder.append(lmcRegId);
		builder.append(", lmcName=");
		builder.append(lmcName);
		builder.append(", lmcRegDatetime=");
		builder.append(lmcRegDatetime);
		builder.append(", licenseSubList=");
		builder.append(licenseSubList);
		builder.append("]");
		return builder.toString();
	}
	

}

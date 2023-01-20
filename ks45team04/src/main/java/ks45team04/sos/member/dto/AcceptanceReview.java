package ks45team04.sos.member.dto;

import ks45team04.sos.admin.dto.LicenseInfo;

public class AcceptanceReview {
	
	private String arCode;
	private String liCode;
	private String pmCode;
	private String pmId;
	private String arContent;
	private String liName;
	private String arRegDate;
	private String arPoint;
	private String arPointGroup;
	
	private LicenseInfo licenseInfo;

	public String getArCode() {
		return arCode;
	}

	public void setArCode(String arCode) {
		this.arCode = arCode;
	}

	public String getLiCode() {
		return liCode;
	}

	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}

	public String getPmCode() {
		return pmCode;
	}

	public void setPmCode(String pmCode) {
		this.pmCode = pmCode;
	}

	public String getPmId() {
		return pmId;
	}

	public void setPmId(String pmId) {
		this.pmId = pmId;
	}

	public String getArContent() {
		return arContent;
	}

	public void setArContent(String arContent) {
		this.arContent = arContent;
	}

	public String getLiName() {
		return liName;
	}

	public void setLiName(String liName) {
		this.liName = liName;
	}

	public String getArRegDate() {
		return arRegDate;
	}

	public void setArRegDate(String arRegDate) {
		this.arRegDate = arRegDate;
	}

	public String getArPoint() {
		return arPoint;
	}

	public void setArPoint(String arPoint) {
		this.arPoint = arPoint;
	}

	public String getArPointGroup() {
		return arPointGroup;
	}

	public void setArPointGroup(String arPointGroup) {
		this.arPointGroup = arPointGroup;
	}

	public LicenseInfo getLicenseInfo() {
		return licenseInfo;
	}

	public void setLicenseInfo(LicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	@Override
	public String toString() {
		return "AcceptanceReview [arCode=" + arCode + ", liCode=" + liCode + ", pmCode=" + pmCode + ", pmId=" + pmId
				+ ", arContent=" + arContent + ", liName=" + liName + ", arRegDate=" + arRegDate + ", arPoint="
				+ arPoint + ", arPointGroup=" + arPointGroup + ", licenseInfo=" + licenseInfo + "]";
	}
	

	
	
}

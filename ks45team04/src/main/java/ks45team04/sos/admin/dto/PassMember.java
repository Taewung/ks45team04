package ks45team04.sos.admin.dto;

public class PassMember {

	private String pmCode;
	private String pmId;
	private String pmLiCode;
	private String pmCertificationData;
	private String pmDatetime;
	private String pmState;
	private String pmRegDatetime;
	private String pmRefuseReason;
	private String pmReportManager;
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
	public String getPmLiCode() {
		return pmLiCode;
	}
	public void setPmLiCode(String pmLiCode) {
		this.pmLiCode = pmLiCode;
	}
	public String getPmCertificationData() {
		return pmCertificationData;
	}
	public void setPmCertificationData(String pmCertificationData) {
		this.pmCertificationData = pmCertificationData;
	}
	public String getPmDatetime() {
		return pmDatetime;
	}
	public void setPmDatetime(String pmDatetime) {
		this.pmDatetime = pmDatetime;
	}
	public String getPmState() {
		return pmState;
	}
	public void setPmState(String pmState) {
		this.pmState = pmState;
	}
	public String getPmRegDatetime() {
		return pmRegDatetime;
	}
	public void setPmRegDatetime(String pmRegDatetime) {
		this.pmRegDatetime = pmRegDatetime;
	}
	public String getPmRefuseReason() {
		return pmRefuseReason;
	}
	public void setPmRefuseReason(String pmRefuseReason) {
		this.pmRefuseReason = pmRefuseReason;
	}
	public String getPmReportManager() {
		return pmReportManager;
	}
	public void setPmReportManager(String pmReportManager) {
		this.pmReportManager = pmReportManager;
	}
	@Override
	public String toString() {
		return "PassMember [pmCode=" + pmCode + ", pmId=" + pmId + ", pmLiCode=" + pmLiCode + ", pmCertificationData="
				+ pmCertificationData + ", pmDatetime=" + pmDatetime + ", pmState=" + pmState + ", pmRegDatetime="
				+ pmRegDatetime + ", pmRefuseReason=" + pmRefuseReason + ", pmReportManager=" + pmReportManager + "]";
	}

	
}

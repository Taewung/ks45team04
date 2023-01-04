package ks45team04.sos.admin.dto;

public class CheatMember {

	private String cmReportCode;
	private String cmId;
	private String cmReportId;
	private String cmReportReason;
	private String cmReportContent;
	private String cmReportFile;
	private String cmReportDatetime;
	private String cmReportState;
	private String cmReportManager;
	private String cmReportJudgeDatetime;
	private String cmStopDate;
	private String cmStartDatetime;
	private String cmEndDatetime;
	public String getCmReportCode() {
		return cmReportCode;
	}
	public void setCmReportCode(String cmReportCode) {
		this.cmReportCode = cmReportCode;
	}
	public String getCmId() {
		return cmId;
	}
	public void setCmId(String cmId) {
		this.cmId = cmId;
	}
	public String getCmReportId() {
		return cmReportId;
	}
	public void setCmReportId(String cmReportId) {
		this.cmReportId = cmReportId;
	}
	public String getCmReportReason() {
		return cmReportReason;
	}
	public void setCmReportReason(String cmReportReason) {
		this.cmReportReason = cmReportReason;
	}
	public String getCmReportContent() {
		return cmReportContent;
	}
	public void setCmReportContent(String cmReportContent) {
		this.cmReportContent = cmReportContent;
	}
	public String getCmReportFile() {
		return cmReportFile;
	}
	public void setCmReportFile(String cmReportFile) {
		this.cmReportFile = cmReportFile;
	}
	public String getCmReportDatetime() {
		return cmReportDatetime;
	}
	public void setCmReportDatetime(String cmReportDatetime) {
		this.cmReportDatetime = cmReportDatetime;
	}
	public String getCmReportState() {
		return cmReportState;
	}
	public void setCmReportState(String cmReportState) {
		this.cmReportState = cmReportState;
	}
	public String getCmReportManager() {
		return cmReportManager;
	}
	public void setCmReportManager(String cmReportManager) {
		this.cmReportManager = cmReportManager;
	}
	public String getCmReportJudgeDatetime() {
		return cmReportJudgeDatetime;
	}
	public void setCmReportJudgeDatetime(String cmReportJudgeDatetime) {
		this.cmReportJudgeDatetime = cmReportJudgeDatetime;
	}
	public String getCmStopDate() {
		return cmStopDate;
	}
	public void setCmStopDate(String cmStopDate) {
		this.cmStopDate = cmStopDate;
	}
	public String getCmStartDatetime() {
		return cmStartDatetime;
	}
	public void setCmStartDatetime(String cmStartDatetime) {
		this.cmStartDatetime = cmStartDatetime;
	}
	public String getCmEndDatetime() {
		return cmEndDatetime;
	}
	public void setCmEndDatetime(String cmEndDatetime) {
		this.cmEndDatetime = cmEndDatetime;
	}
	@Override
	public String toString() {
		return "CheatMember [cmReportCode=" + cmReportCode + ", cmId=" + cmId + ", cmReportId=" + cmReportId
				+ ", cmReportReason=" + cmReportReason + ", cmReportContent=" + cmReportContent + ", cmReportFile="
				+ cmReportFile + ", cmReportDatetime=" + cmReportDatetime + ", cmReportState=" + cmReportState
				+ ", cmReportManager=" + cmReportManager + ", cmReportJudgeDatetime=" + cmReportJudgeDatetime
				+ ", cmStopDate=" + cmStopDate + ", cmStartDatetime=" + cmStartDatetime + ", cmEndDatetime="
				+ cmEndDatetime + "]";
	}
	

}

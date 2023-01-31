package ks45team04.sos.member.dto;

public class ChallengeFinish {
	public String cgCode;
	public String cfCgCode;
	public String cfId;
	public String cfStudyTime;
	public String cfCgStudyTime;
	public String cfCgEndDatetime;
	public String cfState;
	public String cfEndDatetime;
	public String cfSavepoint;
	public String cfPointDetailGroup;
	public String getCgCode() {
		return cgCode;
	}
	public void setCgCode(String cgCode) {
		this.cgCode = cgCode;
	}
	public String getCfCgCode() {
		return cfCgCode;
	}
	public void setCfCgCode(String cfCgCode) {
		this.cfCgCode = cfCgCode;
	}
	public String getCfId() {
		return cfId;
	}
	public void setCfId(String cfId) {
		this.cfId = cfId;
	}
	public String getCfStudyTime() {
		return cfStudyTime;
	}
	public void setCfStudyTime(String cfStudyTime) {
		this.cfStudyTime = cfStudyTime;
	}
	public String getCfCgStudyTime() {
		return cfCgStudyTime;
	}
	public void setCfCgStudyTime(String cfCgStudyTime) {
		this.cfCgStudyTime = cfCgStudyTime;
	}
	public String getCfCgEndDatetime() {
		return cfCgEndDatetime;
	}
	public void setCfCgEndDatetime(String cfCgEndDatetime) {
		this.cfCgEndDatetime = cfCgEndDatetime;
	}
	public String getCfState() {
		return cfState;
	}
	public void setCfState(String cfState) {
		this.cfState = cfState;
	}
	public String getCfEndDatetime() {
		return cfEndDatetime;
	}
	public void setCfEndDatetime(String cfEndDatetime) {
		this.cfEndDatetime = cfEndDatetime;
	}
	public String getCfSavepoint() {
		return cfSavepoint;
	}
	public void setCfSavepoint(String cfSavepoint) {
		this.cfSavepoint = cfSavepoint;
	}
	public String getCfPointDetailGroup() {
		return cfPointDetailGroup;
	}
	public void setCfPointDetailGroup(String cfPointDetailGroup) {
		this.cfPointDetailGroup = cfPointDetailGroup;
	}
	@Override
	public String toString() {
		return "ChallengeFinish [cgCode=" + cgCode + ", cfCgCode=" + cfCgCode + ", cfId=" + cfId + ", cfStudyTime="
				+ cfStudyTime + ", cfCgStudyTime=" + cfCgStudyTime + ", cfCgEndDatetime=" + cfCgEndDatetime
				+ ", cfState=" + cfState + ", cfEndDatetime=" + cfEndDatetime + ", cfSavepoint=" + cfSavepoint
				+ ", cfPointDetailGroup=" + cfPointDetailGroup + "]";
	}
	
	
	
}

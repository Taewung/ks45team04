package ks45team04.sos.admin.dto;

public class MembershipMember {

	private String mmCode;
	private String mmId; 
	private String mmMembershipCode;
	private String mmPeriod;
	private String mmStartDatetime;
	private String mmEndDatetime;
	private String mmState;
	public String getMmCode() {
		return mmCode;
	}
	public void setMmCode(String mmCode) {
		this.mmCode = mmCode;
	}
	public String getMmId() {
		return mmId;
	}
	public void setMmId(String mmId) {
		this.mmId = mmId;
	}
	public String getMmMembershipCode() {
		return mmMembershipCode;
	}
	public void setMmMembershipCode(String mmMembershipCode) {
		this.mmMembershipCode = mmMembershipCode;
	}
	public String getMmPeriod() {
		return mmPeriod;
	}
	public void setMmPeriod(String mmPeriod) {
		this.mmPeriod = mmPeriod;
	}
	public String getMmStartDatetime() {
		return mmStartDatetime;
	}
	public void setMmStartDatetime(String mmStartDatetime) {
		this.mmStartDatetime = mmStartDatetime;
	}
	public String getMmEndDatetime() {
		return mmEndDatetime;
	}
	public void setMmEndDatetime(String mmEndDatetime) {
		this.mmEndDatetime = mmEndDatetime;
	}
	public String getMmState() {
		return mmState;
	}
	public void setMmState(String mmState) {
		this.mmState = mmState;
	}
	@Override
	public String toString() {
		return "MembershipMember [mmCode=" + mmCode + ", mmId=" + mmId + ", mmMembershipCode=" + mmMembershipCode
				+ ", mmPeriod=" + mmPeriod + ", mmStartDatetime=" + mmStartDatetime + ", mmEndDatetime=" + mmEndDatetime
				+ ", mmState=" + mmState + "]";
	}
	
}

package ks45team04.sos.member.dto;

public class MMembership {

	private String membershipCode;
	private String membershipPeriod;
	private String membershipAmount;
	private String membershipRegManager;
	private String membershipRegDatetime;
	public String getMembershipCode() {
		return membershipCode;
	}
	public void setMembershipCode(String membershipCode) {
		this.membershipCode = membershipCode;
	}
	public String getMembershipPeriod() {
		return membershipPeriod;
	}
	public void setMembershipPeriod(String membershipPeriod) {
		this.membershipPeriod = membershipPeriod;
	}
	public String getMembershipAmount() {
		return membershipAmount;
	}
	public void setMembershipAmount(String membershipAmount) {
		this.membershipAmount = membershipAmount;
	}
	public String getMembershipRegManager() {
		return membershipRegManager;
	}
	public void setMembershipRegManager(String membershipRegManager) {
		this.membershipRegManager = membershipRegManager;
	}
	public String getMembershipRegDatetime() {
		return membershipRegDatetime;
	}
	public void setMembershipRegDatetime(String membershipRegDatetime) {
		this.membershipRegDatetime = membershipRegDatetime;
	}
	@Override
	public String toString() {
		return "Membership [membershipCode=" + membershipCode + ", membershipPeriod=" + membershipPeriod
				+ ", membershipAmount=" + membershipAmount + ", membershipRegManager=" + membershipRegManager
				+ ", membershipRegDatetime=" + membershipRegDatetime + "]";
	}
	
	
}

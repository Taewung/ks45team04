package ks45team04.sos.admin.dto;

public class WithdrawalMember {
	private String wdmId;
	private String wdmPw;
	private String wdmName;
	private String wdmEmail;
	private String wdmBirth;
	private String wdmPhone;
	private String wdmLevelName;
	private String wdmTotalPoint;
	private String wdmRegDatetime;
	private String wdmDatetime;
	public String getWdmId() {
		return wdmId;
	}
	public void setWdmId(String wdmId) {
		this.wdmId = wdmId;
	}
	public String getWdmPw() {
		return wdmPw;
	}
	public void setWdmPw(String wdmPw) {
		this.wdmPw = wdmPw;
	}
	public String getWdmName() {
		return wdmName;
	}
	public void setWdmName(String wdmName) {
		this.wdmName = wdmName;
	}
	public String getWdmEmail() {
		return wdmEmail;
	}
	public void setWdmEmail(String wdmEmail) {
		this.wdmEmail = wdmEmail;
	}
	public String getWdmBirth() {
		return wdmBirth;
	}
	public void setWdmBirth(String wdmBirth) {
		this.wdmBirth = wdmBirth;
	}
	public String getWdmPhone() {
		return wdmPhone;
	}
	public void setWdmPhone(String wdmPhone) {
		this.wdmPhone = wdmPhone;
	}
	public String getWdmLevelName() {
		return wdmLevelName;
	}
	public void setWdmLevelName(String wdmLevelName) {
		this.wdmLevelName = wdmLevelName;
	}
	public String getWdmTotalPoint() {
		return wdmTotalPoint;
	}
	public void setWdmTotalPoint(String wdmTotalPoint) {
		this.wdmTotalPoint = wdmTotalPoint;
	}
	public String getWdmRegDatetime() {
		return wdmRegDatetime;
	}
	public void setWdmRegDatetime(String wdmRegDatetime) {
		this.wdmRegDatetime = wdmRegDatetime;
	}
	public String getWdmDatetime() {
		return wdmDatetime;
	}
	public void setWdmDatetime(String wdmDatetime) {
		this.wdmDatetime = wdmDatetime;
	}
	@Override
	public String toString() {
		return "WithdrawalMember [wdmId=" + wdmId + ", wdmPw=" + wdmPw + ", wdmName=" + wdmName + ", wdmEmail="
				+ wdmEmail + ", wdmBirth=" + wdmBirth + ", wdmPhone=" + wdmPhone + ", wdmLevelName=" + wdmLevelName
				+ ", wdmTotalPoint=" + wdmTotalPoint + ", wdmRegDatetime=" + wdmRegDatetime + ", wdmDatetime="
				+ wdmDatetime + "]";
	}

}

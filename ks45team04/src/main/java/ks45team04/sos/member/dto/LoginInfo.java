package ks45team04.sos.member.dto;

public class LoginInfo {
	private String loginLogoutCode;
	private String loginLogoutId;
	private String loginDatetime;
	private String logoutDatetime;
	
	
	
	public LoginInfo(String memId, String memName, String memBirth) {
		// TODO Auto-generated constructor stub
	}
	public String getLoginLogoutCode() {
		return loginLogoutCode;
	}
	public void setLoginLogoutCode(String loginLogoutCode) {
		this.loginLogoutCode = loginLogoutCode;
	}
	public String getLoginLogoutId() {
		return loginLogoutId;
	}
	public void setLoginLogoutId(String loginLogoutId) {
		this.loginLogoutId = loginLogoutId;
	}
	public String getLoginDatetime() {
		return loginDatetime;
	}
	public void setLoginDatetime(String loginDatetime) {
		this.loginDatetime = loginDatetime;
	}
	public String getLogoutDatetime() {
		return logoutDatetime;
	}
	public void setLogoutDatetime(String logoutDatetime) {
		this.logoutDatetime = logoutDatetime;
	}
	@Override
	public String toString() {
		return "MLogin [loginLogoutCode=" + loginLogoutCode + ", loginLogoutId=" + loginLogoutId + ", loginDatetime="
				+ loginDatetime + ", logoutDatetime=" + logoutDatetime + "]";
	}
	
	
}

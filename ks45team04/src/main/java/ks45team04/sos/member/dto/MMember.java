package ks45team04.sos.member.dto;

import java.util.List;

public class MMember {

	private String memId;
	private String memPw;
	private String memName;
	private String memEmail;
	private String memBirth;
	private String memPhone;
	private String memLevelName;
	private String memRegDatetime;
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemBirth() {
		return memBirth;
	}
	public void setMemBirth(String memBirth) {
		this.memBirth = memBirth;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemLevelName() {
		return memLevelName;
	}
	public void setMemLevelName(String memLevelName) {
		this.memLevelName = memLevelName;
	}
	public String getMemRegDatetime() {
		return memRegDatetime;
	}
	public void setMemRegDatetime(String memRegDatetime) {
		this.memRegDatetime = memRegDatetime;
	}
	@Override
	public String toString() {
		return "MMember [memId=" + memId + ", memPw=" + memPw + ", memName=" + memName + ", memEmail=" + memEmail
				+ ", memBirth=" + memBirth + ", memPhone=" + memPhone + ", memLevelName=" + memLevelName
				+ ", memRegDatetime=" + memRegDatetime + "]";
	}
	
	private List<LoginHistory> loginHistory;
}

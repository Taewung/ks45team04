package ks45team04.sos.member.dto;

public class StudyBoard {
	public String sbCode;
	public String memId;
	public String liCode;
	public String liName;
	public String sbTitle;
	public String sbContent;
	public String sbRegDate;
	public String getSbCode() {
		return sbCode;
	}
	public void setSbCode(String sbCode) {
		this.sbCode = sbCode;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getLiName() {
		return liName;
	}
	public void setLiName(String liName) {
		this.liName = liName;
	}
	public String getSbTitle() {
		return sbTitle;
	}
	public void setSbTitle(String sbTitle) {
		this.sbTitle = sbTitle;
	}
	public String getSbContent() {
		return sbContent;
	}
	public void setSbContent(String sbContent) {
		this.sbContent = sbContent;
	}
	public String getSbRegDate() {
		return sbRegDate;
	}
	public void setSbRegDate(String sbRegDate) {
		this.sbRegDate = sbRegDate;
	}
	@Override
	public String toString() {
		return "StudyBoard [sbCode=" + sbCode + ", memId=" + memId + ", liCode=" + liCode + ", liName=" + liName
				+ ", sbTitle=" + sbTitle + ", sbContent=" + sbContent + ", sbRegDate=" + sbRegDate + "]";
	}
	
	
}

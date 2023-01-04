package ks45team04.sos.member.dto;

public class SubExamTime {

	private String subTimeCode;
	private String examCode;
	private String examMemId;
	private String examGroupCode;
	private String lsCode;
	private String startRegDateTime;
	private String endRegDateTime;
	private String subTimeRequired;
	public String getSubTimeCode() {
		return subTimeCode;
	}
	public void setSubTimeCode(String subTimeCode) {
		this.subTimeCode = subTimeCode;
	}
	public String getExamCode() {
		return examCode;
	}
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}
	public String getExamMemId() {
		return examMemId;
	}
	public void setExamMemId(String examMemId) {
		this.examMemId = examMemId;
	}
	public String getExamGroupCode() {
		return examGroupCode;
	}
	public void setExamGroupCode(String examGroupCode) {
		this.examGroupCode = examGroupCode;
	}
	public String getLsCode() {
		return lsCode;
	}
	public void setLsCode(String lsCode) {
		this.lsCode = lsCode;
	}
	public String getStartRegDateTime() {
		return startRegDateTime;
	}
	public void setStartRegDateTime(String startRegDateTime) {
		this.startRegDateTime = startRegDateTime;
	}
	public String getEndRegDateTime() {
		return endRegDateTime;
	}
	public void setEndRegDateTime(String endRegDateTime) {
		this.endRegDateTime = endRegDateTime;
	}
	public String getSubTimeRequired() {
		return subTimeRequired;
	}
	public void setSubTimeRequired(String subTimeRequired) {
		this.subTimeRequired = subTimeRequired;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubExamTime [subTimeCode=");
		builder.append(subTimeCode);
		builder.append(", examCode=");
		builder.append(examCode);
		builder.append(", examMemId=");
		builder.append(examMemId);
		builder.append(", examGroupCode=");
		builder.append(examGroupCode);
		builder.append(", lsCode=");
		builder.append(lsCode);
		builder.append(", startRegDateTime=");
		builder.append(startRegDateTime);
		builder.append(", endRegDateTime=");
		builder.append(endRegDateTime);
		builder.append(", subTimeRequired=");
		builder.append(subTimeRequired);
		builder.append("]");
		return builder.toString();
	}
	
	
}

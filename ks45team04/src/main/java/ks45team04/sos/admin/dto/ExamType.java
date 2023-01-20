package ks45team04.sos.admin.dto;

public class ExamType {
	
	private String examtypeCode;
	private String examtypeName;
	private String examtypeRegId;
	private String examtypeRegDateTime;
	public String getExamtypeCode() {
		return examtypeCode;
	}
	public void setExamtypeCode(String examtypeCode) {
		this.examtypeCode = examtypeCode;
	}
	public String getExamtypeName() {
		return examtypeName;
	}
	public void setExamtypeName(String examtypeName) {
		this.examtypeName = examtypeName;
	}
	public String getExamtypeRegId() {
		return examtypeRegId;
	}
	public void setExamtypeRegId(String examtypeRegId) {
		this.examtypeRegId = examtypeRegId;
	}
	public String getExamtypeRegDateTime() {
		return examtypeRegDateTime;
	}
	public void setExamtypeRegDateTime(String examtypeRegDateTime) {
		this.examtypeRegDateTime = examtypeRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExamType [examtypeCode=");
		builder.append(examtypeCode);
		builder.append(", examtypeName=");
		builder.append(examtypeName);
		builder.append(", examtypeRegId=");
		builder.append(examtypeRegId);
		builder.append(", examtypeRegDateTime=");
		builder.append(examtypeRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

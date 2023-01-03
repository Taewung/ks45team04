package ks45team04.sos.member.dto;

public class TotalExamResult {

	private String totalExamResultCode;
	private String subExamResultCode;
	private String examGroupCode;
	private String examTypeCode;
	private String examMemId;
	private String liPScoreCode;
	private int totalQuestionScore;
	private int totalSubNum;
	private int totalSubAvgScore;
	private int liPStandardScore;
	private String liSuccessState;
	private String totalTimeRequired;
	private String totalExamResultRegDateTime;
	public String getTotalExamResultCode() {
		return totalExamResultCode;
	}
	public void setTotalExamResultCode(String totalExamResultCode) {
		this.totalExamResultCode = totalExamResultCode;
	}
	public String getSubExamResultCode() {
		return subExamResultCode;
	}
	public void setSubExamResultCode(String subExamResultCode) {
		this.subExamResultCode = subExamResultCode;
	}
	public String getExamGroupCode() {
		return examGroupCode;
	}
	public void setExamGroupCode(String examGroupCode) {
		this.examGroupCode = examGroupCode;
	}
	public String getExamTypeCode() {
		return examTypeCode;
	}
	public void setExamTypeCode(String examTypeCode) {
		this.examTypeCode = examTypeCode;
	}
	public String getExamMemId() {
		return examMemId;
	}
	public void setExamMemId(String examMemId) {
		this.examMemId = examMemId;
	}
	public String getLiPScoreCode() {
		return liPScoreCode;
	}
	public void setLiPScoreCode(String liPScoreCode) {
		this.liPScoreCode = liPScoreCode;
	}
	public int getTotalQuestionScore() {
		return totalQuestionScore;
	}
	public void setTotalQuestionScore(int totalQuestionScore) {
		this.totalQuestionScore = totalQuestionScore;
	}
	public int getTotalSubNum() {
		return totalSubNum;
	}
	public void setTotalSubNum(int totalSubNum) {
		this.totalSubNum = totalSubNum;
	}
	public int getTotalSubAvgScore() {
		return totalSubAvgScore;
	}
	public void setTotalSubAvgScore(int totalSubAvgScore) {
		this.totalSubAvgScore = totalSubAvgScore;
	}
	public int getLiPStandardScore() {
		return liPStandardScore;
	}
	public void setLiPStandardScore(int liPStandardScore) {
		this.liPStandardScore = liPStandardScore;
	}
	public String getLiSuccessState() {
		return liSuccessState;
	}
	public void setLiSuccessState(String liSuccessState) {
		this.liSuccessState = liSuccessState;
	}
	public String getTotalTimeRequired() {
		return totalTimeRequired;
	}
	public void setTotalTimeRequired(String totalTimeRequired) {
		this.totalTimeRequired = totalTimeRequired;
	}
	public String getTotalExamResultRegDateTime() {
		return totalExamResultRegDateTime;
	}
	public void setTotalExamResultRegDateTime(String totalExamResultRegDateTime) {
		this.totalExamResultRegDateTime = totalExamResultRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TotalExamResult [totalExamResultCode=");
		builder.append(totalExamResultCode);
		builder.append(", subExamResultCode=");
		builder.append(subExamResultCode);
		builder.append(", examGroupCode=");
		builder.append(examGroupCode);
		builder.append(", examTypeCode=");
		builder.append(examTypeCode);
		builder.append(", examMemId=");
		builder.append(examMemId);
		builder.append(", liPScoreCode=");
		builder.append(liPScoreCode);
		builder.append(", totalQuestionScore=");
		builder.append(totalQuestionScore);
		builder.append(", totalSubNum=");
		builder.append(totalSubNum);
		builder.append(", totalSubAvgScore=");
		builder.append(totalSubAvgScore);
		builder.append(", liPStandardScore=");
		builder.append(liPStandardScore);
		builder.append(", liSuccessState=");
		builder.append(liSuccessState);
		builder.append(", totalTimeRequired=");
		builder.append(totalTimeRequired);
		builder.append(", totalExamResultRegDateTime=");
		builder.append(totalExamResultRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
}


package ks45team04.sos.member.dto;

public class SubExamResult {

	private String subExamResultcode;
	private String examGroupCode;
	private String examTypeCode;
	private String examMemId;
	private String lsPScoreCode;
	private String lsCode;
	private int totalQuestionNum;
	private int totalCorrectAnswerNum;
	private int totalWrongAnswerNum;
	private int subQuestionScore;
	private int lsPStandardScore;
	private String subSuccessState;
	private String subTimeRequired;
	private String subExamResultRegDateTime;
	public String getSubExamResultcode() {
		return subExamResultcode;
	}
	public void setSubExamResultcode(String subExamResultcode) {
		this.subExamResultcode = subExamResultcode;
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
	public String getLsPScoreCode() {
		return lsPScoreCode;
	}
	public void setLsPScoreCode(String lsPScoreCode) {
		this.lsPScoreCode = lsPScoreCode;
	}
	public String getLsCode() {
		return lsCode;
	}
	public void setLsCode(String lsCode) {
		this.lsCode = lsCode;
	}
	public int getTotalQuestionNum() {
		return totalQuestionNum;
	}
	public void setTotalQuestionNum(int totalQuestionNum) {
		this.totalQuestionNum = totalQuestionNum;
	}
	public int getTotalCorrectAnswerNum() {
		return totalCorrectAnswerNum;
	}
	public void setTotalCorrectAnswerNum(int totalCorrectAnswerNum) {
		this.totalCorrectAnswerNum = totalCorrectAnswerNum;
	}
	public int getTotalWrongAnswerNum() {
		return totalWrongAnswerNum;
	}
	public void setTotalWrongAnswerNum(int totalWrongAnswerNum) {
		this.totalWrongAnswerNum = totalWrongAnswerNum;
	}
	public int getSubQuestionScore() {
		return subQuestionScore;
	}
	public void setSubQuestionScore(int subQuestionScore) {
		this.subQuestionScore = subQuestionScore;
	}
	public int getLsPStandardScore() {
		return lsPStandardScore;
	}
	public void setLsPStandardScore(int lsPStandardScore) {
		this.lsPStandardScore = lsPStandardScore;
	}
	public String getSubSuccessState() {
		return subSuccessState;
	}
	public void setSubSuccessState(String subSuccessState) {
		this.subSuccessState = subSuccessState;
	}
	public String getSubTimeRequired() {
		return subTimeRequired;
	}
	public void setSubTimeRequired(String subTimeRequired) {
		this.subTimeRequired = subTimeRequired;
	}
	public String getSubExamResultRegDateTime() {
		return subExamResultRegDateTime;
	}
	public void setSubExamResultRegDateTime(String subExamResultRegDateTime) {
		this.subExamResultRegDateTime = subExamResultRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubExamResult [subExamResultcode=");
		builder.append(subExamResultcode);
		builder.append(", examGroupCode=");
		builder.append(examGroupCode);
		builder.append(", examTypeCode=");
		builder.append(examTypeCode);
		builder.append(", examMemId=");
		builder.append(examMemId);
		builder.append(", lsPScoreCode=");
		builder.append(lsPScoreCode);
		builder.append(", lsCode=");
		builder.append(lsCode);
		builder.append(", totalQuestionNum=");
		builder.append(totalQuestionNum);
		builder.append(", totalCorrectAnswerNum=");
		builder.append(totalCorrectAnswerNum);
		builder.append(", totalWrongAnswerNum=");
		builder.append(totalWrongAnswerNum);
		builder.append(", subQuestionScore=");
		builder.append(subQuestionScore);
		builder.append(", lsPStandardScore=");
		builder.append(lsPStandardScore);
		builder.append(", subSuccessState=");
		builder.append(subSuccessState);
		builder.append(", subTimeRequired=");
		builder.append(subTimeRequired);
		builder.append(", subExamResultRegDateTime=");
		builder.append(subExamResultRegDateTime);
		builder.append("]");
		return builder.toString();
	}

	
}

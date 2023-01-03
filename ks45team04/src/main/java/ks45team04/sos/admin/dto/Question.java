package ks45team04.sos.admin.dto;

public class Question {
	
	private String questionCode;
	private String liCode;
	private String lsCode;
	private String liName;
	private String lsNum;
	private String lsName;
	private String question;
	private int questionScore;
	private String questionRegId;
	private String questionRegDateTime;
	public String getQuestionCode() {
		return questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getLsCode() {
		return lsCode;
	}
	public void setLsCode(String lsCode) {
		this.lsCode = lsCode;
	}
	public String getLiName() {
		return liName;
	}
	public void setLiName(String liName) {
		this.liName = liName;
	}
	public String getLsNum() {
		return lsNum;
	}
	public void setLsNum(String lsNum) {
		this.lsNum = lsNum;
	}
	public String getLsName() {
		return lsName;
	}
	public void setLsName(String lsName) {
		this.lsName = lsName;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getQuestionScore() {
		return questionScore;
	}
	public void setQuestionScore(int questionScore) {
		this.questionScore = questionScore;
	}
	public String getQuestionRegId() {
		return questionRegId;
	}
	public void setQuestionRegId(String questionRegId) {
		this.questionRegId = questionRegId;
	}
	public String getQuestionRegDateTime() {
		return questionRegDateTime;
	}
	public void setQuestionRegDateTime(String questionRegDateTime) {
		this.questionRegDateTime = questionRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Question [questionCode=");
		builder.append(questionCode);
		builder.append(", liCode=");
		builder.append(liCode);
		builder.append(", lsCode=");
		builder.append(lsCode);
		builder.append(", liName=");
		builder.append(liName);
		builder.append(", lsNum=");
		builder.append(lsNum);
		builder.append(", lsName=");
		builder.append(lsName);
		builder.append(", question=");
		builder.append(question);
		builder.append(", questionScore=");
		builder.append(questionScore);
		builder.append(", questionRegId=");
		builder.append(questionRegId);
		builder.append(", questionRegDateTime=");
		builder.append(questionRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

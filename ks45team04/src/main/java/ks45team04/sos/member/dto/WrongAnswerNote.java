package ks45team04.sos.member.dto;

public class WrongAnswerNote {

	private String waNoteCode;
	private String waRegId;
	private String examAnswerCode;
	private String liCode; 
	private String liName;
	private String lsNum;
	private String lsName;
	private String waTitle;
	private String question;
	private String waReason;
	private String explanation;
	private String waRegDateTime;
	public String getWaNoteCode() {
		return waNoteCode;
	}
	public void setWaNoteCode(String waNoteCode) {
		this.waNoteCode = waNoteCode;
	}
	public String getWaRegId() {
		return waRegId;
	}
	public void setWaRegId(String waRegId) {
		this.waRegId = waRegId;
	}
	public String getExamAnswerCode() {
		return examAnswerCode;
	}
	public void setExamAnswerCode(String examAnswerCode) {
		this.examAnswerCode = examAnswerCode;
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
	public String getWaTitle() {
		return waTitle;
	}
	public void setWaTitle(String waTitle) {
		this.waTitle = waTitle;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getWaReason() {
		return waReason;
	}
	public void setWaReason(String waReason) {
		this.waReason = waReason;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getWaRegDateTime() {
		return waRegDateTime;
	}
	public void setWaRegDateTime(String waRegDateTime) {
		this.waRegDateTime = waRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WrongAnswerNote [waNoteCode=");
		builder.append(waNoteCode);
		builder.append(", waRegId=");
		builder.append(waRegId);
		builder.append(", examAnswerCode=");
		builder.append(examAnswerCode);
		builder.append(", liCode=");
		builder.append(liCode);
		builder.append(", liName=");
		builder.append(liName);
		builder.append(", lsNum=");
		builder.append(lsNum);
		builder.append(", lsName=");
		builder.append(lsName);
		builder.append(", waTitle=");
		builder.append(waTitle);
		builder.append(", question=");
		builder.append(question);
		builder.append(", waReason=");
		builder.append(waReason);
		builder.append(", explanation=");
		builder.append(explanation);
		builder.append(", waRegDateTime=");
		builder.append(waRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
}

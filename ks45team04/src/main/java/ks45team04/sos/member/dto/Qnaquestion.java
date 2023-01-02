package ks45team04.sos.member.dto;

public class Qnaquestion {
	
	private String qanCode;
	private String questionId;
	private String questionTitle;
	private String questionContent;
	private String questionDatetime;
	private String answerId;
	private String answerContent;
	private String answerDatetime;
	
	public String getQanCode() {
		return qanCode;
	}
	public void setQanCode(String qanCode) {
		this.qanCode = qanCode;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getQuestionDatetime() {
		return questionDatetime;
	}
	public void setQuestionDatetime(String questionDatetime) {
		this.questionDatetime = questionDatetime;
	}
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public String getAnswerDatetime() {
		return answerDatetime;
	}
	public void setAnswerDatetime(String answerDatetime) {
		this.answerDatetime = answerDatetime;
	}
	
	@Override
	public String toString() {
		return "Qnaquestion [qanCode=" + qanCode + ", questionId=" + questionId + ", questionTitle=" + questionTitle
				+ ", questionContent=" + questionContent + ", questionDatetime=" + questionDatetime + ", answerId="
				+ answerId + ", answerContent=" + answerContent + ", answerDatetime=" + answerDatetime + "]";
	}
	
	
	
}

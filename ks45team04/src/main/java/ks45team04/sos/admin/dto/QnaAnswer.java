package ks45team04.sos.admin.dto;

public class QnaAnswer {

	private String qnaCode;
	private String questionId;
	private String questionTitle;
	private String questionContent;
	private String questionDatetime;
	private String answerId;
	private String answerContent;
	private String answerDatetime;
	public String getQnaCode() {
		return qnaCode;
	}
	public void setQnaCode(String qnaCode) {
		this.qnaCode = qnaCode;
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
		return "QnaAnswer [qnaCode=" + qnaCode + ", questionId=" + questionId + ", questionTitle=" + questionTitle
				+ ", questionContent=" + questionContent + ", questionDatetime=" + questionDatetime + ", answerId="
				+ answerId + ", answerContent=" + answerContent + ", answerDatetime=" + answerDatetime + "]";
	}
	
	
	
}

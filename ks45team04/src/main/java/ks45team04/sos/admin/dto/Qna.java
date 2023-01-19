package ks45team04.sos.admin.dto;

public class Qna {

	private String qnaCode;
	private String questionId;
	private String questionTitle;
	private String questionContent;
	private String questionDatetime;
	private String answerContent;
	private String answerDatetime;
	private String qnaType;
	
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
	public String getQnaType() {
		return qnaType;
	}
	public void setQnaType(String qnaType) {
		this.qnaType = qnaType;
	}
	@Override
	public String toString() {
		return "Qna [qnaCode=" + qnaCode + ", questionId=" + questionId + ", questionTitle=" + questionTitle
				+ ", questionContent=" + questionContent + ", questionDatetime=" + questionDatetime + ", answerContent="
				+ answerContent + ", answerDatetime=" + answerDatetime + ", qnaType=" + qnaType + "]";
	}
	
	
	
	
	
	
}

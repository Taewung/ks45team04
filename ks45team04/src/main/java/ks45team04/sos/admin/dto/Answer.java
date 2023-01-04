package ks45team04.sos.admin.dto;

public class Answer {
	private String answerCode;
	private String questionCode;
	private String answer;
	private String answerState;
	private String answerRegId;
	private String answerRegDateTime;
	public String getAnswerCode() {
		return answerCode;
	}
	public void setAnswerCode(String answerCode) {
		this.answerCode = answerCode;
	}
	public String getQuestionCode() {
		return questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerState() {
		return answerState;
	}
	public void setAnswerState(String answerState) {
		this.answerState = answerState;
	}
	public String getAnswerRegId() {
		return answerRegId;
	}
	public void setAnswerRegId(String answerRegId) {
		this.answerRegId = answerRegId;
	}
	public String getAnswerRegDateTime() {
		return answerRegDateTime;
	}
	public void setAnswerRegDateTime(String answerRegDateTime) {
		this.answerRegDateTime = answerRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Answer [answerCode=");
		builder.append(answerCode);
		builder.append(", questionCode=");
		builder.append(questionCode);
		builder.append(", answer=");
		builder.append(answer);
		builder.append(", answerState=");
		builder.append(answerState);
		builder.append(", answerRegId=");
		builder.append(answerRegId);
		builder.append(", answerRegDateTime=");
		builder.append(answerRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

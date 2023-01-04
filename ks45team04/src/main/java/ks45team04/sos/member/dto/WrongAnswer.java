package ks45team04.sos.member.dto;

public class WrongAnswer {

	private String waCode;
	private String examAnswerCode;
	private String explainCode;
	private String examMemid;
	private String question;
	private String wrongAnswer;
	private String explanation;
	private String waRegDateTime;
	public String getWaCode() {
		return waCode;
	}
	public void setWaCode(String waCode) {
		this.waCode = waCode;
	}
	public String getExamAnswerCode() {
		return examAnswerCode;
	}
	public void setExamAnswerCode(String examAnswerCode) {
		this.examAnswerCode = examAnswerCode;
	}
	public String getExplainCode() {
		return explainCode;
	}
	public void setExplainCode(String explainCode) {
		this.explainCode = explainCode;
	}
	public String getExamMemid() {
		return examMemid;
	}
	public void setExamMemid(String examMemid) {
		this.examMemid = examMemid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getWrongAnswer() {
		return wrongAnswer;
	}
	public void setWrongAnswer(String wrongAnswer) {
		this.wrongAnswer = wrongAnswer;
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
		builder.append("WrongAnswer [waCode=");
		builder.append(waCode);
		builder.append(", examAnswerCode=");
		builder.append(examAnswerCode);
		builder.append(", explainCode=");
		builder.append(explainCode);
		builder.append(", examMemid=");
		builder.append(examMemid);
		builder.append(", question=");
		builder.append(question);
		builder.append(", wrongAnswer=");
		builder.append(wrongAnswer);
		builder.append(", explanation=");
		builder.append(explanation);
		builder.append(", waRegDateTime=");
		builder.append(waRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

package ks45team04.sos.member.dto;

public class Exam {

	private String examCode;
	private String examGroupCode;
	private String examTypeCode;
	private String liCode;
	private String lsCode;
	private String questionCode;
	private String answerCode;
	private String question;
	private int multiChoiceNum;
	private String answer;
	private String examRegId;
	private String examRegDateTime;
	public String getExamCode() {
		return examCode;
	}
	public void setExamCode(String examCode) {
		this.examCode = examCode;
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
	public String getQuestionCode() {
		return questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}
	public String getAnswerCode() {
		return answerCode;
	}
	public void setAnswerCode(String answerCode) {
		this.answerCode = answerCode;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getMultiChoiceNum() {
		return multiChoiceNum;
	}
	public void setMultiChoiceNum(int multiChoiceNum) {
		this.multiChoiceNum = multiChoiceNum;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getExamRegId() {
		return examRegId;
	}
	public void setExamRegId(String examRegId) {
		this.examRegId = examRegId;
	}
	public String getExamRegDateTime() {
		return examRegDateTime;
	}
	public void setExamRegDateTime(String examRegDateTime) {
		this.examRegDateTime = examRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exam [examCode=");
		builder.append(examCode);
		builder.append(", examGroupCode=");
		builder.append(examGroupCode);
		builder.append(", examTypeCode=");
		builder.append(examTypeCode);
		builder.append(", liCode=");
		builder.append(liCode);
		builder.append(", lsCode=");
		builder.append(lsCode);
		builder.append(", questionCode=");
		builder.append(questionCode);
		builder.append(", answerCode=");
		builder.append(answerCode);
		builder.append(", question=");
		builder.append(question);
		builder.append(", multiChoiceNum=");
		builder.append(multiChoiceNum);
		builder.append(", answer=");
		builder.append(answer);
		builder.append(", examRegId=");
		builder.append(examRegId);
		builder.append(", examRegDateTime=");
		builder.append(examRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

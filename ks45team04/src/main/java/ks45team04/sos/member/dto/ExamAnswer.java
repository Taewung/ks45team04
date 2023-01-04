package ks45team04.sos.member.dto;

public class ExamAnswer {

	private String examAnswerCode;
	private String examMemId;
	private String examCode;
	private String examGroupCode;
	private String questionCode;
	private String answerCode;
	private String question;
	private int selectedMultiChoiceNum;
	private String selectedAnswer;
	private String answerState;
	private int quetionScore;
	public String getExamAnswerCode() {
		return examAnswerCode;
	}
	public void setExamAnswerCode(String examAnswerCode) {
		this.examAnswerCode = examAnswerCode;
	}
	public String getExamMemId() {
		return examMemId;
	}
	public void setExamMemId(String examMemId) {
		this.examMemId = examMemId;
	}
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
	public int getSelectedMultiChoiceNum() {
		return selectedMultiChoiceNum;
	}
	public void setSelectedMultiChoiceNum(int selectedMultiChoiceNum) {
		this.selectedMultiChoiceNum = selectedMultiChoiceNum;
	}
	public String getSelectedAnswer() {
		return selectedAnswer;
	}
	public void setSelectedAnswer(String selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}
	public String getAnswerState() {
		return answerState;
	}
	public void setAnswerState(String answerState) {
		this.answerState = answerState;
	}
	public int getQuetionScore() {
		return quetionScore;
	}
	public void setQuetionScore(int quetionScore) {
		this.quetionScore = quetionScore;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExamAnswer [examAnswerCode=");
		builder.append(examAnswerCode);
		builder.append(", examMemId=");
		builder.append(examMemId);
		builder.append(", examCode=");
		builder.append(examCode);
		builder.append(", examGroupCode=");
		builder.append(examGroupCode);
		builder.append(", questionCode=");
		builder.append(questionCode);
		builder.append(", answerCode=");
		builder.append(answerCode);
		builder.append(", question=");
		builder.append(question);
		builder.append(", selectedMultiChoiceNum=");
		builder.append(selectedMultiChoiceNum);
		builder.append(", selectedAnswer=");
		builder.append(selectedAnswer);
		builder.append(", answerState=");
		builder.append(answerState);
		builder.append(", quetionScore=");
		builder.append(quetionScore);
		builder.append("]");
		return builder.toString();
	}
	
	

}

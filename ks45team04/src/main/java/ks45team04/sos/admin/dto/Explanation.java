package ks45team04.sos.admin.dto;

public class Explanation {

	private String explainCode;
	private String questionCode;
	private String explanation;
	private String explanationRegId;
	private String explanationRegDateTime;
	public String getExplainCode() {
		return explainCode;
	}
	public void setExplainCode(String explainCode) {
		this.explainCode = explainCode;
	}
	public String getQuestionCode() {
		return questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getExplanationRegId() {
		return explanationRegId;
	}
	public void setExplanationRegId(String explanationRegId) {
		this.explanationRegId = explanationRegId;
	}
	public String getExplanationRegDateTime() {
		return explanationRegDateTime;
	}
	public void setExplanationRegDateTime(String explanationRegDateTime) {
		this.explanationRegDateTime = explanationRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Explanation [explainCode=");
		builder.append(explainCode);
		builder.append(", questionCode=");
		builder.append(questionCode);
		builder.append(", explanation=");
		builder.append(explanation);
		builder.append(", explanationRegId=");
		builder.append(explanationRegId);
		builder.append(", explanationRegDateTime=");
		builder.append(explanationRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

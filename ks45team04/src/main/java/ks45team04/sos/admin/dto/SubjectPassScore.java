package ks45team04.sos.admin.dto;

public class SubjectPassScore {

	private String lsPScoreCode;
	private String liCode;
	private String lsCode;
	private String lsName;
	private int lsTotalQuestionNum;
	private int lsPStandardScore;
	private String lsPScoreRegId;
	private String lsPScoreRegDateTime;
	public String getLsPScoreCode() {
		return lsPScoreCode;
	}
	public void setLsPScoreCode(String lsPScoreCode) {
		this.lsPScoreCode = lsPScoreCode;
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
	public String getLsName() {
		return lsName;
	}
	public void setLsName(String lsName) {
		this.lsName = lsName;
	}
	public int getLsTotalQuestionNum() {
		return lsTotalQuestionNum;
	}
	public void setLsTotalQuestionNum(int lsTotalQuestionNum) {
		this.lsTotalQuestionNum = lsTotalQuestionNum;
	}
	public int getLsPStandardScore() {
		return lsPStandardScore;
	}
	public void setLsPStandardScore(int lsPStandardScore) {
		this.lsPStandardScore = lsPStandardScore;
	}
	public String getLsPScoreRegId() {
		return lsPScoreRegId;
	}
	public void setLsPScoreRegId(String lsPScoreRegId) {
		this.lsPScoreRegId = lsPScoreRegId;
	}
	public String getLsPScoreRegDateTime() {
		return lsPScoreRegDateTime;
	}
	public void setLsPScoreRegDateTime(String lsPScoreRegDateTime) {
		this.lsPScoreRegDateTime = lsPScoreRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubjectPassScore [lsPScoreCode=");
		builder.append(lsPScoreCode);
		builder.append(", liCode=");
		builder.append(liCode);
		builder.append(", lsCode=");
		builder.append(lsCode);
		builder.append(", lsName=");
		builder.append(lsName);
		builder.append(", lsTotalQuestionNum=");
		builder.append(lsTotalQuestionNum);
		builder.append(", lsPStandardScore=");
		builder.append(lsPStandardScore);
		builder.append(", lsPScoreRegId=");
		builder.append(lsPScoreRegId);
		builder.append(", lsPScoreRegDateTime=");
		builder.append(lsPScoreRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

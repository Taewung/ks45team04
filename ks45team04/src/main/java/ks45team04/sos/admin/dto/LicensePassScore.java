package ks45team04.sos.admin.dto;


public class LicensePassScore {

	private String liPScoreCode;
	private String liCode;
	private String liName;
	private int liPStandardScore;
	private String liPScoreRegId;
	private String liPScoreRegDateTime;
	public String getLiPScoreCode() {
		return liPScoreCode;
	}
	public void setLiPScoreCode(String liPScoreCode) {
		this.liPScoreCode = liPScoreCode;
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
	public int getLiPStandardScore() {
		return liPStandardScore;
	}
	public void setLiPStandardScore(int liPStandardScore) {
		this.liPStandardScore = liPStandardScore;
	}
	public String getLiPScoreRegId() {
		return liPScoreRegId;
	}
	public void setLiPScoreRegId(String liPScoreRegId) {
		this.liPScoreRegId = liPScoreRegId;
	}
	public String getLiPScoreRegDateTime() {
		return liPScoreRegDateTime;
	}
	public void setLiPScoreRegDateTime(String liPScoreRegDateTime) {
		this.liPScoreRegDateTime = liPScoreRegDateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LicensePassScore [liPScoreCode=");
		builder.append(liPScoreCode);
		builder.append(", liCode=");
		builder.append(liCode);
		builder.append(", liName=");
		builder.append(liName);
		builder.append(", liPStandardScore=");
		builder.append(liPStandardScore);
		builder.append(", liPScoreRegId=");
		builder.append(liPScoreRegId);
		builder.append(", liPScoreRegDateTime=");
		builder.append(liPScoreRegDateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

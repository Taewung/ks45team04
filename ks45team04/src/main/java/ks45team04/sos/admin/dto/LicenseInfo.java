package ks45team04.sos.admin.dto;

public class LicenseInfo {
	private String liCode;
	private String lmcCode;
	private String lmcName;
	private String lscCode;
	private String lscName;
	private String liName;
	private String liOverview;
	private String liQualification;
	private String liRegId;
	private String liRegDatetime;
	
  public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getLmcCode() {
		return lmcCode;
	}
	public void setLmcCode(String lmcCode) {
		this.lmcCode = lmcCode;
	}
	public String getLmcName() {
		return lmcName;
	}
	public void setLmcName(String lmcName) {
		this.lmcName = lmcName;
	}
	public String getLscCode() {
		return lscCode;
	}
	public void setLscCode(String lscCode) {
		this.lscCode = lscCode;
	}
	public String getLscName() {
		return lscName;
	}
	public void setLscName(String lscName) {
		this.lscName = lscName;
	}
	public String getLiName() {
		return liName;
	}
	public void setLiName(String liName) {
		this.liName = liName;
	}
	public String getLiOverview() {
		return liOverview;
	}
	public void setLiOverview(String liOverview) {
		this.liOverview = liOverview;
	}
	public String getLiQualification() {
		return liQualification;
	}
	public void setLiQualification(String liQualification) {
		this.liQualification = liQualification;
	}
	public String getLiRegId() {
		return liRegId;
	}
	public void setLiRegId(String liRegId) {
		this.liRegId = liRegId;
	}
	public String getLiRegDatetime() {
		return liRegDatetime;
	}
	public void setLiRegDatetime(String liRegDatetime) {
		this.liRegDatetime = liRegDatetime;
	}	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LicenseInfo [liCode=");
		builder.append(liCode);
		builder.append(", lmcCode=");
		builder.append(lmcCode);
		builder.append(", lmcName=");
		builder.append(lmcName);
		builder.append(", lscCode=");
		builder.append(lscCode);
		builder.append(", lscName=");
		builder.append(lscName);
		builder.append(", liName=");
		builder.append(liName);
		builder.append(", liOverview=");
		builder.append(liOverview);
		builder.append(", liQualification=");
		builder.append(liQualification);
		builder.append(", liRegId=");
		builder.append(liRegId);
		builder.append(", liRegDatetime=");
		builder.append(liRegDatetime);
		builder.append("]");
		return builder.toString();
	}
}

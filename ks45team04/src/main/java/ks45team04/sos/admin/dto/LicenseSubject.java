package ks45team04.sos.admin.dto;

public class LicenseSubject {
	
	private String lsCode;
	private String liCode;
	private String liName;
	private String lsSubject;
	private String lsName;
	private String lsRegId;
	private String lsRegDatetime;
	
	
	public String getLiName() {
		return liName;
	}
	public void setLiName(String liName) {
		this.liName = liName;
	}
	public String getLsCode() {
		return lsCode;
	}
	public void setLsCode(String lsCode) {
		this.lsCode = lsCode;
	}
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getLsSubject() {
		return lsSubject;
	}
	public void setLsSubject(String lsSubject) {
		this.lsSubject = lsSubject;
	}
	public String getLsName() {
		return lsName;
	}
	public void setLsName(String lsName) {
		this.lsName = lsName;
	}
	public String getLsRegId() {
		return lsRegId;
	}
	public void setLsRegId(String lsRegId) {
		this.lsRegId = lsRegId;
	}
	public String getLsRegDatetime() {
		return lsRegDatetime;
	}
	public void setLsRegDatetime(String lsRegDatetime) {
		this.lsRegDatetime = lsRegDatetime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LicenseSubject [lsCode=");
		builder.append(lsCode);
		builder.append(", liCode=");
		builder.append(liCode);
		builder.append(", liName=");
		builder.append(liName);
		builder.append(", lsSubject=");
		builder.append(lsSubject);
		builder.append(", lsName=");
		builder.append(lsName);
		builder.append(", lsRegId=");
		builder.append(lsRegId);
		builder.append(", lsRegDatetime=");
		builder.append(lsRegDatetime);
		builder.append("]");
		return builder.toString();
	}
	
	
}

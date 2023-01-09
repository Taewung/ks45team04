package ks45team04.sos.member.dto;

public class DDay {
	private String dDayCode;
	private String memId;
	private String liCode;
	private String liName;
	private String dDayContent;
	private String dDayDate;
	private String dDayWriteDate;
	
	public String getdDayCode() {
		return dDayCode;
	}
	public void setdDayCode(String dDayCode) {
		this.dDayCode = dDayCode;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
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
	public String getdDayContent() {
		return dDayContent;
	}
	public void setdDayContent(String dDayContent) {
		this.dDayContent = dDayContent;
	}
	public String getdDayDate() {
		return dDayDate;
	}
	public void setdDayDate(String dDayDate) {
		this.dDayDate = dDayDate;
	}
	public String getdDayWriteDate() {
		return dDayWriteDate;
	}
	public void setdDayWriteDate(String dDayWriteDate) {
		this.dDayWriteDate = dDayWriteDate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DDay [dDayCode=");
		builder.append(dDayCode);
		builder.append(", memId=");
		builder.append(memId);
		builder.append(", liCode=");
		builder.append(liCode);
		builder.append(", liName=");
		builder.append(liName);
		builder.append(", dDayContent=");
		builder.append(dDayContent);
		builder.append(", dDayDate=");
		builder.append(dDayDate);
		builder.append(", dDayWriteDate=");
		builder.append(dDayWriteDate);
		builder.append("]");
		return builder.toString();
	}

}

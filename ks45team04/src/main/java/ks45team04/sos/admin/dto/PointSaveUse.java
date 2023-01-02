package ks45team04.sos.admin.dto;

public class PointSaveUse {
	
	private String pointSaveUseCode;
	private String pointSaveUseId;
	private String pointSaveUseReason;
	private int pointSaveUsePoint;
	private int totalPoint;
	private String saveUse;
	private String saveUseDatetime;
	
	
	public String getPointSaveUseCode() {
		return pointSaveUseCode;
	}
	public void setPointSaveUseCode(String pointSaveUseCode) {
		this.pointSaveUseCode = pointSaveUseCode;
	}
	public String getPointSaveUseId() {
		return pointSaveUseId;
	}
	public void setPointSaveUseId(String pointSaveUseId) {
		this.pointSaveUseId = pointSaveUseId;
	}
	public String getPointSaveUseReason() {
		return pointSaveUseReason;
	}
	public void setPointSaveUseReason(String pointSaveUseReason) {
		this.pointSaveUseReason = pointSaveUseReason;
	}
	public int getPointSaveUsePoint() {
		return pointSaveUsePoint;
	}
	public void setPointSaveUsePoint(int pointSaveUsePoint) {
		this.pointSaveUsePoint = pointSaveUsePoint;
	}
	public int getTotalPoint() {
		return totalPoint;
	}
	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}
	public String getSaveUse() {
		return saveUse;
	}
	public void setSaveUse(String saveUse) {
		this.saveUse = saveUse;
	}
	public String getSaveUseDatetime() {
		return saveUseDatetime;
	}
	public void setSaveUseDatetime(String saveUseDatetime) {
		this.saveUseDatetime = saveUseDatetime;
	}
	
	
	@Override
	public String toString() {
		return "Point [pointSaveUseCode=" + pointSaveUseCode + ", pointSaveUseId=" + pointSaveUseId
				+ ", pointSaveUseReason=" + pointSaveUseReason + ", pointSaveUsePoint=" + pointSaveUsePoint
				+ ", totalPoint=" + totalPoint + ", saveUse=" + saveUse + ", saveUseDatetime=" + saveUseDatetime + "]";
	}

}

package ks45team04.sos.admin.dto;

public class PointSaveStandard {
	private String pointSaveStandardCode;
	private String pointSaveStandardContent;
	private int savePoint;
	private String pointSaveStandardId;
	
	
	public String getPointSaveStandardCode() {
		return pointSaveStandardCode;
	}
	public void setPointSaveStandardCode(String pointSaveStandardCode) {
		this.pointSaveStandardCode = pointSaveStandardCode;
	}
	public String getPointSaveStandardContent() {
		return pointSaveStandardContent;
	}
	public void setPointSaveStandardContent(String pointSaveStandardContent) {
		this.pointSaveStandardContent = pointSaveStandardContent;
	}
	public int getSavePoint() {
		return savePoint;
	}
	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}
	
	public String getPointSaveStandardId() {
		return pointSaveStandardId;
	}
	public void setPointSaveStandardId(String pointSaveStandardId) {
		this.pointSaveStandardId = pointSaveStandardId;
	}
	
	@Override
	public String toString() {
		return "PointSaveStandard [pointSaveStandardCode=" + pointSaveStandardCode + ", pointSaveStandardContent="
				+ pointSaveStandardContent + ", savePoint=" + savePoint + 
				", pointSaveStandardId=" + pointSaveStandardId + "]";
	}
}

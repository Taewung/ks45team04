package ks45team04.sos.member.dto;

public class MPointSaveStandard {
	
	private String pointSaveStandardCode;
	private String pointSaveStandardContent;
	private int savePoint;
	
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
	@Override
	public String toString() {
		return "MPointSaveStandard [pointSaveStandardCode=" + pointSaveStandardCode + ", pointSaveStandardContent="
				+ pointSaveStandardContent + ", savePoint=" + savePoint + "]";
	}
	
	
	
	
}

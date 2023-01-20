package ks45team04.sos.member.dto;

public class NotePurchaseReview {
	
	private String nprCode;
	private String noteCode;
	private String noteWriterId;
	private String liCode;
	private String noteReviewWriter;
	private String noteReviewContent;
	private String noteReviewScore;
	private String noteReviewPoint;
	private String pointDetailGroup;
	private String noteReviewRegDatetime;
	
	public String getNprCode() {
		return nprCode;
	}
	public void setNprCode(String nprCode) {
		this.nprCode = nprCode;
	}
	public String getNoteCde() {
		return noteCode;
	}
	public void setNoteCde(String noteCde) {
		this.noteCode = noteCde;
	}
	public String getNoteWriterId() {
		return noteWriterId;
	}
	public void setNoteWriterId(String noteWriterId) {
		this.noteWriterId = noteWriterId;
	}
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getNoteReviewWriter() {
		return noteReviewWriter;
	}
	public void setNoteReviewWriter(String noteReviewWriter) {
		this.noteReviewWriter = noteReviewWriter;
	}
	public String getNoteReviewContent() {
		return noteReviewContent;
	}
	public void setNoteReviewContent(String noteReviewContent) {
		this.noteReviewContent = noteReviewContent;
	}
	public String getNoteReviewScore() {
		return noteReviewScore;
	}
	public void setNoteReviewScore(String noteReviewScore) {
		this.noteReviewScore = noteReviewScore;
	}
	public String getNoteReviewPoint() {
		return noteReviewPoint;
	}
	public void setNoteReviewPoint(String noteReviewPoint) {
		this.noteReviewPoint = noteReviewPoint;
	}
	public String getPointDetailGroup() {
		return pointDetailGroup;
	}
	public void setPointDetailGroup(String pointDetailGroup) {
		this.pointDetailGroup = pointDetailGroup;
	}
	public String getNoteReviewRegDatetime() {
		return noteReviewRegDatetime;
	}
	public void setNoteReviewRegDatetime(String noteReviewRegDatetime) {
		this.noteReviewRegDatetime = noteReviewRegDatetime;
	}
	
	@Override
	public String toString() {
		return "NotePurchaseReview [nprCode=" + nprCode + ", noteCode=" + noteCode + ", noteWriterId=" + noteWriterId
				+ ", liCode=" + liCode + ", noteReviewWriter=" + noteReviewWriter + ", noteReviewContent="
				+ noteReviewContent + ", noteReviewScore=" + noteReviewScore + ", noteReviewPoint=" + noteReviewPoint
				+ ", pointDetailGroup=" + pointDetailGroup + ", noteReviewRegDatetime=" + noteReviewRegDatetime + "]";
	}
	
	
	
	
}

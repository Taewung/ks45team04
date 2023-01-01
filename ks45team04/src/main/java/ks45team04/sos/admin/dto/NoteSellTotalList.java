package ks45team04.sos.admin.dto;

public class NoteSellTotalList {

	private String nstlCode;
	private String noteCode;
	private String nstlId;
	private String liCode;
	private int noteReviewCount;
	private int noteSellCount;
	private int notePurchaseReviewAccumlate;
	private String reviewAccumlateFinal;
	
	public String getNstlCode() {
		return nstlCode;
	}
	public void setNstlCode(String nstlCode) {
		this.nstlCode = nstlCode;
	}
	public String getNoteCode() {
		return noteCode;
	}
	public void setNoteCode(String noteCode) {
		this.noteCode = noteCode;
	}
	public String getNstlId() {
		return nstlId;
	}
	public void setNstlId(String nstlId) {
		this.nstlId = nstlId;
	}
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public int getNoteReviewCount() {
		return noteReviewCount;
	}
	public void setNoteReviewCount(int noteReviewCount) {
		this.noteReviewCount = noteReviewCount;
	}
	public int getNoteSellCount() {
		return noteSellCount;
	}
	public void setNoteSellCount(int noteSellCount) {
		this.noteSellCount = noteSellCount;
	}
	public int getNotePurchaseReviewAccumlate() {
		return notePurchaseReviewAccumlate;
	}
	public void setNotePurchaseReviewAccumlate(int notePurchaseReviewAccumlate) {
		this.notePurchaseReviewAccumlate = notePurchaseReviewAccumlate;
	}
	public String getReviewAccumlateFinal() {
		return reviewAccumlateFinal;
	}
	public void setReviewAccumlateFinal(String reviewAccumlateFinal) {
		this.reviewAccumlateFinal = reviewAccumlateFinal;
	}
	
	
	@Override
	public String toString() {
		return "NoteSellTotalList [nstlCode=" + nstlCode + ", noteCode=" + noteCode + ", nstlId=" + nstlId + ", liCode="
				+ liCode + ", noteReviewCount=" + noteReviewCount + ", noteSellCount=" + noteSellCount
				+ ", notePurchaseReviewAccumlate=" + notePurchaseReviewAccumlate + ", reviewAccumlateFinal="
				+ reviewAccumlateFinal + "]";
	}


	
	
	
}

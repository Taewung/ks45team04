package ks45team04.sos.member.dto;

public class Note {
	private String noteCode;
	private String noteWriterId;
	private String liName;
	private String liCode;
	private String lsCode;
	private String noteName;
	private String noteInfo;
	private String notePrevFile;
	private String noteFile;
	private String notePrice;
	private String noteRegDate;
	
	public String getNoteCode() {
		return noteCode;
	}
	public void setNoteCode(String noteCode) {
		this.noteCode = noteCode;
	}
	public String getNoteWriterId() {
		return noteWriterId;
	}
	public void setNoteWriterId(String noteWriterId) {
		this.noteWriterId = noteWriterId;
	}
	public String getLiName() {
		return liName;
	}
	public void setLiName(String liName) {
		this.liName = liName;
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
	public String getNoteName() {
		return noteName;
	}
	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}
	public String getNoteInfo() {
		return noteInfo;
	}
	public void setNoteInfo(String noteInfo) {
		this.noteInfo = noteInfo;
	}
	public String getNotePrevFile() {
		return notePrevFile;
	}
	public void setNotePrevFile(String notePrevFile) {
		this.notePrevFile = notePrevFile;
	}
	public String getNoteFile() {
		return noteFile;
	}
	public void setNoteFile(String noteFile) {
		this.noteFile = noteFile;
	}
	public String getNotePrice() {
		return notePrice;
	}
	public void setNotePrice(String notePrice) {
		this.notePrice = notePrice;
	}
	public String getNoteRegDate() {
		return noteRegDate;
	}
	public void setNoteRegDate(String noteRegDate) {
		this.noteRegDate = noteRegDate;
	}
	
	@Override
	public String toString() {
		return "Note [noteCode=" + noteCode + ", noteWriterId=" + noteWriterId + ", liName=" + liName + ", liCode="
				+ liCode + ", lsCode=" + lsCode + ", noteName=" + noteName + ", noteInfo=" + noteInfo
				+ ", notePrevFile=" + notePrevFile + ", noteFile=" + noteFile + ", notePrice=" + notePrice
				+ ", noteRegDate=" + noteRegDate + "]";
	}
	
	
	

}

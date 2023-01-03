package ks45team04.sos.admin.dto;

public class DownloadRecord {
	private String dcrCode;
	private String noteCode;
	private String liCode;
	private String dcrId;
	private int noteDownloadCount;
	private String noteDownloadDatetime;
	private String noteDownloadAble;
	
	
	public String getNoteDownloadAble() {
		return noteDownloadAble;
	}
	public void setNoteDownloadAble(String noteDownloadAble) {
		this.noteDownloadAble = noteDownloadAble;
	}
	public String getDcrCode() {
		return dcrCode;
	}
	public void setDcrCode(String dcrCode) {
		this.dcrCode = dcrCode;
	}
	public String getNoteCode() {
		return noteCode;
	}
	public void setNoteCode(String noteCode) {
		this.noteCode = noteCode;
	}
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getDcrId() {
		return dcrId;
	}
	public void setDcrId(String dcrId) {
		this.dcrId = dcrId;
	}
	public int getNoteDownloadCount() {
		return noteDownloadCount;
	}
	public void setNoteDownloadCount(int noteDownloadCount) {
		this.noteDownloadCount = noteDownloadCount;
	}
	public String getNoteDownloadDatetime() {
		return noteDownloadDatetime;
	}
	public void setNoteDownloadDatetime(String noteDownloadDatetime) {
		this.noteDownloadDatetime = noteDownloadDatetime;
	}
	
	@Override
	public String toString() {
		return "DownloadRecord [dcrCode=" + dcrCode + ", noteCode=" + noteCode + ", liCode=" + liCode + ", dcrId="
				+ dcrId + ", noteDownloadCount=" + noteDownloadCount + ", noteDownloadDatetime=" + noteDownloadDatetime
				+ ", noteDownloadAble=" + noteDownloadAble + "]";
	}
	
	
	
	
	

}

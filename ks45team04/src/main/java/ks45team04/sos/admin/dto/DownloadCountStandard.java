package ks45team04.sos.admin.dto;

public class DownloadCountStandard {
	
	private String dscCode;
	private String downloadCount;
	private String downloadCountWriter;
	private String downloadCountDatetime;
	
	public String getDscCode() {
		return dscCode;
	}
	public void setDscCode(String dscCode) {
		this.dscCode = dscCode;
	}
	public String getDownloadCount() {
		return downloadCount;
	}
	public void setDownloadCount(String downloadCount) {
		this.downloadCount = downloadCount;
	}
	public String getDownloadCountWriter() {
		return downloadCountWriter;
	}
	public void setDownloadCountWriter(String downloadCountWriter) {
		this.downloadCountWriter = downloadCountWriter;
	}
	public String getDownloadCountDatetime() {
		return downloadCountDatetime;
	}
	public void setDownloadCountDatetime(String downloadCountDatetime) {
		this.downloadCountDatetime = downloadCountDatetime;
	}
	
	@Override
	public String toString() {
		return "DownloadCountStandard [dscCode=" + dscCode + ", downloadCount=" + downloadCount
				+ ", downloadCountWriter=" + downloadCountWriter + ", downloadCountDatetime=" + downloadCountDatetime
				+ "]";
	}
	
	
	
	
	
}

package ks45team04.sos.member.dto;

import java.util.List;

public class FileControl {
	private String fileGroupIdx;
	private String fileRegDate;
	private List<FileDto> fileDtoList;
	public String getFileGroupIdx() {
		return fileGroupIdx;
	}
	public void setFileGroupIdx(String fileGroupIdx) {
		this.fileGroupIdx = fileGroupIdx;
	}
	public String getFileRegDate() {
		return fileRegDate;
	}
	public void setFileRegDate(String fileRegDate) {
		this.fileRegDate = fileRegDate;
	}
	public List<FileDto> getFileDtoList() {
		return fileDtoList;
	}
	public void setFileDtoList(List<FileDto> fileDtoList) {
		this.fileDtoList = fileDtoList;
	}
	@Override
	public String toString() {
		return "FileControl [fileGroupIdx=" + fileGroupIdx + ", fileIdx=" + fileRegDate
				+ ", fileDtoList=" + fileDtoList + "]";
	} 
	
	
}

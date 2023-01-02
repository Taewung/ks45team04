package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.DownloadRecord;
import ks45team04.sos.admin.mapper.DownloadRecordMapper;

@Service
public class DownloadRecordService {

	private final DownloadRecordMapper downloadRecordMapper;
	
	public DownloadRecordService(DownloadRecordMapper downloadRecordMapper) {
		this.downloadRecordMapper = downloadRecordMapper;
	}
	
	// 노트구매자 다운로드 횟수 목록 조회
	public List<DownloadRecord> downloadRecordList(){
		
		List<DownloadRecord> downloadRecordList = downloadRecordMapper.DownloadRecordList();
		
		return downloadRecordList;
	}
}

package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.DownloadCountStandard;
import ks45team04.sos.admin.mapper.DownloadCountStandardMapper;

@Service
public class DownloadCountStandardService {

private final DownloadCountStandardMapper downloadCountStandardMapper;
	
	public DownloadCountStandardService(DownloadCountStandardMapper downloadCountStandardMapper) {
		this.downloadCountStandardMapper = downloadCountStandardMapper;
	}
	
	
	// 노트 다운로드 횟수 기준 조회
public List<DownloadCountStandard> DownloadCountStandardList(){
		
		List<DownloadCountStandard> downloadCountStandardList = downloadCountStandardMapper.DownloadCountStandardList();
		
		return downloadCountStandardList;
		
	}


}

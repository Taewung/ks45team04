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
	
	/**
	 * 특정 노트 다운로드 횟수 기준 수정
	 * @Param DownloadCountStandard
	 * @return int
	 */
	public int modifyDownloadCountStandard(DownloadCountStandard downloadCountStandard) {
		
		return downloadCountStandardMapper.modifyDownloadCountStandard(downloadCountStandard);
	}
	
	
	/**
	 * 특정 노트 다운로드 횟수 기준 조회
	 * @Param dscCode
	 * @return DownloadCountStandard
	 */
	public DownloadCountStandard getDownloadCountStandardInfoByCode(String dscCode) {
		
		return downloadCountStandardMapper.getDownloadCountStandardInfoByCode(dscCode);
	}
	
	
	/**
	 * 노트 다운로드 횟수 기준 등록
	 * @Param DownloadCountStandard
	 * @return int
	 */
	public int addDownloadCountStandard(DownloadCountStandard downloadCountStandard) {
		
		return downloadCountStandardMapper.addDownloadCountStandard(downloadCountStandard);
	}
	
	

	
	/**
	 * 노트 다운로드 횟수 기준 목록 조회
	 * @return List<DownloadCountStandard>
	 */
	public List<DownloadCountStandard> DownloadCountStandardList(){
		
		List<DownloadCountStandard> downloadCountStandardList = downloadCountStandardMapper.DownloadCountStandardList();
		
		return downloadCountStandardList;
		
	}


}

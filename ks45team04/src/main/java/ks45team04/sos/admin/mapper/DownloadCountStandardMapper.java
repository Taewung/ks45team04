package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.DownloadCountStandard;

@Mapper
public interface DownloadCountStandardMapper {

	// 관리자 인증
	public boolean getIdCheck(String inputId);
	
	// 노트 다운로드 횟수 기준 등록
	public int addDownloadCountStandard(DownloadCountStandard downloadCountStandard);
	
	// 노트 다운로드 횟수 기준 목록 조회
	public List<DownloadCountStandard> DownloadCountStandardList();
	
}

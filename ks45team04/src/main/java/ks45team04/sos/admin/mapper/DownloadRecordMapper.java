package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.DownloadRecord;

@Mapper
public interface DownloadRecordMapper {
	
	// 노트구매자 다운로드 횟수 조회
	public List<DownloadRecord> DownloadRecordList();
}

package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.DownloadRecord;

@Mapper
public interface DownloadRecordMapper {

	public List<DownloadRecord> DownloadRecordList();
}

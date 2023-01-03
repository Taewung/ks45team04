package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;

@Mapper
public interface LicenseInfoMapper {
	
	public List<LicenseInfo> LicenseInfoList();

}

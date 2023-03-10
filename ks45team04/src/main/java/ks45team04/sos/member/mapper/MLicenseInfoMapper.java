package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;

@Mapper
public interface MLicenseInfoMapper {
	
	
	// 자격증 정보 상세 조회
	public List<LicenseInfo> getLicenseInfo(String liCode);
	
	// 자격증 중분류별 자격증목록 조회
	public List<LicenseInfo> getLicenseInfoList(String lscCode);
	
	// 자격증 대분류별 중분류목록 조회
	public List<LicenseSub> getLicenseSubList(String lmcCode);
	
	// 자격증 대분류 목록 조회
	public List<LicenseMain> getLicenseMainList();
	
	// 자격증 정보 목록 조회
	public List<LicenseInfo> licenseInfoList();

}

package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;

@Mapper
public interface LicenseInfoMapper {
	
	// 특정 자격증 정보 수정
	public int modifyLicenseInfo(LicenseInfo licenseInfo);
	
	// 특정 자격증 정보 조회
	public LicenseInfo getLicenseInfoByCode(String liCode);
	
	// 관리자 아이디 인증
	public boolean getIdCheck(String inputId);
	
	// 자격증 정보 등록
	public int addLicenseInfo(LicenseInfo licenseInfo);
	
	// 자격증 정보 목록 조회
	public List<LicenseInfo> LicenseInfoList();

}

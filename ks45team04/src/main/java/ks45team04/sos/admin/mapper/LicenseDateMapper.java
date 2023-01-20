package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseDate;
import ks45team04.sos.admin.dto.LicenseInfo;

@Mapper
public interface LicenseDateMapper {
	
	// 특정 자격증 일정 수정
	public int modifyLicenseDate(LicenseDate licenseDate);
	
	// 특정 자격증 일정 조회
	public LicenseDate getLicenseDateInfoByCode(String ldCode);
	
	// 관리자 인증
	public boolean getIdCheck(String inputId);
	
	// 자격증 일정 등록
	public int addLicenseDate(LicenseDate licenseDate);
	
	// 자격증 일정 등록을 위한 자격증 정보 조회
	public List<LicenseInfo> licenseInfoList();
	
	// 자격증 일정 등록을 위한 목록 조회
	public List<LicenseDate> getLicenseDateList();
	
	// 자격증 일정 목록 조회
	public List<LicenseDate> LicenseDateList(String searchKey, String searchValue);
	

}

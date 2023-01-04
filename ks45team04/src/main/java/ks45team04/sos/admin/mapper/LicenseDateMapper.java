package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseDate;

@Mapper
public interface LicenseDateMapper {
	
	// 관리자 인증
	public boolean getIdCheck(String inputId);
	
	// 자격증 일정 등록
	public int addLicenseDate(LicenseDate licenseDate);
	
	
	// 자격증 일정 목록 조회
	public List<LicenseDate> LicenseDateList();
	

}

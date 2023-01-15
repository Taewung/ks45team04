package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseMain;

@Mapper
public interface LicenseMainMapper {
	

	// 특정 자격증 대분류 수정
	public int modifyLicenseMain(LicenseMain licenseMain);
	
	// 특정 자격증 대분류 조회
	public LicenseMain getLicenseMainByCode(String lmcCode);
	
	// 관리자 아이디 인증
	public boolean getIdCheck(String inputId);
	
	// 자격증 대분류 등록
	public int addLicenseMain(LicenseMain licenseMain);
	
	// 자격증 대분류 등록을 위한 목록 조회
	public List<LicenseMain> getlicenseMainList();
	
	// 자격증 대분류 목록 조회
	public List<LicenseMain> LicenseMainList(String searchKey, String searchValue);

}

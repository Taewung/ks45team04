package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseMain;

@Mapper
public interface LicenseMainMapper {
	

	// 자격증 코드 중복 조회
	public boolean checkLicenseCode(String lmcCode);
	
	// 자격증 대분류 등록
	public int addLicenseMain(LicenseMain licenseMain);
	
	// 자격증 대분류 목록 조회
	public List<LicenseMain> LicenseMainList();

}

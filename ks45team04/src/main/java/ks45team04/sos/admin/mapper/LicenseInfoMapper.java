package ks45team04.sos.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;

@Mapper
public interface LicenseInfoMapper {
	
	// 특정 자격증 정보 수정
	public int modifyLicenseInfo(LicenseInfo licenseInfo);
	
	// 특정 자격증 정보 조회
	public LicenseInfo getLicenseInfoByCode(String liCode);
	
	// 관리자 아이디 인증
	public boolean getIdCheck(String inputId);
	
	//자격증 대분류별 중분류목록 조회
	public List<LicenseSub> licenseSubList(String lmcCode);
	
	//자격증 정보등록을 위한 대분류 조회
	public List<LicenseMain> licenseMainList();
	
	// 자격증 정보 등록
	public int addLicenseInfo(LicenseInfo licenseInfo);
	
	// 자격증 정보 등록을 위한 목록 조회
	public List<LicenseInfo> getLicenseInfoList();
	
	// 자격증 정보 목록 조회
	public List<LicenseInfo> LicenseInfoList(Map<String,Object> paramMap);

	//자격증 정보 테이블 전체 행의 갯수
	public int getLicenseInfoCnt();
}

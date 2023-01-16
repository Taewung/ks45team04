package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSubject;

@Mapper
public interface LicenseSubjectMapper {
	
	// 특정 자격증 과목 수정
	public int modifyLicenseSubject(LicenseSubject licenseSubject);
	
	// 특정 자격증 과목 조회
	public LicenseSubject getLicenseSubjectByCode(String lsCode);
	
	// 관리자 아이디 인증
	public boolean getIdCheck(String inputId);
	
	// 자격증 과목 등록
	public int addLicenseSubject(LicenseSubject licenseSubject);
	
	//자격증 과목 등록을 위한 자격증 정보 조회
	public List<LicenseInfo> licenseInfoList();
	
	// 자격증 과목 등록을 위한 목록 조회
	public List<LicenseSubject> getLicenseSubjectList();
	
	// 자격증 과목 목록 조회
	public List<LicenseSubject> LicenseSubjectList(String searchKey, String searchValue);

}

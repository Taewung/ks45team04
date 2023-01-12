package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;

@Mapper
public interface LicenseSubMapper {
	
	// 특정 자격증 중분류 수정
	public int modifyLicenseSub(LicenseSub licenseSub);
	
	// 특정 자격증 중분류 조회
	public LicenseSub getLicenseSubByCode(String licenseSub);
	
	//관리자 아이디 인증
	public boolean getIdCheck(String inputId);
	
	// 자격증 중분류 등록
	public int addLicenseSub(LicenseSub licenseSub);
	
	// 자격증 중분류 중분류 등록을 위한 대분류 목록 조회
	public List<LicenseMain> licenseMainList();
	
	// 자격증 중분류 목록 조회
	public List<LicenseSub> LicenseSubList();
	
}

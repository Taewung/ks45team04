package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
@Mapper
	public interface ExamMapper {
	
	// 자격증 중분류별 자격증목록 조회
	public List<LicenseInfo> getLicenseList(String lscCode);
	
	// 자격증 대분류별 중분류목록 조회
	public List<LicenseSub> getLicenseSubList(String lmcCode);
	
	// 자격증 대분류 목록조회
	public List<LicenseMain> getLicenseMainList();
}

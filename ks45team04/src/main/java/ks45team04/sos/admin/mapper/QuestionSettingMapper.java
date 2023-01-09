package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;

@Mapper
public interface QuestionSettingMapper {
	// 자격증별 과목조회
	public List<LicenseSubject> getSubjectListForQSet(String liCode);
	
	// 자격증 중분류별 자격증목록 조회
	public List<LicenseInfo> getLicenseListForQSet(String lscCode);
	
	// 자격증 대분류별 중분류목록 조회
	public List<LicenseSub> getLicenseSubListForQSet(String lmcCode);
	
	// 자격증 대분류 목록조회
	public List<LicenseMain> getLicenseMainListForQSet();
	
	// 전체 문제목록 조회
	public List<Question> getQuestionList();

}

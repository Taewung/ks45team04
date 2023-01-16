package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.SubjectPassScore;

@Mapper
public interface SubjectPassScoreMapper {
	
	// 특정 과목합격기준점수 수정
	public int modifySubjectPassScore(SubjectPassScore subjectPassScore);
	
	// 특정 과목합격기준점수 조회
	public SubjectPassScore getSubjectPassScoreByCode(String lsPScoreCode);
	
	// 과목합격기준점수 등록
	public int addLsPScore(LicensePassScore licensePassScore);
	
	// 과목합격기준점수코드 자동생성
	public String getNewLsPScoreCode(String subjectPassScore, String lsPScoreCode);
	
	// 자격증 자격증별 과목목록조회
	public List<LicenseSubject> getSubListForLsPScore(String liCode);	
	
	// 자격증 과목별 과목정보조회
	public LicenseSubject getSubInfoForLsPScore(String lsCode);
	
	// 특정 자격증정보 조회
	public LicensePassScore getLiInfoForLsPScore(String liCode);
	
	// 특정 자격증코드 조회
	public SubjectPassScore getLiCodeForLsPScore(String liCode);
	
	// 자격증별 과목합격기준점수목록 조회
	public List<SubjectPassScore> getsubjectPassScoreList(String liCode);
}

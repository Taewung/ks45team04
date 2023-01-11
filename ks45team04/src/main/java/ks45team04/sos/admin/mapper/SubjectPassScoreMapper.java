package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.SubjectPassScore;

@Mapper
public interface SubjectPassScoreMapper {
	
	// 특정 과목합격기준점수 수정
	public int modifySubjectPassScore(SubjectPassScore subjectPassScore);
	
	// 특정 과목합격기준점수 조회
	public SubjectPassScore getSubjectPassScoreByCode(String lsPScoreCode);
	
	// 자격증별 과목합격기준점수목록 조회
	public List<SubjectPassScore> getsubjectPassScoreList(String liCode);
}

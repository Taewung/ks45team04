package ks45team04.sos.admin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.SubjectPassScore;
import ks45team04.sos.admin.mapper.SubjectPassScoreMapper;

@Service
public class SubjectPassScoreService {

	private static final Logger log = LoggerFactory.getLogger(SubjectPassScoreService.class);
	private final SubjectPassScoreMapper subjectPassScoreMapper;
	public SubjectPassScoreService(SubjectPassScoreMapper subjectPassScoreMapper) {
		this.subjectPassScoreMapper = subjectPassScoreMapper;
	}
	
	/**
	 * 특정 과목합격기준점수 수정
	 * @param subjectPassScore
	 * @return modifyResult
	 */
	public int modifySubjectPassScore(SubjectPassScore subjectPassScore) {	
		int modifyResult = subjectPassScoreMapper.modifySubjectPassScore(subjectPassScore);
		return modifyResult;
	}
	/**
	 * 특정 과목합격기준점수 조회
	 * @param lsPScoreCode
	 * @return subjectPassScoreByCode
	 */
	public SubjectPassScore getSubjectPassScoreByCode(String lsPScoreCode) {
		SubjectPassScore subjectPassScoreByCode = subjectPassScoreMapper.getSubjectPassScoreByCode(lsPScoreCode);
		return subjectPassScoreByCode;
	}	
	/**
	 * 자격증별 과목합격기준점수목록 조회
	 * @return List<SubjectPassScore>
	 */
	public List<SubjectPassScore> getsubjectPassScoreList(String licode){	
		List<SubjectPassScore> subjectPassScoreList = subjectPassScoreMapper.getsubjectPassScoreList(licode);
		return subjectPassScoreList;
	}
}

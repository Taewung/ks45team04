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
	 * 과목별 합격기준점수 조회
	 * @return List<SubjectPassScore>
	 */
	public List<SubjectPassScore> getsubjectPassScoreList(){	
		List<SubjectPassScore> subjectPassScoreList = subjectPassScoreMapper.getsubjectPassScoreList();
		return subjectPassScoreList;
	}

}

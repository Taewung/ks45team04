package ks45team04.sos.admin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSubject;
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
	/**
	 * 과목합격기준점수 등록
	 * @param licensePassScore
	 */
	public void addSubjectPassScore(SubjectPassScore subjectPassScore) {										
		subjectPassScoreMapper.addSubjectPassScore(subjectPassScore);
	}
	/**
	 * 과목합격기준점수코드 자동생성
	 * @param subjectPassScore
	 * @param lsPScoreCode
	 * @return newLsPScoreCode
	 */
	public String getNewLsPScoreCode(String subjectPassScore, String lsPScoreCode) {
		String newLsPScoreCode = subjectPassScoreMapper.getNewLsPScoreCode(subjectPassScore, lsPScoreCode);
		return newLsPScoreCode; 
	}
	/**
	 * 특정 과목정보조회
	 * @param lsCode
	 * @return LicenseSubject
	 */
	public LicenseSubject getLsInfoForLsPScore(String lsCode){
		LicenseSubject lsInfoForLsPScore = subjectPassScoreMapper.getLsInfoForLsPScore(lsCode);
		return lsInfoForLsPScore;
	}
	/**
	 * 특정 자격증 과목목록조회
	 * @param liCode
	 * @return List<LicenseSubject>
	 */
	public List<LicenseSubject> getLiSubListForLsPScore(String liCode){	
		List<LicenseSubject> liSubListForLsPScore = subjectPassScoreMapper.getLiSubListForLsPScore(liCode);
		return liSubListForLsPScore;
	}
	/**
	 * 특정 자격증정보 조회
	 * @param liCode
	 * @return LicenseInfo
	 */
	public LicensePassScore getLiInfoForLsPScore(String liCode){
		LicensePassScore liInfoForLsPScore = subjectPassScoreMapper.getLiInfoForLsPScore(liCode);
		return liInfoForLsPScore;
	}
	/**
	 * 특정 자격증코드 조회
	 * @param liCode
	 * @return liCode
	 */
	public SubjectPassScore getLiCodeForLsPScore(String liCode) {
		SubjectPassScore liCodeForLsPScore = subjectPassScoreMapper.getLiCodeForLsPScore(liCode);		
		return liCodeForLsPScore;
	}
}
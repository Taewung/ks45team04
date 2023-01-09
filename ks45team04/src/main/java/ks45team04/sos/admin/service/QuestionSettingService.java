package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.admin.mapper.QuestionSettingMapper;

@Service
public class QuestionSettingService {

	private final QuestionSettingMapper questionSettingMapper;
	
	public QuestionSettingService(QuestionSettingMapper questionSettingMapper) {
		this.questionSettingMapper = questionSettingMapper;
	}
	
	
	/**
	 * 자격증별 과목목록 조회
	 * @return 
	 */
	public List<LicenseSubject> getSubjectListForQSet(String liCode){
		List<LicenseSubject> subjectListForQSet = questionSettingMapper.getSubjectListForQSet(liCode);
		return subjectListForQSet;
	}
	/**
	 * 자격증 중분류별 자격증목록 조회
	 * @return List<licenseList>
	 */
	public List<LicenseInfo> getLicenseListForQSet(String lscCode){
		List<LicenseInfo> licenseListForQSet = questionSettingMapper.getLicenseListForQSet(lscCode);
		return licenseListForQSet;
	}
	
	/**
	 * 자격증 대분류별 중분류목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> getLicenseSubListForQSet(String lmcCode){
		List<LicenseSub> licenseSubListForQSet = questionSettingMapper.getLicenseSubListForQSet(lmcCode);
		return licenseSubListForQSet;
	}	
	/**
	 * 자격증 대분류목록 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> getLicenseMainListForQSet(){
		List<LicenseMain> licenseMainListForQSet = questionSettingMapper.getLicenseMainListForQSet();
		return licenseMainListForQSet;
	}
	/**
	 * 문제 정보 목록조회
	 * @return List<Question>
	 */
	public List<Question> getQuestionList(){
		List<Question> questionList = questionSettingMapper.getQuestionList();
		return questionList;
	}
}

	package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.member.dto.Exam;
import ks45team04.sos.member.mapper.ExamMapper;

@Service
public class ExamService{
	private final ExamMapper examMapper;
	public ExamService(ExamMapper examMapper) {
		this.examMapper = examMapper;
	}
	

	/**
	 * 시험지 생성
	 * @param exam
	 */
	public void addExamPaper(Exam exam) {
		examMapper.addExamPaper(exam);
	}
	/**
	 * 시험지PK 자동생성
	 * @param exam
	 * @param examCode
	 * @return newExamCode
	 */
	public String getNewExamCode(String exam, String examCode) {
		String newExamCode = examMapper.getNewExamCode(exam, examCode);
		return newExamCode;
	}
	/**
	 *  자격증 과목별 문제목록 조회
	 * @param liCode
	 * @param lsCode
	 * @return List<Question> 
	 */
	public List<Question> getQuestionList(String liCode){
		List<Question> questionList = examMapper.getQuestionList(liCode);
		return questionList;
	}
	/**
	 * 자격증별 과목목록 조회
	 * @param liCode
	 * @return List<LicenseSubject>
	 */
	public List<LicenseSubject> getSubjectListForExam(String liCode){
		List<LicenseSubject> subjectListForExam = examMapper.getSubjectListForExam(liCode);
		return subjectListForExam;
	}
	/**
	 * 자격증 중분류별 자격증목록 조회
	 * @param lscName
	 * @return List<licenseList>
	 */
	public List<LicenseInfo> getLiListForExam(String lscCode){
		List<LicenseInfo> liListForExam = examMapper.getLiListForExam(lscCode);
		return liListForExam;
	}
	/**
	 * 자격증 대분류별 중분류목록 조회
	 * @param lmcCode
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> getSubListForExam(String lmcCode){
		List<LicenseSub> subListForExam = examMapper.getSubListForExam(lmcCode);
		return subListForExam;
	}	
	/**
	 * 자격증 대분류 목록조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> getMainLisForExam(){
		List<LicenseMain> mainListForExam = examMapper.getMainLisForExam();
		return mainListForExam;
	}	
}

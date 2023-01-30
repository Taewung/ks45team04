package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.member.dto.Exam;

@Mapper
	public interface ExamMapper {
	
	// 시험지생성
	public int addExamPaper(Exam exam);
	// 시험지PK 자동생성
	public String getNewExamCode(String exam, String examCode);

	
	// 자격증 과목별 문제목록 조회
	// public List<Question> getQuestionList(String liCode, String lsCode);
	public List<Question> getQuestionList(String liCode);
	// 자격증별 과목목록조회
	public List<LicenseSubject> getSubjectListForExam(String liCode);	
	// 자격증 중분류별 자격증목록조회
	public List<LicenseInfo> getLiListForExam(String lscCode);
	// 자격증 대분류별 중분류목록조회
	public List<LicenseSub> getSubListForExam(String lmcCode);
	// 자격증 대분류 목록조회
	public List<LicenseMain> getMainLisForExam();	
}

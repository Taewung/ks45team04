package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Answer;
import ks45team04.sos.admin.dto.Explanation;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;

@Mapper
public interface QuestionSettingMapper {

	/* ------------------문제------------------ */
	// 전체 문제목록 조회
	public List<Question> getQuestionList(String searchKey, String searchValue);	
	// 자격증 대분류 목록조회
	public List<LicenseMain> getMainLisForQuestion();	
	// 자격증 대분류별 중분류목록조회
	public List<LicenseSub> getSubListForQuestion(String lmcCode);	
	// 자격증 중분류별 자격증목록조회
	public List<LicenseInfo> getLiListForQuestion(String lscCode);	
	// 자격증 자격증별 과목목록조회
	public List<LicenseSubject> getSubjectListForQuestion(String liCode);	
	// 자격증 과목별 과목정보조회
	public LicenseSubject getSubjectInfoForQuestion(String lsCode);	
	// 문제코드 자동생성
	public String getNewQuestionCode(String question, String questionCode);
	// 문제등록
	public int addQuestion(Question question);
	// 특정 문제정보 조회
	public Question getQuestionbyCode(String questionCode);
	// 특정 문제정보 수정
	public int modifyQuestion(Question question);
	
	/* ------------------답안------------------ */
	// 문제코드별 답안목록조회
	public List<Answer> getAnswerList(String questionCode);
	
	/* ------------------해설------------------ */
	// 문제코드별 해설목록조회
	public List<Explanation> getExplanationList(String questionCode);

}

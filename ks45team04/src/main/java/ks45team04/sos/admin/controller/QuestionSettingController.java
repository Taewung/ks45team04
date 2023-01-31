package ks45team04.sos.admin.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.Answer;
import ks45team04.sos.admin.dto.Explanation;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.admin.service.QuestionSettingService;

@Controller
public class QuestionSettingController {
	private static final Logger log = LoggerFactory.getLogger(QuestionSettingController.class);

	private final QuestionSettingService questionSettingService;
	
	public QuestionSettingController(QuestionSettingService questionSettingService) {
		this.questionSettingService = questionSettingService;
	}
	
	/* --------------문제/답안/해설--------------- */
	// 문제코드별 문제/답안/해설 상세정보 조회
	@GetMapping("/checkQSetting")
	public String checkQSetting(Model model) {
		model.addAttribute("title", "문제요소상세정보");
		return "admin/questionSetting/check_q_setting";
	}

	/* ------------------문제------------------ */
	// 문제수정 처리
	@PostMapping("/modifyQuestion")
	public String modifyQuestion(Question question) {
		question.setQuestionRegId("id002");
		questionSettingService.modifyQuestion(question);
		log.info("특정 문제수정 : {}", question);
		return "redirect:qSettingList";
	}
	// 문제수정 화면
	@GetMapping("/modifyQuestion")
	public String modifyQuestion(Model model, @RequestParam(value="questionCode", required=false) String questionCode) {
		Question questionByCode = questionSettingService.getQuestionbyCode(questionCode);
		model.addAttribute("questionByCode", questionByCode);		
		model.addAttribute("title", "문제수정");
		log.info("특정 문제조회 : {}", questionByCode);
		return "admin/questionSetting/modify_question";
	}
	// 문제등록 처리
	@PostMapping("/addQuestion")
	public String addQuestion(Question question) {
		// questionCode 자동생성
		String newQuestionCode = questionSettingService.getNewQuestionCode("question", "question_code");
		question.setQuestionRegId("id003");
		question.setQuestionCode(newQuestionCode);
		questionSettingService.addQuestion(question);
		log.info("문제등록 쿼리파라미터: {}", question);
		return "redirect:/qSettingList";
	}	
	// 문제등록 화면
	@GetMapping("/addQuestion")
	public String addQuestion(Model model) {
		// 대분류 목록조회
		List<LicenseMain> mainListForQuestion = questionSettingService.getMainLisForQuestion();
		model.addAttribute("mainListForQuestion", mainListForQuestion);
		log.info("대분류목록 : {}", mainListForQuestion);
		model.addAttribute("title", "문제등록");
		return "admin/questionSetting/add_question";
	}	
	// 특정 과목정보 조회
	@GetMapping("/getSubjectInfoForQuestion")
	@ResponseBody
	public LicenseSubject getSubjectInfoForQuestion (@RequestParam(value="lsCode") String lsCode){
		LicenseSubject subjectInfoForQuestion = questionSettingService.getSubjectInfoForQuestion(lsCode);
		log.info("특정 과목정보 조회 : {}", subjectInfoForQuestion);
		return subjectInfoForQuestion;
	}	
	// 자격증별 과목목록 조회
	@GetMapping("/getSubjectListForQuestion")
	@ResponseBody
	public List<LicenseSubject> getSubjectListForQuestion (@RequestParam(value="liCode") String liCode){
		List<LicenseSubject> subjectListForQuestion = questionSettingService.getSubjectListForQuestion(liCode);
		log.info("자격증별 과목목록 조회 : {}", subjectListForQuestion);
		return subjectListForQuestion;
	}	
	// 중분류별 자격증목록 조회
	@GetMapping("/getLicenseListForQuestion")
	@ResponseBody
	public List<LicenseInfo> getLicenseListForQuestion (@RequestParam(value="lscCode") String lscCode){

		List<LicenseInfo> liListForQuestion = questionSettingService.getLiListForQuestion(lscCode);
		log.info("중분류별 자격증목록 조회 : {}", liListForQuestion);
		return liListForQuestion;
	}	
	// 대분류별 중분류 조회
	@GetMapping("/getSubListForQuestion")
	@ResponseBody
	public List<LicenseSub> getSubListForQuestion (@RequestParam(value="lmcCode") String lmcCode){
		List<LicenseSub> subListForQuestion = questionSettingService.getSubListForQuestion(lmcCode);
		log.info("대분류별 중분류목록 조회 : {}", subListForQuestion);
		return subListForQuestion;
	}

	// 문제목록조회
	@GetMapping("/qSettingList")
	@SuppressWarnings("unchecked")
	public String qSettingList(Model model
							  ,@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage
							  ,@RequestParam(value="searchKey", required = false) String searchKey
							  ,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue) {
		Map<String, Object> paramMap = questionSettingService.getQuestionList(currentPage, searchKey, searchValue);
		int lastPage = (int) paramMap.get("lastPage");
		List<Question> questionList = (List<Question>) paramMap.get("questionList");
		int startPageNum = (int) paramMap.get("startPageNum");
		int endPageNum = (int) paramMap.get("endPageNum");
		
		model.addAttribute("title", "문제목록");
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("questionList", questionList);
		model.addAttribute("lastPage", lastPage);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);
		
		log.info("문제 목록조회 : {}", questionList);

		return "admin/questionSetting/q_setting_list";
	}
	
	/* ------------------답안------------------ */
	// 특정 답안수정 처리
	@PostMapping("/modifyAnswer")
	public String modifyAnswer(Answer answer) {
		answer.setAnswerRegId("id002"); 
		questionSettingService.modifyAnswer(answer);
		log.info("특정 문제수정 : {}", answer);
		String qCode = answer.getQuestionCode();
		return "redirect:/answerList?questionCode="+qCode;
	}
	// 특정 답안수정 화면
	@GetMapping("/modifyAnswer")
	public String modifyAnswer(Model model, @RequestParam(value="answerCode", required=false) String answerCode) {
		Answer answerByCode = questionSettingService.getAnswerByCode(answerCode);
		model.addAttribute("answerByCode", answerByCode);		
		model.addAttribute("title", "답안수정");
		log.info("특정 답안조회 : {}", answerByCode);
		return "admin/questionSetting/modify_Answer";
	}
	// 문제코드별 답안등록 처리
	@PostMapping("/addAnswer")
	public String addAnswer(Answer answer) {
		// answerCode 자동생성
		String newAnswerCode = questionSettingService.getNewAnswerCode("answer", "answer_code");
		answer.setAnswerRegId("id003");
		answer.setAnswerCode(newAnswerCode);
		questionSettingService.addAnswer(answer);
		log.info("답안등록 쿼리파라미터: {}", answer);
		String qCode = answer.getQuestionCode(); 
		return "redirect:/answerList?questionCode="+qCode;
	}	
	// 문제코드별 답안등록 화면
	@GetMapping("/addAnswer")
	public String addAnswer(Model model,@RequestParam(value="questionCode", required=false) String questionCode) {
		Question questionCodeForQSet = questionSettingService.getQuestionCodeForQSet(questionCode);
		model.addAttribute("questionCodeForQSet", questionCodeForQSet);
		model.addAttribute("title", "답안등록");
		log.info("특정 문제코드 조회 : {}", questionCodeForQSet);
		return "admin/questionSetting/add_Answer";
	}
	// 문제코드별 답안목록조회
	@GetMapping("/answerList")
	public String answerList(Model model
							,@RequestParam(value="questionCode", required=false) String questionCode) {		
		Question questionCodeForQSet = questionSettingService.getQuestionCodeForQSet(questionCode);		
		List<Answer> answerList = questionSettingService.getAnswerList(questionCode);				
		model.addAttribute("answerList", answerList);
		model.addAttribute("title", "답안목록");
		model.addAttribute("questionCodeForQSet", questionCodeForQSet);
		log.info("문제코드별 답안목록조회 : {}", answerList);
		return "admin/questionSetting/answer_list";
	}
	
	/* ------------------해설------------------ */
	// 문제코드별 해설수정 처리
	@PostMapping("/modifyExplanation")
	public String modifyExplanation(Explanation explanation) {
		explanation.setExplanationRegId("id002");
		questionSettingService.modifyExpalantion(explanation);
		log.info("특정 해설수정 : {}", explanation);
		String qCode = explanation.getQuestionCode();
		return "redirect:/explanationList?questionCode="+qCode;
	}
	// 문제코드별 해설수정 화면
	@GetMapping("/modifyExplanation")
	public String modifyExplanation(Model model, @RequestParam(value="explainCode", required=false) String explainCode) {
		Explanation explanationByCode = questionSettingService.getExplanationByCode(explainCode);
		model.addAttribute("explanationByCode", explanationByCode);
		model.addAttribute("title","해설수정");
		log.info("특정 해설조회 : {}", explanationByCode);
		return "admin/questionSetting/modify_explanation"; 
	}
	// 문제코드별 해설등록 처리
	@PostMapping("/addExplanation")
	public String addExplanation(Explanation explanation) {
		// explainCode 자동생성
		String newExplainCode = questionSettingService.getNewExplainCode("explanation", "explain_code");
		explanation.setExplanationRegId("id002");
		explanation.setExplainCode(newExplainCode);
		questionSettingService.addExplanation(explanation);
		log.info("해설등록 쿼리파라미터: {}", explanation);
		String qCode = explanation.getQuestionCode();
		return "redirect:/explanationList?questionCode="+qCode;
	}	
	// 문제코드별 해설등록 화면
	@GetMapping("/addExplanation")
	public String addExplanation(Model model, @RequestParam(value="questionCode", required=false) String questionCode) {
		Question questionCodeForQSet = questionSettingService.getQuestionCodeForQSet(questionCode);
		model.addAttribute("questionCodeForQSet", questionCodeForQSet);
		model.addAttribute("title", "해설등록");
		log.info("특정 문제코드 조회 : {}", questionCodeForQSet);
		return "admin/questionSetting/add_explanation";
	}
	// 문제코드별 해설목록 조회
	@GetMapping("/explanationList")
	public String explanationList(@RequestParam(value="questionCode", required=false) String questionCode, Model model) {
		Question questionCodeForQSet = questionSettingService.getQuestionCodeForQSet(questionCode);
		List<Explanation> explanationList = questionSettingService.getExplanationList(questionCode);
		model.addAttribute("questionCodeForQSet", questionCodeForQSet);
		model.addAttribute("explanationList", explanationList);
		model.addAttribute("title", "해설목록");
		log.info("문제코드별 해설조회 : {}", questionCode);
		return "admin/questionSetting/explanation_list";
	}
}
package ks45team04.sos.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.catalina.mapper.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import ks45team04.sos.admin.controller.QuestionSettingController;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.member.dto.Exam;
import ks45team04.sos.member.service.ExamService;

@Controller
public class ExamController {
	private static final Logger log = LoggerFactory.getLogger(QuestionSettingController.class);
	private final ExamService examService;
	
	public ExamController(ExamService examService) {
		this.examService = examService;
	}
	
	@GetMapping("/checkExamResult")
	public String checkExamResultList(Model model) {
		model.addAttribute("title", "응시결과상세조회");
		return "member/exam/check_exam_result";
	}
	@GetMapping("/examResultList")
	public String examResultList(Model model) {
		model.addAttribute("title", "응시결과목록");
		return "member/exam/exam_result_list";
	}
	// 시험풀이등록처리	
	//시험풀이화면
	@GetMapping("/addExamAnswer")
	public String addExamAnswer(Model model) {
		model.addAttribute("title", "시험풀이");
		return "member/exam/add_exam_answer";
	}
	// 시험지 등록처리
	@PostMapping("/addExamPaper")
	@ResponseBody
	public String addExamPaper(@RequestParam Map<Object, String> param) {	

		String json = param.get("list").toString();
	    ObjectMapper mapper = new ObjectMapper();
	    
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    
		List<Question> questionList = null;
	    try{
	    	questionList = mapper.readValue(json, new TypeReference<ArrayList<Question>>(){});
	    }catch(Exception e){
	    	e.printStackTrace();
	    }    
	    log.info("시험지생성 쿼리파라미터: {}", questionList);	
			
		
		return "redirect:/addExamAnswer";
	} 
	// 자격증별 시험선택 화면
	@GetMapping("/addExamPaper")
	public String addExamPaper(@RequestParam(value="liCode",  required=false) String liCode, Model model) {
		List<LicenseMain> mainListForExam  = examService.getMainLisForExam();	
		List<LicenseSub> subListForExam = examService.getSubListForExam(mainListForExam.get(0).getLmcCode());
		List<LicenseInfo> liListForExam = examService.getLiListForExam(subListForExam.get(0).getLscCode());
		List<LicenseSubject> subjectListForExam = examService.getSubjectListForExam(liListForExam.get(0).getLiCode());		
		List<Question> questionList = examService.getQuestionList(liCode);
		
		model.addAttribute("title", "시험지생성");	
		model.addAttribute("mainListForExam", mainListForExam);
		model.addAttribute("subjectListForExam", subjectListForExam);	
		model.addAttribute("questionList", questionList);
		
		log.info("대분류 목록조회 : {}", mainListForExam);
		log.info("자격증별 과목목록조회 : {}", subjectListForExam);
		log.info("자격증 과목별 문제목록조회 : {}", questionList);
		
		return "member/exam/add_exam_paper";
	}
	// 자격증 과목별 문제목록 조회
	@GetMapping("/getQuestionForExam")
	@ResponseBody
	public List<Question> getQuestionList(@RequestParam(value="liCode") String liCode){
		List<Question> questionList = examService.getQuestionList(liCode);
		return questionList;
	}
	// 자격증 과목목록 조회
	@GetMapping("/getSubjectListForExam")
	@ResponseBody
	public List<LicenseSubject> getSubjectListForExam(@RequestParam(value="liCode") String liCode){
		List<LicenseSubject> subjectListForExam = examService.getSubjectListForExam(liCode);		
		log.info("자격증별 과목목록조회 : {}", subjectListForExam);
		return subjectListForExam;
	}	
	// 중분류별 자격증목록 조회
	@GetMapping("/getLiListForExam")
	@ResponseBody
	public List<LicenseInfo> getLiListForExam (@RequestParam(value="lscCode") String lscCode){
		List<LicenseInfo> liListForExam = examService.getLiListForExam(lscCode);
		log.info("중분류별 자격증목록 조회 : {}", liListForExam);
		return liListForExam;
	}	
	// 대분류별 중분류 조회
	@GetMapping("/getSubListForExam")
	@ResponseBody
	public List<LicenseSub> getSubListForExam (@RequestParam(value="lmcCode") String lmcCode){
		List<LicenseSub> subListForExam = examService.getSubListForExam(lmcCode);
		log.info("대분류별 중분류목록 조회 : {}", subListForExam);
		return subListForExam;
	}
}
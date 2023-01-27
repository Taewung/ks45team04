package ks45team04.sos.member.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks45team04.sos.admin.controller.QuestionSettingController;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.DDay;
import ks45team04.sos.member.dto.Note;
import ks45team04.sos.member.dto.ToDoList;
import ks45team04.sos.member.mapper.PlannerMapper;
import ks45team04.sos.member.service.PlannerService;

@Controller
public class PlannerController {
	private static final Logger log = LoggerFactory.getLogger(QuestionSettingController.class);
	private final 	PlannerService plannerService;
	private final 	PlannerMapper plannerMapper;

	public PlannerController(PlannerService plannerService
									  ,PlannerMapper plannerMapper) {
		
		this.plannerService = plannerService;
		this.plannerMapper = plannerMapper;
	}

	// 일정 등록 처리
	@PostMapping("/addToDoList")
	public String addToDoList(ToDoList toDoList) {

		plannerService.addToDoList(toDoList);

		return "redirect:/detailToDoList";
	}

	// 일정 등록 화면
	@GetMapping("/addToDoList")
	public String addToDoList(Model model) {

		List<ToDoList> toDoListDetailList = plannerMapper.toDoListDetailList();

		model.addAttribute("title", "일정 등록");
		model.addAttribute("toDoListDetailList", toDoListDetailList);

		return "member/planner/to_do_list_list";
	}

	// 일정 정보 수정 처리
	@PostMapping("/modifyToDoList")
	public String modifyToDoList(ToDoList ToDoList) {

		plannerService.modifyToDoList(ToDoList);

		return "redirect:/detailToDoList";
	}

	// 일정 수정 화면
	@GetMapping("/modifyToDoList")
	public String modifyToDoList(@RequestParam(value = "toDoListCode") String toDoListCode, Model model) {
		ToDoList toDoList = plannerService.getToDoListByCode(toDoListCode);

		model.addAttribute("title", "일정 정보 수정");
		model.addAttribute("toDoList", toDoList);

		return "member/planner/to_do_list_modify";
	}

	// 일정 삭제 처리
	@GetMapping("/deleteToDoList")
	public String deleteToDoList(ToDoList toDoList, RedirectAttributes reAttr) {
		String toDoListCode = toDoList.getToDoListCode();
		String redirectURI = "redirect:/detailToDoList";

		plannerService.deleteToDoList(toDoListCode);

		return redirectURI;
	}

//	// 일정 삭제 화면
//	@GetMapping("/deleteToDoList")
//	public String deleteToDoList(@RequestParam(value = "toDoListCode") String toDoListCode, Model model) {
//		model.addAttribute("title", "일정 삭제");
//		model.addAttribute("toDoListInfo", "일정 삭제");
//		return "member/planner/to_do_list_delete";
//	}
	
	// 코드별 일정 조회
		@GetMapping("/getToDoListByCode")
		public String getToDoListByCode(Model model,@RequestParam(name="toDoListCode", required = false) String toDoListCode) {
			model.addAttribute("title", "코드별 일정 조회");
			model.addAttribute("toDoListCode", toDoListCode);
			
			return "member/planner/stopwatch_record";
		}

	// 일정 조회
	@GetMapping("/listToDoList")
	public String listToDoList(Model model) {
		model.addAttribute("title", "일정 조회");
		return "member/planner/to_do_list_list";
	}

	// 일정 상세
	@GetMapping("/detailToDoList")
	public String detailToDoList(Model model) {

		List<ToDoList> toDoListDetailList = plannerService.toDoListDetailList();

		model.addAttribute("title", "일정 상세");
		model.addAttribute("toDoListDetailList", toDoListDetailList);
		System.out.println("toDoListDetailList>>>>>"+ toDoListDetailList);
		return "member/planner/to_do_list_detail";
	}
	
	//일정 
	@GetMapping("/ajax/detailToDoList")
	@ResponseBody
	public List<Map<String, Object>> detailToDoList(){
		List<ToDoList> toDoListDetailList = plannerService.toDoListDetailList();
		List<Map<String, Object>> toDoListMap = new ArrayList<Map<String, Object>>();
		Map<String, Object> toDo = null;
		for( ToDoList todoList : toDoListDetailList) {
			toDo = new HashMap<String, Object>();
			toDo.put("_id", todoList.getToDoListCode());
			toDo.put("description", todoList.getLiName());
			toDo.put("type", todoList.getLiName());
			toDo.put("title", todoList.getToDoListTitle());
			toDo.put("start", todoList.getToDoListDay());
			toDo.put("end", todoList.getToDoListDay());
			toDo.put("username", todoList.getLiName());
			toDo.put("backgroundColor", "#D25565");
			toDo.put("textColor", "#ffffff");
			toDoListMap.add(toDo);
		}
		System.out.println(toDoListMap);
		return toDoListMap;
	}

	//스톱워치 기록
	@GetMapping("/recordStopwatch")
	public String recordStopwatch(@RequestParam(name="toDoListCode", required = false) String toDoListCode, Model model) {
		model.addAttribute("title", "스톱워치 기록");
		model.addAttribute("toDoListCode", toDoListCode);
		//model.addAttribute("stopwatchTime", "00:00:04");
		return "member/planner/stopwatch_record";
	}
	//스톱워치 기록
	@PostMapping("/recordStopwatch")
	public String recordStopwatch( @RequestParam(value="toDoListCode", required = false) String toDoListCode,Model model
												,@RequestParam(value="stopwatchTime", required = false) String stopwatchTime) {
		System.out.println("toDoListCode : " + toDoListCode);
		System.out.println("stopwatchTime : " + stopwatchTime);
		
		//update 처리
		plannerMapper.modifyToDoListStopWatch(stopwatchTime, toDoListCode);
		
		return "redirect:/detailToDoList";
	}

	// 공부시간 기록
	@GetMapping("/listStudyTime")
	public String listStudyTime(Model model) {
		List<ToDoList> toDoListDetailList = plannerService.toDoListDetailList();

		model.addAttribute("title", "일정 상세");
		model.addAttribute("toDoListDetailList", toDoListDetailList);
		return "member/planner/study_list";
	}

	
	// 디데이 정보 수정 처리
		@PostMapping("/modifyDDay")
		public String modifyDDay(DDay dDay) {

			plannerService.modifyDDay(dDay);

			return "redirect:/detailDDay";
		}

	
	// 디데이 수정 화면
		@GetMapping("/modifyDDay")
		public String modifyDDay(@RequestParam(value = "dDayCode") String dDayCode, Model model) {
			DDay dDay = plannerService.getDDayByCode(dDayCode);
			List<LicenseInfo> licenseInfoList = plannerService.licenseInfoList();

			model.addAttribute("title", "디데이 정보 수정");
			model.addAttribute("dDay", dDay);
			model.addAttribute("licenseInfoList", licenseInfoList);

			return "member/planner/d_day_modify";
		}
	
		
	// 디데이 등록 코드별 이름
		@GetMapping("/getliName")
		    @ResponseBody
		    public LicenseInfo getliName(@RequestParam(value="liCode") String liCode) {
			LicenseInfo getliName = plannerService.getliName(liCode);
		       
			log.info("디데이 등록 코드별 이름 : {}", getliName);
			
		        return getliName;
		    }
	
	//디데이 등록 처리
	@PostMapping("/addDDay")
	public String addDDay(DDay dDay) {
		
		plannerService.addDDay(dDay);
		
		log.info("디데이 등록처리 : {}", dDay);
		return "redirect:/detailDDay";
	}
	
	// 디데이 등록 화면
	@GetMapping("/addDDay")
	public String addDDay(Model model) {
		List<LicenseInfo> licenseInfoList = plannerService.licenseInfoList();
		
		model.addAttribute("licenseInfoList", licenseInfoList);
		model.addAttribute("title", "디데이 등록");
		
		log.info("라이센스인포 이름 : {}", licenseInfoList);
		
		return "member/planner/d_day_insert";
	}

	

	// 일정 삭제 처리
	@GetMapping("/deleteDDay")
	public String deleteDDayByCode(DDay dDay, RedirectAttributes reAttr) {
		String dDayCode = dDay.getdDayCode();
		String redirectURI = "redirect:/detailDDay";

		plannerService.deleteDDayByCode(dDayCode);

		return redirectURI;
	}
		

	// 디데이 상세
	@GetMapping("/detailDDay")
	public String detailDDay(Model model) {
		List<DDay> dDayDetailList = plannerService.dDayDetailList();
		model.addAttribute("title", "디데이 상세");
		model.addAttribute("dDayDetailList", dDayDetailList);
		return "member/planner/d_day_detail";
	}
	
	// 디데이 보기
	@GetMapping("/DDayDDay")
	
	public String DDayDDay(@RequestParam(value="dDayCode" ,required = false) String dDayCode
				,Model model) {
		DDay dDay = plannerService.getDDayByCode(dDayCode);
			model.addAttribute("ddayInfo", dDay);
			
			return "member/planner/d_day_d_day";
		}

}

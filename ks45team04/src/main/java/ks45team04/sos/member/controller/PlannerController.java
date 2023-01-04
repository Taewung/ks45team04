package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.member.dto.ToDoList;
import ks45team04.sos.member.service.PlannerService;

@Controller
public class PlannerController {
	
private final 	PlannerService plannerService;

	public PlannerController(PlannerService plannerService) {
		this.plannerService = plannerService;
	}
		//일정 등록
		@GetMapping("/addToDoList")
		public String addToDoList(Model model) {
			model.addAttribute("title", "일정 등록");
			return "member/planner/to_do_list_insert";
		}
	
		//일정 수정
		@GetMapping("/modifyToDoList")
		public String modifyToDoList(Model model) {
			model.addAttribute("title", "일정 수정");
			return "member/planner/to_do_list_modify";
		}
	
		//일정 삭제
		@GetMapping("/deleteToDoList")
		public String deleteToDoList(Model model) {
			model.addAttribute("title", "일정 삭제");
			return "member/planner/to_do_list_delete";
		}
		
		//일정 조회
		@GetMapping("/listToDoList")
		public String listToDoList(Model model) {
			model.addAttribute("title", "일정 조회");
			return "member/planner/to_do_list_list";
		}
		
		//일정 상세
		@GetMapping("/detailToDoList")
		public String detailToDoList(Model model) {
			
			List<ToDoList> toDoListDetailList = plannerService.toDoListDetailList();
			
			model.addAttribute("title", "일정 상세");
			model.addAttribute("toDoListDetailList", toDoListDetailList);
			
			return "member/planner/to_do_list_detail";
		}
		
		//스톱워치 기록
		@GetMapping("/recordStopwatch")
		public String recordStopwatch(Model model) {
			model.addAttribute("title", "스톱워치 기록");
			return "member/planner/stopwatch_record";
		}
		
		//공부시간 기록
		@GetMapping("/listStudyTime")
		public String listStudyTime(Model model) {
			model.addAttribute("title", "공부시간 기록");
			return "member/planner/study_list";
		}
		
		//디데이 등록
		@GetMapping("/addDDay")
		public String addDDay(Model model) {
			model.addAttribute("title", "디데이 등록");
			return "member/planner/d_day_insert";
		}
		
		//디데이 수정
		@GetMapping("/modifyDDay")
		public String modifyDDay(Model model) {
			model.addAttribute("title", "디데이 수정");
			return "member/planner/d_day_modify";
		}
		
		//디데이 삭제
		@GetMapping("/deleteDDay")
		public String deleteDDay(Model model) {
			model.addAttribute("title", "디데이 삭제");
			return "member/planner/d_day_delete";
		}
		
		//디데이 상세
		@GetMapping("/detailDDay")
		public String detailDDay(Model model) {
			model.addAttribute("title", "디데이 상세");
			return "member/planner/d_day_detail";
		}
}

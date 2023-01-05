package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.ToDoList;
import ks45team04.sos.member.mapper.PlannerMapper;

@Service
public class PlannerService {

	private final PlannerMapper plannerMapper;

	public PlannerService(PlannerMapper plannerMapper) {
		this.plannerMapper = plannerMapper;
	}
	
	/**
	 * 일정 상세 리스트
	 * @return List<ToDoList>
	 */
	public List<ToDoList> toDoListDetailList(){
		List<ToDoList> toDoListDetailList = plannerMapper.toDoListDetailList();
		
		return toDoListDetailList;
		
	}
	
	/**
	 * 일정 등록
	 * @param toDoList
	 * @return int
	 */
	public int addToDoList(ToDoList toDoList) {
		
		return plannerMapper.addToDoList(toDoList);
	}
}

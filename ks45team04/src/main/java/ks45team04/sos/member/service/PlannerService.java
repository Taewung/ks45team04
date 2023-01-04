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
	
	//투두리스트 상세 조회
	public List<ToDoList> toDoListDetailList(){
		List<ToDoList> toDoListDetailList = plannerMapper.toDoListDetailList();
		
		return toDoListDetailList;
		
	}
}

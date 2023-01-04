package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.ToDoList;

@Mapper	
public interface PlannerMapper {
	
	//투두리스트 상세 조회
		public List<ToDoList> toDoListDetailList();
}

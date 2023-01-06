package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.ToDoList;

@Mapper	
public interface PlannerMapper {
	
	//일정 상세 조회
		public List<ToDoList> toDoListDetailList();
		
	//일정 등록
		public int addToDoList(ToDoList toDoList);
		
	//특정 일정 정보 수정
		public int modifyToDoList(ToDoList toDoList);
		
	//특정 일정 정보 조회	
		public ToDoList getToDoListByCode(String toDoListCode);
}

package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.DDay;
import ks45team04.sos.member.dto.ToDoList;

@Mapper	
public interface PlannerMapper {
	
	//특정 디데이 수정
		public int modifyDDay(DDay dDay);
	
	//디데이 상세 조회
		public DDay getDDayByCode(String dDayCode);
	
	//디데이 조회
		public List<DDay> dDayDetailList();
	
	//디데이 등록
		public int addDDay(DDay dDay);
	
	//일정 상세 조회
		public List<ToDoList> toDoListDetailList();
		
	//일정 등록
		public int addToDoList(ToDoList toDoList);
		
	//특정 일정 정보 수정
		public int modifyToDoList(ToDoList toDoList);
		
	//특정 일정 정보 조회	
		public ToDoList getToDoListByCode(String toDoListCode);
		
	//일정 코드로 일정 삭제
		public int deleteToDoListByCode(String toDoListCode);
		
	//투두리스트 스탑워치 시간 수정
		public int modifyToDoListStopWatch(String stopwatchTime,String toDoListCode);
}

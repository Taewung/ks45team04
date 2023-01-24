package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.DDay;
import ks45team04.sos.member.dto.ToDoList;
import ks45team04.sos.member.mapper.PlannerMapper;

@Service
public class PlannerService {

	private final PlannerMapper plannerMapper;

	public PlannerService(PlannerMapper plannerMapper) {
		this.plannerMapper = plannerMapper;
	}

	
	
	/**
	 * 특정 디데이 삭제
	 * @param dDayCode
	 */
	public void deleteDDayByCode(String dDayCode) {
		
		plannerMapper.deleteDDayByCode(dDayCode);
		
	}
	
	
	/**
	 * 특정 디데이 수정
	 * @param toDoList
	 * @return
	 */
	public int modifyDDay(DDay dDay) {
		
		return plannerMapper.modifyDDay(dDay);
	}
	
	public LicenseInfo getliName(String liCode) {
		
		LicenseInfo getliName = plannerMapper.getliName(liCode);
		
		return getliName;
		
	}
	
	
	/**
	 * 노트 등록을 위한 자격증 정보 조회
	 * @param Note
	 */
	public List<LicenseInfo> licenseInfoList(){
		
		List<LicenseInfo> licenseInfoList = plannerMapper.licenseInfoList();
		
		return licenseInfoList;
	}
	
	
	/**
	 * 디데이 등록
	 * @param dDay
	 * @return
	 */
	public int addDDay(DDay dDay) {
		
		return plannerMapper.addDDay(dDay);
	}
	
	
	/**
	 * 코드별 디데이
	 * @param dDayCode
	 * @return
	 */
	public DDay getDDayByCode(String dDayCode) {
		
		return plannerMapper.getDDayByCode(dDayCode);
	}
	
	/**
	 * 디데이 목록 조회
	 * @return List<DDay>
	 */
	
	public List<DDay> dDayDetailList(){
		List<DDay> dDayDetailList = plannerMapper.dDayDetailList();
		
		return dDayDetailList;
	
	}
	
	/**
	 * 특정 일정 삭제
	 * @param toDoListCode
	 * @return toDoList
	 */
	public void deleteToDoList(String toDoListCode) {
		
	
		plannerMapper.deleteToDoListByCode(toDoListCode);
		
		
		
	}
	
	/**
	 * 특정 일정 정보 수정
	 * @param toDoList
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyToDoList(ToDoList toDoList) {
		
		return plannerMapper.modifyToDoList(toDoList);
	}
	
	
	/**
	 * 특정 일정 정보 조회
	 * @param toDoListCode
	 * @return toDoList
	 */
	public ToDoList getToDoListByCode(String toDoListCode) {
		
		return plannerMapper.getToDoListByCode(toDoListCode);
	}
	
	/**
	 * 일정 등록
	 * @param toDoList
	 * @return int
	 */
	public int addToDoList(ToDoList toDoList) {
		
		return plannerMapper.addToDoList(toDoList);
	}
	
	/**
	 * 일정 상세 리스트
	 * @return List<ToDoList>
	 */
	public List<ToDoList> toDoListDetailList(){
		List<ToDoList> toDoListDetailList = plannerMapper.toDoListDetailList();
		
		return toDoListDetailList;
		
	}
	
}

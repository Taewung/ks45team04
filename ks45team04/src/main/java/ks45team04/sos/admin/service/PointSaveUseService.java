package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.PointSaveUse;
import ks45team04.sos.admin.mapper.PointSaveUseMapper;

@Service
public class PointSaveUseService {

	private final PointSaveUseMapper pointSaveUseMapper;

	public PointSaveUseService(PointSaveUseMapper pointSaveUseMapper) {
		this.pointSaveUseMapper = pointSaveUseMapper;
	}
	
	//포인트 적립/사용 내역 조회
	public List<PointSaveUse> PointSaveUseList(){
		
		List<PointSaveUse> pointSaveUseList = pointSaveUseMapper.PointSaveUseList();
		
		return pointSaveUseList;
	}
	
}

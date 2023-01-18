package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.PointSaveStandard;
import ks45team04.sos.admin.dto.PointSaveUse;
import ks45team04.sos.admin.mapper.PointSaveUseMapper;

@Service
public class PointSaveUseService {

	private final PointSaveUseMapper pointSaveUseMapper;

	public PointSaveUseService(PointSaveUseMapper pointSaveUseMapper) {
		this.pointSaveUseMapper = pointSaveUseMapper;
	}

	// 포인트 적립/사용 등록
	public int pointSaveUseadd(PointSaveUse pointSaveUse) {

		return pointSaveUseMapper.pointSaveUseAdd(pointSaveUse);
	}

	/**
	 * 포인트 적립 기준 내용 목록 조회
	 * 
	 * @return List<PointSaveStandard>
	 *//*
		 * public List<PointSaveStandard> getPointSaveStandardContent(){
		 * List<PointSaveStandard> pointSaveUseContent =
		 * pointSaveUseMapper.getPointSaveContent(); return pointSaveUseContent; }
		 */

	/**
	 * pointSaveUseCode 자동생성
	 * 
	 * @param pointSaveUse
	 * @param pointSaveUseCode
	 * @return newPointSaveUseCode
	 */
	public String getPointSaveUseCode(String pointSaveUse, String pointSaveUseCode) {
		String newPointSaveUseCode = pointSaveUseMapper.getPointSaveUseCode(pointSaveUse, pointSaveUseCode);
		return newPointSaveUseCode;
	}

	// 포인트 적립/사용 내역 조회
	public List<PointSaveUse> PointSaveUseList(String searchKey, String searchValue) {

		if (searchKey != null) {
			switch (searchKey) {
			case "pointSaveUseId":
				searchKey = "point_save_use_id";
				break;
			}
		}

		List<PointSaveUse> pointSaveUseList = pointSaveUseMapper.pointSaveUseList(searchKey, searchValue);

		return pointSaveUseList;
	}

}

package ks45team04.sos.admin.service;


import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.PointSaveStandard;
import ks45team04.sos.admin.mapper.PointSaveStandardMapper;
import ks45team04.sos.admin.mapper.PointSaveUseMapper;


@Service
public class PointSaveStandardService {

	private final PointSaveStandardMapper pointSaveStandardMapper;
	
	public PointSaveStandardService(PointSaveStandardMapper pointSaveStandardMapper,
									PointSaveUseMapper pointSaveUseMapper) {
		
		this.pointSaveStandardMapper = pointSaveStandardMapper;
	}
	
	/**
	 * 포인트 적립 기준 등록 코드 자동 생성
	 * @param pointSaveStandard
	 * @param pointSaveStandardCode
	 * @return newPointSaveStandarCode
	 */
	public String getPointSaveStandardCode(String pointSaveStandard, String pointSaveStandardCode) {
		
		String newPointSaveStandarCode = pointSaveStandardMapper.getPointSaveStandardCode(pointSaveStandard, pointSaveStandardCode);
		
		return newPointSaveStandarCode;
	}

	/**
	 * 포인트 적립 기준 삭제
	 * @param pointSaveStandard
	 * @return pointSaveStandard
	 */
	public void deletePointSaveStandard(String pointSaveStandardCode) {
		
		pointSaveStandardMapper.deletePointSaveSatandardByCode(pointSaveStandardCode);
	}
	
	/**
	 * 포인트 적립 기준 수정
	 * @param pointSaveStandard
	 * @return modifyPointSaveStandard
	 */
	public int modifyPointSaveStandard(PointSaveStandard pointSaveStandard) {
		
		return pointSaveStandardMapper.modifyPointSaveStandard(pointSaveStandard);
	}
	

	/**
	 * 특정 포인트 적립 기준 조회
	 * @param pointSaveStandardCode
	 * @return getPointSaveStandardByCode
	 */
	public PointSaveStandard getPointSaveStandardInfoByCode(String pointSaveStandardCode) {
		
		return pointSaveStandardMapper.getPointSaveStandardByCode(pointSaveStandardCode);
	}
	

	/**
	 * 포인트 적립 기준 등록
	 * @param pointSaveStandard
	 * @return addPointSaveStandard
	 */
	public int addPointSaveStandard(PointSaveStandard pointSaveStandard) {
		
		return pointSaveStandardMapper.addPointSaveStandard(pointSaveStandard);
	}

	
	/**
	 * 포인트 적립 기준 내용 내역 조회 
	 * @return pointSaveStandardContentList
	 */
	 public List<PointSaveStandard> getPointSaveStandardContent(){
		  
		List<PointSaveStandard> pointSaveStandardContentList = pointSaveStandardMapper.getPointSaveStandardContent();
		  
		  return pointSaveStandardContentList; 
	}
		 
	 
	/**
	 * 포인트 적립 기준 내역 조회(검색)
	 * @param searchKey
	 * @param searchValue
	 * @return pointSaveStandardList
	 */
	public List<PointSaveStandard> PointSaveStandardList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "pointSaveStandardCode":
				searchKey = "point_save_standard_code";
				break;
			case "pointSaveStandardContent":
				searchKey = "point_save_standard_content";
				break;
			}
		}
		
		List<PointSaveStandard> pointSaveStandardList = pointSaveStandardMapper.pointSaveStandardList(searchKey, searchValue);
		
		return pointSaveStandardList;
	}

}

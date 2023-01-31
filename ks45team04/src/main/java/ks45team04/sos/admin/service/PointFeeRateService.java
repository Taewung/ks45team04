package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.PointFeeRate;
import ks45team04.sos.admin.mapper.PointFeeRateMapper;


@Service
public class PointFeeRateService {

	private final PointFeeRateMapper pointFeeRateMapper;

	public PointFeeRateService(PointFeeRateMapper pointFeeRateMapper) {
		this.pointFeeRateMapper = pointFeeRateMapper;
}
	
	/**
	 * 포인트 수수료율 등록 코드 자동 생성
	 * @param pointFeeRate
	 * @param pointFeeRateCode
	 * @return newPointFeeRateCode
	 */
	public String getPointFeeRateCode(String pointFeeRate, String pointFeeRateCode) {
		
		String newPointFeeRateCode = pointFeeRateMapper.getPointFeeRateCode(pointFeeRate, pointFeeRateCode);
		
		return newPointFeeRateCode;
	}
	
	/**
	 * 포인트 수수료율 삭제
	 * @param pointFeeRateCode
	 * @return pointFeeRate
	 */
	public void deletePointfeeRate(String pointFeeRateCode) {
		
		pointFeeRateMapper.deletePointFeeRateByCode(pointFeeRateCode);
	}
	
	/**
	 * 포인트 수수료율 수정
	 * @param pointFeeRate
	 * @return modifyPointFeeRate
	 */
	public int modifyPointFeeRate(PointFeeRate pointFeeRate) {
		
		return pointFeeRateMapper.modifyPointFeeRate(pointFeeRate);
	}

	/**
	 * 특정 포인트 수수료율 조회 
	 * @param pointFeeRateCode
	 * @return getPointFeeRateByCode
	 */
	public PointFeeRate getPointFeeRateInfoByCode(String pointFeeRateCode) {
		
		return pointFeeRateMapper.getPointFeeRateByCode(pointFeeRateCode);
	}

	/**
	 * 포인트 수수료율 등록 
	 * @param pointFeeRate
	 * @return addPointFeeRate
	 */
	public int addPointFeeRate(PointFeeRate pointFeeRate) {
		
		return pointFeeRateMapper.addPointFeeRate(pointFeeRate);
	}
	

	/**
	 * 포인트 수수료율 내역 조회 
	 * @param searchKey
	 * @param searchValue
	 * @return pointFeeRateList
	 */
	public List<PointFeeRate> PointFeeRateList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "pointFeeRateCode":
				searchKey = "point_fee_rate_code";
				break;
			case "pointFeeRateContents":
				searchKey = "point_fee_rate_contents";
				break;
			}
		}
		
		List<PointFeeRate> pointFeeRateList = pointFeeRateMapper.pointFeeRateList(searchKey, searchValue);
		
		return pointFeeRateList;
	}
}

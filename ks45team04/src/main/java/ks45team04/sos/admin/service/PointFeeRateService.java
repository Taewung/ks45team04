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
	//포인트 수수료율 수정
	public int modifyPointFeeRate(PointFeeRate pointFeeRate) {
		
		return pointFeeRateMapper.modifyPointFeeRate(pointFeeRate);
	}

	//특정 포인트 수수료율 조회
	public PointFeeRate getPointFeeRateInfoByCode(String pointFeeRateCode) {
		
		return pointFeeRateMapper.getPointFeeRateByCode(pointFeeRateCode);
	}
	//포인트 수수료율 등록
	public int addPointFeeRate(PointFeeRate pointFeeRate) {
		
		return pointFeeRateMapper.addPointFeeRate(pointFeeRate);
	}
	
	//포인트 수수료율 내역 조회
	public List<PointFeeRate> PointFeeRateList(){
		
		List<PointFeeRate> pointFeeRateList = pointFeeRateMapper.pointFeeRateList();
		
		return pointFeeRateList;
	}
}

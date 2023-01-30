package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MPointFeeRate;
import ks45team04.sos.member.mapper.MPointFeeRateMapper;



@Service
public class MPointFeeRateService {

	private final MPointFeeRateMapper mPointFeeRateMapper;
	
	public MPointFeeRateService(MPointFeeRateMapper mPointFeeRateMapper) {
		this.mPointFeeRateMapper = mPointFeeRateMapper;
	}
	
	//포인트 수수료율 조회
	public List<MPointFeeRate> MPointFeeRateList(){
		
		List<MPointFeeRate> mPointFeeRateList = mPointFeeRateMapper.mPointFeeRateList();
		
		return mPointFeeRateList;
	}
}

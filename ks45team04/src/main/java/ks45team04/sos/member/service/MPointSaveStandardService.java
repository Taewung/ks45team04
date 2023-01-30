package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MPointSaveStandard;
import ks45team04.sos.member.mapper.MPointSaveStandardMapper;

@Service
public class MPointSaveStandardService {

	private final MPointSaveStandardMapper mPointSaveStandardMapper;
	
	public MPointSaveStandardService(MPointSaveStandardMapper mPointSaveStandardMapper) {
		this.mPointSaveStandardMapper = mPointSaveStandardMapper;
	}
	
	/**
	 * 포인트 적립 기준 조회
	 * @return mPointSaveStandardList
	 */
	public List<MPointSaveStandard> MPointSaveStandardList(){
		
		List<MPointSaveStandard> mPointSaveStandardList = mPointSaveStandardMapper.mPointSaveStandardList();
		
		return mPointSaveStandardList;
	}
}

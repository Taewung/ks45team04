package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MPointSaveUse;
import ks45team04.sos.member.mapper.MPointSaveUseMapper;

@Service
public class MPointSaveUseService {
	
	private final MPointSaveUseMapper mPointSaveUseMapper;
	
	public MPointSaveUseService(MPointSaveUseMapper mPointSaveUseMapper) {
		this.mPointSaveUseMapper = mPointSaveUseMapper;
	}
	
	//포인트 적립/사용 내역 조회
	public List<MPointSaveUse> MPointSaveUseList(){
		
		List<MPointSaveUse> mPointSaveUseList = mPointSaveUseMapper.mPointSaveUseList();
		
		return mPointSaveUseList;
	}
}

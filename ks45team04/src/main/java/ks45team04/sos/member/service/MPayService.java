package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MPay;
import ks45team04.sos.member.mapper.MPayMapper;

@Service
public class MPayService {

	private final MPayMapper mPayMapper;
	
	public MPayService(MPayMapper mPayMapper) {
		this.mPayMapper = mPayMapper;
	}
	
	
	//회원 결제 내역 상세보기
	public MPay getMPayByCode(String payCompleteCode) {
		
		return mPayMapper.getMPayByCode(payCompleteCode);
	}
	
	//회원 결제 내역 조회
	public List<MPay> MPayList(){
		
		List<MPay> mPayList = mPayMapper.mPayList();
		
		return mPayList;
	}
	
}

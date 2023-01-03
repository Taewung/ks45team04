package ks45team04.sos.admin.service;

import java.util.List;

import ks45team04.sos.admin.dto.Pay;
import ks45team04.sos.admin.mapper.PayMapper;

public class PayService {
	private final PayMapper payMapper;
	
	public PayService(PayMapper payMapper) {
		this.payMapper = payMapper;
	}
	
	//결제 내역 조회
	public List<Pay> payList(){
		List<Pay> payList = payMapper.payList();
	
		return payList;
	}
	
}

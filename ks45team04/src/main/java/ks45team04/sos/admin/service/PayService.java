package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Pay;
import ks45team04.sos.admin.mapper.PayMapper;

@Service
public class PayService {
	
	private final PayMapper payMapper;
	
	public PayService(PayMapper payMapper) {
		this.payMapper = payMapper;
	}
	
	/**
	 * 결제 내역 조회(검색)
	 * @param searchKey
	 * @param searchValue
	 * @return payList
	 */
	public List<Pay> PayList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "payId":
				searchKey = "pay_id";
				break;
			}
		}
		
		List<Pay> payList = payMapper.payList(searchKey, searchValue);
	
		return payList;
	}
	
}

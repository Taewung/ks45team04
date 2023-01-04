package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Pay;

@Mapper
public interface PayMapper {
	
	//결제 내역 조회
	public List<Pay> payList();

}

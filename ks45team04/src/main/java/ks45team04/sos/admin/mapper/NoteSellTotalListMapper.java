package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.NoteSellTotalList;

@Mapper
public interface NoteSellTotalListMapper {
	
	// 노트 판매 내역 조회
	public List<NoteSellTotalList> NoteSellTotalList();

}

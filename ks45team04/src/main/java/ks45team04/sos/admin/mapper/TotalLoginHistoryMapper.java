package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.TotalLoginHistory;

@Mapper
public interface TotalLoginHistoryMapper {

	//전체 회원 로그인 / 로그아웃 내역 조회
	public List<TotalLoginHistory> TotalLoginHistory(String searchKey, String searchValue);
	
	
}
	
package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team04.sos.admin.dto.TotalLoginHistory;
import ks45team04.sos.admin.mapper.TotalLoginHistoryMapper;

@Service("totalLoginHistoryService")
@Transactional
public class TotalLoginHistoryService {

	private final TotalLoginHistoryMapper totalLoginHistoryMapper;
	
	public TotalLoginHistoryService(TotalLoginHistoryMapper totalLoginHistoryMapper) {
		this.totalLoginHistoryMapper = totalLoginHistoryMapper;
	}
	
	
	/**
	 * 전체 회원 로그인 내역 조회
	 * @param searchKey
	 * @param searchValue
	 * @return
	 */
	public List<TotalLoginHistory> TotalLoginHistory(String searchKey, String searchValue) {
		
		if(searchKey != null) {
			switch(searchKey) {
			case "loginLogoutId":
				searchKey = "login_logout_id";
				break;
			}
			switch(searchKey) {
			case "loginLevelName":
				searchKey = "login_level_name";
				break;
			}
		}	
	List<TotalLoginHistory> totalLoginHistory = totalLoginHistoryMapper.TotalLoginHistory(searchKey, searchValue);

	return  totalLoginHistory;
	}
}

package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.NoteSellTotalList;
import ks45team04.sos.admin.mapper.NoteSellTotalListMapper;

@Service
public class NoteSellTotalListService {

	private final NoteSellTotalListMapper noteSellTotalListMapper;
	
	public NoteSellTotalListService(NoteSellTotalListMapper noteSellTotalListMapper) {
		this.noteSellTotalListMapper = noteSellTotalListMapper;
	}

	// 노트 판매내역 조회
		public List<NoteSellTotalList> NoteSellTotalList(){
			
			List<NoteSellTotalList> noteSellTotalList = noteSellTotalListMapper.NoteSellTotalList();
			
			return noteSellTotalList;
		}
	}
	

package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.AcceptanceReview;
import ks45team04.sos.member.mapper.AcceptanceReviewMapper;



@Service
public class AcceptanceReviewService {
	
	private final AcceptanceReviewMapper acceptanceReviewMapper;
	
	public AcceptanceReviewService(AcceptanceReviewMapper acceptanceReviewMapper) {
		this.acceptanceReviewMapper = acceptanceReviewMapper;
}
	
	/**
	 * 자격증 대분류목록 조회
	 * @return List<LicenseMain>
	 */
	public List<AcceptanceReview> acceptanceReviewList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "liName":
				searchKey = "li_name";
				break;
			case "pmId":
				searchKey = "pm_id";
				break;
			}
		}
		
		List<AcceptanceReview> acceptanceReviewList = acceptanceReviewMapper.acceptanceReviewList(searchKey, searchValue);
		
		return acceptanceReviewList;
	}	
}

package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.AcceptanceReview;


@Mapper
public interface AcceptanceReviewMapper {

	public List<AcceptanceReview> acceptanceReviewList(String searchKey, String searchValue);
	
	
	
}

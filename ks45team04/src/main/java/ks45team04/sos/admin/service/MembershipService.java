package ks45team04.sos.admin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Membership;
import ks45team04.sos.admin.mapper.AdminMembershipMapper;
import ks45team04.sos.member.service.MMemberService;

@Service("adminMembershipService")
public class MembershipService { 
	
	private static final Logger log = LoggerFactory.getLogger(MembershipService.class);

private final AdminMembershipMapper adminMembershipMapper;

public MembershipService(AdminMembershipMapper adminMembershipMapper) {
	this.adminMembershipMapper = adminMembershipMapper;
	
	}

	/**
	 * 회원가입 처리
	 * @param membership
	 */
	public void addMembership(Membership membership) {
		
		adminMembershipMapper.addMembership(membership);
	}
	
	/**
	 * 회원가입 처리를 위한 목록 조회
	 * @param membership
	 */
	public List<Membership> getMemberShipList() {
		
		List<Membership> getMemberShipList = adminMembershipMapper.getMembershipList();
		
		return getMemberShipList;
	}
	

	/* 멤버십코드 자동생성 */
 /*	public String getmembershipCode(String membership, String membershipCode) {
	     String newMembershipCode = adminMembershipMapper.getmembershipCode(membership, membershipCode);
	     return newMembershipCode;	
	}*/


	/**
	 * 특정 멤버십 수정
	 * @param membership
	 * @return
	 */
	public int modifyMembershipInfo(Membership membership) {
		
		return adminMembershipMapper.modifyMembershipInfo(membership);
	}
	
	/**
	 * 멤버십 상세 조회
	 * @param membershipCode
	 * @return Membership
	 */
	public Membership getTotalMembershipInfo(String membershipCode) {
		return adminMembershipMapper.getTotalMembershipInfo(membershipCode);
	}
	
	/**
	 * 멤버십 조회
	 * @return List<Membership>
	 */
	
	public List<Membership> MembershipList(String searchKey, String searchValue) {
		
		if(searchKey != null) {
			switch(searchKey) {
			case "membershipCode":
				searchKey = "membership_code";
				break;
			}
			switch(searchKey) {
			case "membershipPeriod":
				searchKey = "membership_period";
				break;
			}
		}	
			
		
		
		List<Membership> membershipList = adminMembershipMapper.MembershipList(searchKey, searchValue);
	
				return membershipList;
	}
	
	


}

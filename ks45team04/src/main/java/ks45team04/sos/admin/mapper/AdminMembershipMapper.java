package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Membership;

 
@Mapper
public interface AdminMembershipMapper {

	//멤버십 정보 수정 처리
	public int modifyMembershipInfo(Membership membership);
	
	//멤버십 상세 정보 조회
	public Membership getTotalMembershipInfo(String membershipCode);

	//멤버십 조회
	public List<Membership> MembershipList();
}
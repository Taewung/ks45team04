package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Membership;

 
@Mapper
public interface AdminMembershipMapper {

	//멤버십 조회
	public List<Membership> MembershipList();
}
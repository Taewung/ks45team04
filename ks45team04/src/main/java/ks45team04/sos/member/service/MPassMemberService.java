package ks45team04.sos.member.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MPassMember;
import ks45team04.sos.member.mapper.MPassMemberMapper;

@Service
public class MPassMemberService {

		private static final Logger log = LoggerFactory.getLogger(MPassMemberService.class);

		private final MPassMemberMapper mPassMemeberMapper;
		
		public MPassMemberService(MPassMemberMapper mPassMemberMapper) {
				this.mPassMemeberMapper = mPassMemberMapper;
		}

	/**
	 * 합격 인증 여부 조회
	 * @param memId
	 * @return
	 */
	public List<MPassMember> PassMemberList(String memId) {
		
	List<MPassMember> PassMemberList = mPassMemeberMapper.PassMemberList(memId);

	return PassMemberList;
	}
		
}

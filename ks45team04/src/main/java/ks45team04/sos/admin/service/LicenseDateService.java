package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseDate;
import ks45team04.sos.admin.mapper.LicenseDateMapper;

@Service
public class LicenseDateService {

	private final LicenseDateMapper licenseDateMapper;
	
	public LicenseDateService (LicenseDateMapper licenseDateMapper) {
		this.licenseDateMapper = licenseDateMapper;
	}
	
	
	// 자격증 일정 목록 조회
	public List<LicenseDate> licenseDateList(){
		
		List<LicenseDate> licenseDateList = licenseDateMapper.LicenseDateList();
		
		return licenseDateList;
	}
}

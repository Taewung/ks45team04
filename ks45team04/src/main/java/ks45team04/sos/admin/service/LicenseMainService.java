package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.mapper.LicenseMainMapper;


@Service
public class LicenseMainService {
	
private final LicenseMainMapper licenseMainMapper;
	
	public LicenseMainService(LicenseMainMapper licenseMainMapper) {
		this.licenseMainMapper = licenseMainMapper;
	}

	
	/**
	 * 특정 자격증 대분류 수정
	 * @param licenseMain
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyLicenseMain(LicenseMain licenseMain) {
		
		return licenseMainMapper.modifyLicenseMain(licenseMain);
		
	}
	
	/**
	 * 특정 자격증 대분류 조회
	 * @param lmcCode
	 * @return licenseMain
	 */
	public LicenseMain getLicenseMainInfoByCode(String lmcCode) {
		
		return licenseMainMapper.getLicenseMainByCode(lmcCode);
	}
	
	
	/**
	 * 자격증 대분류 등록
	 * @param LicenseMain
	 * @return int
	 */
	public int addLicenseMain(LicenseMain licenseMain) {
		
		return licenseMainMapper.addLicenseMain(licenseMain);
	}
	
	
	/**
	 * 자격증 대분류 목록 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> LicenseMainList(){
		
		List<LicenseMain> licenseMainList = licenseMainMapper.LicenseMainList();
		
		return licenseMainList;
	}
}

package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.mapper.LicenseInfoMapper;

@Service
public class LicenseInfoService {

private final LicenseInfoMapper licenseInfoMapper;

	public LicenseInfoService(LicenseInfoMapper licenseInfoMapper) {
		this.licenseInfoMapper = licenseInfoMapper;
	}
	
	/**
	 * 특정 자격증 정보 수정
	 * @param licenseInfo
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyLicenseInfo(LicenseInfo licenseInfo) {
		
		return licenseInfoMapper.modifyLicenseInfo(licenseInfo);
	}
	
	
	/**
	 * 특정 자격증 정보 조회
	 * @param liCode
	 * @return licenseInfo
	 */
	public LicenseInfo getLicenseInfoByCode(String liCode) {
		
		return licenseInfoMapper.getLicenseInfoByCode(liCode);
	}
	
	
	/**
	 * 자격증 대분류 등록
	 * @param LicenseInfo
	 * @return int
	 */
	public int addLicenseInfo(LicenseInfo licenseInfo) {
		
		return licenseInfoMapper.addLicenseInfo(licenseInfo);
	}
	
	
	/**
	 * 자격증 정보 목록 조회
	 * @return List<LicenseInfo>
	 */
	public List<LicenseInfo> LicenseInfoList(){
		
		List<LicenseInfo> licenseInfoList = licenseInfoMapper.LicenseInfoList();
		
		return licenseInfoList;
	}
	
	
	
	
	
}

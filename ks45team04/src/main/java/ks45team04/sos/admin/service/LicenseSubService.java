package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.mapper.LicenseSubMapper;

@Service
public class LicenseSubService {
	
private final LicenseSubMapper licenseSubMapper;
	
	public LicenseSubService(LicenseSubMapper licenseSubMapper) {
		this.licenseSubMapper = licenseSubMapper;
	}
	
	/**
	 * 특정 자격증 중분류 수정
	 * @param licenseSub
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyLicenseSub(LicenseSub licenseSub) {
		
		return licenseSubMapper.modifyLicenseSub(licenseSub);
	}
	
	/**
	 * 특정 자격증 중분류 조회
	 * @param lscCode
	 * @return licenseSub
	 */
	public LicenseSub getLicenseSubInfoByCode(String lscCode) {
		
		return licenseSubMapper.getLicenseSubByCode(lscCode);
	}
	

	
	/**
	 * 자격증 중분류 등록
	 * @param LicenseSub
	 * @return int
	 */
	public int addLicenseSub(LicenseSub licenseSub) {
		
		return licenseSubMapper.addLicenseSub(licenseSub);
	}
	
	/**
	 * 자격증 중분류 선택을 위한 대분류 목록 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> licenseMainList(){
		
		List<LicenseMain> licenseMainList = licenseSubMapper.licenseMainList();
		
		return licenseMainList;
	}
	
	
	
	/**
	 * 자격증 중분류 목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> LicenseSubList(){
		
		List<LicenseSub> licenseSubList = licenseSubMapper.LicenseSubList();
		
		return licenseSubList;
		
	}
}

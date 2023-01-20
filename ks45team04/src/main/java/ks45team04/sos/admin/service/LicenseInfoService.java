package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
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
	 * 자격증 대분류별 중분류목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> licenseSubList(String lmcCode){
		
		List<LicenseSub> licenseSubsList = licenseInfoMapper.licenseSubList(lmcCode);
		
		return licenseSubsList;
	}
	
	
	/**
	 * 자격증 정보 등록을 위한 대분류 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> licenseMainList(){
		
		List<LicenseMain> licenseMainList = licenseInfoMapper.licenseMainList();
		
		return licenseMainList;
	}
	
	
	
	/**
	 * 자격증 정보 목록 조회
	 * @return List<LicenseInfo>
	 */
	public List<LicenseInfo> LicenseInfoList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "liCode":
				searchKey = "li_code";
				break;
			case "liName":
				searchKey = "li_name";
				break;
			case "lmcName":
				searchKey = "lmc_name";
				break;
			case "lscName":
				searchKey = "lsc_name";
				break;
			case "liRegDatetime":
				searchKey = "li_reg_date";
				break;
			}
		}
		
		
		List<LicenseInfo> licenseInfoList = licenseInfoMapper.LicenseInfoList(searchKey, searchValue);
		
		return licenseInfoList;
	}
	
	
	
	
	
}

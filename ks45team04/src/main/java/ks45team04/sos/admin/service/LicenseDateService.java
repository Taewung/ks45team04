package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseDate;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.mapper.LicenseDateMapper;

@Service
public class LicenseDateService {

	private final LicenseDateMapper licenseDateMapper;
	
	public LicenseDateService (LicenseDateMapper licenseDateMapper) {
		this.licenseDateMapper = licenseDateMapper;
	}
	
	/**
	 * 특정 자격증 일정 수정 
	 * @param licenseDate
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyLicenseInfoDate(LicenseDate licenseDate) {
		
		return licenseDateMapper.modifyLicenseDate(licenseDate);

	}
	
	
	/**
	 * 특정 자격증 일정 조회 
	 * @param ldCode
	 * @return licenseDate
	 */
	public LicenseDate getLicenseDateInfoByCode(String ldCode) {
		
		return licenseDateMapper.getLicenseDateInfoByCode(ldCode);
	}
	
	/**
	 * 자격증 일정 등록
	 * @param LicenseDate
	 * @return int
	 */
	public int addLicenseDate(LicenseDate licenseDate) {
		
		return licenseDateMapper.addLicenseDate(licenseDate);
	}
	
	/**
	 * 자격증 일정 등록을 위한 자격증 정보 조회
	 * @return List<LicenseInfo>
	 */
	public List<LicenseInfo> licenseInfoList(){
		
		List<LicenseInfo> licenseInfoList = licenseDateMapper.licenseInfoList();
		
		return licenseInfoList;
		
	}
	
	/**
	 * 자격증 일정 등록을 목록 조회
	 * @return List<LicenseDate>
	 */
	public List<LicenseDate> getLicenseDateList(){
		
		List<LicenseDate> getLicenseDateList = licenseDateMapper.getLicenseDateList();
		
		return getLicenseDateList;
	}
	
	
	/**
	 * 자격증 일정 목록 조회
	 * @return List<LicenseDate>
	 */
	public List<LicenseDate> licenseDateList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "ldCode":
				searchKey = "ld_code";
				break;
			case "liName":
				searchKey = "li_name";
				break;
			case "ldRegDatetime":
				searchKey = "ld_reg_datetime";
				break;
			}
		}
		
		List<LicenseDate> licenseDateList = licenseDateMapper.LicenseDateList(searchKey, searchValue);
		
		return licenseDateList;
	}
}






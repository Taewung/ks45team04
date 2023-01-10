package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.member.mapper.MLicenseInfoMapper;

@Service
public class MLicenseInfoService {
	
	private final MLicenseInfoMapper mLicenseInfoMapper;
	
	public MLicenseInfoService(MLicenseInfoMapper mLicenseInfoMapper) {
		this.mLicenseInfoMapper = mLicenseInfoMapper;
	}
	

	
	
	/**
	 * 자격증 상세보기 화면
	 * @return List<LicenseInfo>
	 */
	public List<LicenseInfo> getLicenseInfo(String liCode){
		
		return mLicenseInfoMapper.getLicenseInfo(liCode);
	}
	
	
	/**
	 * 자격증 중분류별 자격증정보 조회
	 * @return List<LicenseInfo>
	 */
	public List<LicenseInfo> getLicenseInfoList(String lscCode){
		
		List<LicenseInfo> licenseInfoList = mLicenseInfoMapper.getLicenseInfoList(lscCode);
		
		return licenseInfoList;
	}
	
	
	
	
	/**
	 * 자격증 대분류별 중분류목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> getlicenseSubList(String lmcCode){
		
		List<LicenseSub> licenseSubList = mLicenseInfoMapper.getLicenseSubList(lmcCode);
		
		return licenseSubList;
	}	
	
	
	
	/**
	 * 자격증 대분류목록 조회
	 * @return List<LicenseInfo>
	 */
	public List<LicenseMain> getlicenseMainList(){
			
			List<LicenseMain> licenseMainList = mLicenseInfoMapper.getLicenseMainList();
			
			return licenseMainList;
		}
	
	
	
	/**
	 * 자격증 정보 목록 조회
	 * @return List<LicenseInfo>
	 */
	public List<LicenseInfo> licenseInfoList(){
		
		List<LicenseInfo> licenseInfoList = mLicenseInfoMapper.licenseInfoList();
		
		return licenseInfoList;
	}
	
}

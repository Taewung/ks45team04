package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicensePassScore;

@Mapper
public interface LicensePassScoreMapper {

	// 자격증별 합격기준점수목록 조회
	public List<LicensePassScore> getLicensePassScoreList();
}

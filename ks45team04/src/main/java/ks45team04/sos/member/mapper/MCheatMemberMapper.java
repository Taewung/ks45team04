package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.FileControl;
import ks45team04.sos.member.dto.FileDto;
import ks45team04.sos.member.dto.MCheatMember;

@Mapper
public interface MCheatMemberMapper {

	// 파일테이블 삽입
	int addFileUpload(List<FileDto> fileDtoList);

	// 파일control 테이블 삽입
	int addFileControl(FileControl fileControl);

	int cheatRequest(MCheatMember mCheatMember);
	

}

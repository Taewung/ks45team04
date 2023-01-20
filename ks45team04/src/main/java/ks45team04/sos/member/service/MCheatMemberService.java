package ks45team04.sos.member.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks45team04.sos.member.dto.FileControl;
import ks45team04.sos.member.dto.FileDto;
import ks45team04.sos.member.dto.MCheatMember;
import ks45team04.sos.member.mapper.MCheatMemberMapper;
import ks45team04.util.FileUtil;

@Service
@Transactional
public class MCheatMemberService {
	
	private static final Logger log = LoggerFactory.getLogger(MCheatMemberService.class);
	
	private final FileUtil fileUtil;
	private final MCheatMemberMapper mCheatMemberMapper;
	
	public MCheatMemberService(FileUtil fileUtil, MCheatMemberMapper mCheatMemberMapper) {
		this.fileUtil = fileUtil;
		this.mCheatMemberMapper = mCheatMemberMapper;
	}

	public void cheatRequest(MultipartFile[] uploadfile, MCheatMember mCheatMember) {
		List<FileDto> fileDtoList = fileUtil.parseFileInfo(uploadfile);
		log.info("fileDtoList : {}", fileDtoList);
		if(fileDtoList != null) {
			int result = mCheatMemberMapper.addFileUpload(fileDtoList);
			FileControl fileControl = new FileControl();
			fileControl.setFileDtoList(fileDtoList);
			if(result > 0) result += mCheatMemberMapper.addFileControl(fileControl);
			if(result > 0) {
				mCheatMember.setCmReportFile(fileControl.getFileGroupIdx());
				result += mCheatMemberMapper.cheatRequest(mCheatMember);
			}
			
		}
		
	}

}

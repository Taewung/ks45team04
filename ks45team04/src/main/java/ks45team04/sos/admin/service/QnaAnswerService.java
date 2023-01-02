package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.QnaAnswer;
import ks45team04.sos.admin.mapper.QnaAnswerMapper;

@Service
public class QnaAnswerService {

	private final QnaAnswerMapper qnaAnswerMapper;
	
	public QnaAnswerService(QnaAnswerMapper qnaAnswerMapper) {
		this.qnaAnswerMapper = qnaAnswerMapper;
	}
	
	
	public List<QnaAnswer> QnaAnswerList(){
		
		List<QnaAnswer> qnaAnswerList = qnaAnswerMapper.qnaAnswerList();
		
		return qnaAnswerList;
	}
}

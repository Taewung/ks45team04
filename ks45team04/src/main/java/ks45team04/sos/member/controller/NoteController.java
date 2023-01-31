package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.Note;
import ks45team04.sos.member.mapper.MNoteMapper;
import ks45team04.sos.member.service.MNoteService;



@Controller
public class NoteController {
	private final MNoteService mNoteService;
	private final MNoteMapper mNoteMapper;
	
	public NoteController(MNoteService mNoteService
						 ,MNoteMapper mNoteMapper) {

		this.mNoteService = mNoteService;
		this.mNoteMapper = mNoteMapper;
	}
	
	//판매노트 삭제 처리
	@PostMapping("/deleteNote")
	public String deleteQnaAnswer(Note Note) {
		
		return "";
	}
	
	// 판매노트 삭제 화면
	@GetMapping("/deleteNote")
	public String deleteQnaAnswer(Model model) {
		model.addAttribute("title", "판매노트 삭제 화면");
			
		return "member/note/note_delete";
	}


	// 판매노트 수정 처리
	@PostMapping("/modifyNote")
	public String modifyNote(Note Note) {
		
		return "";
	}
	
	// 판매노트 수정 화면
	@GetMapping("/modifyNote")
	public String modifyNote(Model model) {
		
		model.addAttribute("title", "판매노트 수정 화면");
			
		return "member/note/note_modify";
	}


	// 판매노트 등록 처리
	@PostMapping("/addNote")
	public String addNote(Note Note) {
		
		mNoteService.addNote(Note);
		
		return "redirect:/noteList";
	}

	
	// 판매노트 등록 화면
	@GetMapping("/addNote")
	public String addNote(Model model) {
		
		List<LicenseInfo> licenseInfoList = mNoteService.licenseInfoList();
		
		List<Note> noteList = mNoteMapper.noteList();
		
		System.out.println(licenseInfoList);
		System.out.println(noteList);
		
		model.addAttribute("title", "판매노트 등록 화면");
		model.addAttribute("licenseInfoList", licenseInfoList);
		model.addAttribute("noteList", noteList);
		
		return "member/note/note_insert";
	}
	
	
	
	

	// 판매노트 상세보기 화면
		@GetMapping("/noteDetial")
		public String noteDetial(@RequestParam(value="noteWriterId") String noteWriterId
								
								 ,Model model) {
			
			Note note = mNoteService.getNoteById(noteWriterId);
			List<Note> noteReviewList = mNoteService.noteReviewList(noteWriterId);
			
			model.addAttribute("title", "판매노트 상세보기 화면");
			model.addAttribute("noteInfo", note);
			model.addAttribute("noteReviewList", noteReviewList);
			
			
			return "member/note/note_detail";

	}
		
	// 판매노트 목록 조회
	@GetMapping("/noteList")
	public String getnoteList(Model model
						  ,@RequestParam(value="searchKey", required = false) String searchKey
						  ,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue) {
		
		List<Note> getnoteList = mNoteService.getnoteList(searchKey, searchValue);
		
		model.addAttribute("title", "판매노트 목록 조회");
		model.addAttribute("noteList", getnoteList);
		
		return "member/note/note_list";

	}

}

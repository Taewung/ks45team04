package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks45team04.sos.member.dto.Note;



@Controller
public class NoteController {
	
	
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
		
		return "";
	}

	// 판매노트 등록 화면
	@GetMapping("/addNote")
	public String addNote(Model model) {
		model.addAttribute("title", "판매노트 등록 화면");
		
		return "member/note/note_insert";
	}

	// 판매노트 상세보기 화면
		@GetMapping("/noteDetial")
		public String noteDetial(Model model) {
			model.addAttribute("title", "판매노트 상세보기 화면");
			
			return "member/note/note_detail";

	}
		
	// 판매노트 목록 조회
	@GetMapping("/noteList")
	public String noteList(Model model) {
		model.addAttribute("title", "판매노트 목록 조회");
		
		return "member/note/note_list";

	}

}

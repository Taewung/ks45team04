package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class NoteController {

	@GetMapping("/noteDelete")
	public String noteDelete(Model model) {
		model.addAttribute("title", "노트삭제");
		return "member/note/note_delete";
	}
	@GetMapping("/noteDetail")
	public String noteDetail(Model model) {
		model.addAttribute("title", "노트상세");
		return "member/note/note_detail";
	}
	@GetMapping("/noteInsert")
	public String noteInsert(Model model) {
		model.addAttribute("title", "노트등록");
		return "member/note/note_insert";
	}
	@GetMapping("/noteList")
	public String noteList(Model model) {
		model.addAttribute("title", "노트목록");
		return "member/note/note_list";
	}
	@GetMapping("/noteModify")
	public String noteModify(Model model) {
		model.addAttribute("title", "노트수정");
		return "member/note/note_modify";
	}
}

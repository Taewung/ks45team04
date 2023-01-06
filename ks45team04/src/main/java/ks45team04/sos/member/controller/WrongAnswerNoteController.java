package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WrongAnswerNoteController {

	@GetMapping("/addWrongAnswerNote")
	public String addWrongAnswerNote(Model model) {
		model.addAttribute("title", "오답노트등록");
		return "member/wrongAnswer/add_wrong_answer_note";
	}
	@GetMapping("/checkWrongAnswerNote")
	public String checkWrongAnswerNote(Model model) {
		model.addAttribute("title", "오답노트상세조회");
		return "member/wrongAnswer/check_wrong_answer_note";
	}
	@GetMapping("/checkWrongAnswer")
	public String checkWrongAnswer(Model model) {
		model.addAttribute("title", "오답상세조회");
		return "member/wrongAnswer/check_wrong_answer";
	}
	@GetMapping("/modifyWrongAnswerNote")
	public String modifyWrongAnswerNote(Model model) {
		model.addAttribute("title", "오답노트수정");
		return "member/wrongAnswer/modify_wrong_answer_note";
	}
	@GetMapping("/wrongAnswerList")
	public String wrongAnswerList(Model model) {
		model.addAttribute("title", "오답목록");
		return "member/wrongAnswer/wrong_answer_list";
	}
	@GetMapping("/wrongAnswerNoteList")
	public String wrongAnswerNoteList(Model model) {
		model.addAttribute("title", "오답노트목록");
		return "member/wrongAnswer/wrong_answer_note_list";
	}
}

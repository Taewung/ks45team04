package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	//장바구니 등록
	@GetMapping("/cartInsert")
	public String cartInsert(Model model) {
		model.addAttribute("title", "장바구니 등록");
		
		return "member/cart/cart_insert";
	}
	//장바구니 수정
	@GetMapping("/cartModify")
	public String cartModify(Model model) {
		model.addAttribute("title", "장바구니 수정");
		
		return "member/cart/cart_modify";
	}
	//장바구니 삭제
	@GetMapping("/cartDelete")
	public String cartDelete(Model model) {
		model.addAttribute("title", "장바구니 삭제");
		
		return "member/cart/cart_delete";
	}
	//장바구니 조회
	@GetMapping("/cartList")
	public String cartList(Model model) {
		model.addAttribute("title", "장바구니 조회");
		
		return "member/cart/cart_list";
	}
}

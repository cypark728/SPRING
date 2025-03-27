package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@RequestMapping("/quiz01")
	public String quiz01() {
		return "/quiz/quiz01";
	}
	
	
	@RequestMapping("/join")
	public String quiz01_ok(@ModelAttribute("id") String id,
							@ModelAttribute("pw") String pw,
							@ModelAttribute("name") String name,
							@ModelAttribute("email") String email) {
		
		return "/quiz/quiz01_ok";
	}
	
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "/quiz/quiz02";
	}
	
	@RequestMapping("/quiz02_result")
	public String quiz02_result() {
		return "/quiz/quiz02_result";
	}
	
	@RequestMapping("/celebrate")
	public String celebrate(@ModelAttribute("year") String year,
							@ModelAttribute("month") String month,
							@ModelAttribute("day") String day,
							@ModelAttribute("msg") String msg,
							RedirectAttributes ra) {
		
		//문자열을 관리해서
		String message = year + "-" + month + "-" + day + " " + msg;
		
		
		//리다이렉트로 보내는데 1회성으로 데이터도 보내기.
		System.out.println(message);
		ra.addFlashAttribute("msg", message);
		return "redirect:/quiz/quiz02_result";
	}
	
	
}































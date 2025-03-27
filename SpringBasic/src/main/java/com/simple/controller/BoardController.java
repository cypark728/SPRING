package com.simple.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.board.service.BoardService;
import com.simple.board.service.BoardServiceImpl;
import com.simple.command.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private BoardService service = new BoardServiceImpl();

	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list = service.getList();
		model.addAttribute("list", list);
		
		return "/board/boardList";
	}
	
	@RequestMapping("/boardRegister")
	public String boardRegister() {
	
		return "/board/boardRegister";
	}
	
	@RequestMapping("/boardResult")
	public String boardResult() {
	
		return "/board/boardResult";
	}
	
	@RequestMapping(value="/boardForm", method = RequestMethod.POST)
	public String boardForm(BoardVO vo) {
		
		service.regist(vo);
		
		return "/board/boardResult";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelete(String bno) {
		service.delete(bno);
		
		return "/board/boardList";
	}
}
















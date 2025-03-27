package com.simple.board.service;

import java.util.ArrayList;

import com.simple.command.BoardDAO;
import com.simple.command.BoardDAOImpl;
import com.simple.command.BoardVO;

public class BoardServiceImpl implements BoardService{

	BoardDAO boardDAO = new BoardDAOImpl();
	
	@Override
	public void regist(BoardVO vo) {
		boardDAO.regist(vo);
	}
	
	@Override
	public ArrayList<BoardVO> getList() {
		return boardDAO.getList();
	}
	
	@Override
	public void delete(String bno) {
		boardDAO.delete(bno);
	}
}

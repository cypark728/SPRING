package com.simple.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.BoardDAO;
import com.simple.command.BoardDAOImpl;
import com.simple.command.BoardVO;

@Service("aboard")
public class BoardServiceImpl implements BoardService{

	//BoardDAO boardDAO = new BoardDAOImpl();
	
	@Autowired
	@Qualifier("boardDAO")
	private BoardDAO boardDAO;
	
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

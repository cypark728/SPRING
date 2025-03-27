package com.simple.command;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{
	
	private ArrayList<BoardVO> list = new ArrayList<>();
	
	@Override
	public void regist(BoardVO vo) {
		list.add(vo);
	}
	
	@Override
	public ArrayList<BoardVO> getList() {
		return list;
	}
	
	@Override
	public void delete(String bno) {

		list.remove(Integer.parseInt(bno));
	}
}

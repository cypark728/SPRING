package com.simple.command;

import java.util.ArrayList;

public class BoardDAOImpl implements BoardDAO{
	
	ArrayList<BoardVO> list = new ArrayList<>();
	
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

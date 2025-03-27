package com.simple.command;

import java.util.ArrayList;

public interface BoardDAO {
	void regist(BoardVO vo);
	ArrayList<BoardVO> getList();
	void delete(String bno);
}

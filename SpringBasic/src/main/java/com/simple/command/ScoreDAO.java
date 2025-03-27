package com.simple.command;

import java.util.ArrayList;

public interface ScoreDAO {

	void regist(ScoreVO vo); //insert
	ArrayList<ScoreVO> getList(); //select
	void delete(String sno); //delete
}

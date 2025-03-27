package com.simple.score.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreDAO;
import com.simple.command.ScoreVO;

@Service("aaaaaa") //@Service 어노테이션을 붙이고, 패키지를 읽어서 빈으로 만드는 전략
public class ScoreServiceImpl implements ScoreService{

	@Autowired
	@Qualifier("scoreDAO")
	private ScoreDAO scoreDAO;
	
	@Override
	public void regist(ScoreVO vo) {
		System.out.println(vo.toString());
		scoreDAO.regist(vo);
	}
	
	@Override
	public ArrayList<ScoreVO> getList() {
//		ArrayList<ScoreVO> list = scoreDAO.getList();
//		return list;
		return scoreDAO.getList();
	}
	
	@Override
	public void delete(String sno) {
		scoreDAO.delete(sno);
	}
}
















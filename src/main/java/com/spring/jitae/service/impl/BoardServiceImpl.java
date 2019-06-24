package com.spring.jitae.service.impl;

import com.spring.jitae.dao.BoardDao;
import com.spring.jitae.service.BoardService;
import com.spring.jitae.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) throws Exception {
		return boardDao.getBoardList(vo);
	}

	@Override
	public void insertBoardInfo(BoardVO vo) throws Exception {
		this.boardDao.insertBoardInfo(vo);
	}
}

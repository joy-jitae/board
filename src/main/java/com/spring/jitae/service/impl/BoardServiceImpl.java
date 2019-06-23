package com.spring.jitae.service.impl;

import java.util.List;

import com.spring.jitae.dao.BoardDao;
import com.spring.jitae.service.BoardService;
import com.spring.jitae.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jitae.dao.BoardDAO_temp;

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

package com.spring.jitae.service;

import java.util.List;

import com.spring.jitae.vo.BoardVO;

public interface BoardService {
	List<BoardVO> getBoardList(BoardVO vo) throws Exception;

	public void insertBoardInfo(BoardVO vo) throws Exception;
}

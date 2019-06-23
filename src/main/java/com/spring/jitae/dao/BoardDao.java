package com.spring.jitae.dao;

import com.spring.jitae.vo.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BoardDao {

    @Resource(name = "sqlSession")
    private SqlSession sqlSession;

    public List getBoardList(BoardVO vo) throws Exception{
        List<BoardVO> resList = this.sqlSession.selectList("com.spring.jitae.dao.BoardDao.selectBoardList", vo);

        return resList;
    }

    public void insertBoardInfo(BoardVO vo) throws  Exception{
        this.sqlSession.insert("com.spring.jitae.dao.BoardDao.insertBoardInfo", vo);
    }

}

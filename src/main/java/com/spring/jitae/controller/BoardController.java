package com.spring.jitae.controller;

import com.spring.jitae.service.BoardService;
import com.spring.jitae.vo.BoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/getBoardList.do", method = RequestMethod.GET)
    public ModelAndView getBoardList(BoardVO vo, ModelAndView model) throws Exception {

        List<BoardVO> list = boardService.getBoardList(vo);
        logger.info(list.toString());
        model.addObject("list", list);
        model.setViewName("boardList");
        return model;
    }

    @RequestMapping(value = "/insertBoardInfo.do", method = RequestMethod.GET)
    public String insertBoardInfo(@ModelAttribute BoardVO vo, ModelAndView model) throws Exception{
        this.boardService.insertBoardInfo(vo);
        return "redirect:getBoardList.do";
    }

    @RequestMapping(value = "/goBoardInsert.do")
    public ModelAndView showBoardWritePage(BoardVO vo, ModelAndView model) throws Exception{
        model.setViewName("boardAdd");

        return model;
    }
}

package com.example.demo.board.service;

import java.util.List;

import com.example.demo.common.Criteria;


public interface BoardService {

	public List<BoardVO> boardSelectList(Criteria cri);
	public int getTotal(Criteria cri);
	public BoardVO boardSelect(BoardVO vo);
	public void boardInsert(BoardVO vo);
	public void boardUpdate(BoardVO vo);
	public void boardDelete(BoardVO vo);
}

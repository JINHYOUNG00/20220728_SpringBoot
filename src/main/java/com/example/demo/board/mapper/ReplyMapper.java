package com.example.demo.board.mapper;

import java.util.List;

import com.example.demo.board.service.ReplyVO;

public interface ReplyMapper {
	
    public int insert(ReplyVO vo);
    public ReplyVO read(Long bno);
    public int delete(Long bno);
    public int update(ReplyVO vo);
    public List<ReplyVO> getList(Long bno);
}
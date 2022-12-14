package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyService;
import com.example.demo.board.service.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	ReplyMapper mapper;
	
	@Override
	public int insert(ReplyVO vo) {
		return mapper.insert(vo);
	}

	@Override
	public ReplyVO read(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public int delete(Long bno) {
		return mapper.delete(bno);
	}

	@Override
	public int update(ReplyVO vo) {
		return mapper.update(vo);
	}

	@Override
	public List<ReplyVO> getList(Long bno) {
		return mapper.getList(bno);
	}

}
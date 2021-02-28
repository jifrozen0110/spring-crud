package com.example.springcrud.service;

import com.example.springcrud.domain.Board;
import com.example.springcrud.mapper.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BoardService {

    private final BoardMapper boardMapper;


    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<Board> getList(){
        return boardMapper.getList();
    }

    public void uploadBoard(Board board){
        boardMapper.uploadBoard(board);
    }

    public Board getBoard(Long boardId){
        return boardMapper.getBoard(boardId);
    }

    public void updateBoard(Board board){
        boardMapper.updateBoard(board);
    }

    public void deleteBoard(Long boardId){
        boardMapper.deleteBoard(boardId);
    }
}

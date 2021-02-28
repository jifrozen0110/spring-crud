package com.example.springcrud.mapper;

import com.example.springcrud.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    List<Board> getList();

    void uploadBoard(Board board);

    Board getBoard(Long boardId);

    void updateBoard(Board board);

    void deleteBoard(Long boardId);

}

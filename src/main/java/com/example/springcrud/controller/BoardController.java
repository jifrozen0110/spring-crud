package com.example.springcrud.controller;

import com.example.springcrud.domain.Board;
import com.example.springcrud.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BoardController {

    private final BoardService service;

    public BoardController(BoardService service) {
        this.service = service;

    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",service.getList());
        return "/board/list";
    }

    @GetMapping("/upload")
    public String upload(){
        return "/board/upload";
    }

    @PostMapping("/upload")
    public String uploadBoard(Board board){
        service.uploadBoard(board);
        return "redirect:/list";
    }

    @GetMapping("/view")
    public String view(Model model,Long boardId){
        model.addAttribute("view",service.getBoard(boardId));
        return "/board/view";
    }


    @PutMapping("/update")
    public String updateBoard(Board board){
        service.updateBoard(board);
        return "redirect:/list";
    }

    @DeleteMapping("/delete")
    public String deleteBoard(Long boardId){
        service.deleteBoard(boardId);
        return "redirect:/list";
    }





}

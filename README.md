# spring-crud
## 간단하게 스프링 게시판 crud 구현하기
### SpringBoot intellij(IDE) mysql mybaits java15 thymeleaf Gradle

#### 조회
###### boardMapper.xml
    <select id="getList" resultType="com.example.springcrud.domain.Board">
        SELECT * FROM tbl_board;
    </select>
    
        <select id="getBoard" resultType="com.example.springcrud.domain.Board">
        SELECT * FROM tbl_board where boardId=#{boardId};
    </select>
###### boardService
      public List<Board> getList(){
        return boardMapper.getList();
    }
    public Board getBoard(Long boardId){
        return boardMapper.getBoard(boardId);
    }
###### boardController
        @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",service.getList());
        return "/board/list";
    }
    
        @GetMapping("/view")
    public String view(Model model,Long boardId){
        model.addAttribute("view",service.getBoard(boardId));
        return "/board/view";
    }


#### 생성
###### boardMapper.xml
    <select id="uploadBoard" resultType="com.example.springcrud.domain.Board">
        INSERT INTO tbl_board (title,content,name) VALUES (#{title},#{content},#{name});
    </select>
###### boardService
     public void updateBoard(Board board){
        boardMapper.updateBoard(board);
    }

###### boardController
    @GetMapping("/upload")
    public String upload(){
        return "/board/upload";
    }
    
        @PostMapping("/upload")
    public String uploadBoard(Board board){
        service.uploadBoard(board);
        return "redirect:/list";
    }
#### 수정
###### boardMapper.xml
    <select id="updateBoard" resultType="com.example.springcrud.domain.Board">
        UPDATE tbl_board set title=#{title}, content=#{content} where boardId=#{boardId};
    </select>
###### boardService
    public void uploadBoard(Board board){
        boardMapper.uploadBoard(board);
    }
###### boardController
    @PutMapping("/update")
    public String updateBoard(Board board){
        service.updateBoard(board);
        return "redirect:/list";
    }
#### 삭제
###### boardMapper.xml
    <select id="deleteBoard" resultType="com.example.springcrud.domain.Board">
        delete from tbl_board where boardId=#{boardId};
    </select>
###### boardService
    public void deleteBoard(Long boardId){
        boardMapper.deleteBoard(boardId);
    }
###### boardController    
        @DeleteMapping("/delete")
    public String deleteBoard(Long boardId){
        service.deleteBoard(boardId);
        return "redirect:/list";
    }

#### 겪은 오류
##### this inspection performs unresolved sql references check. unable to resolve table intellij
###### database source and driver 에서 datasource 추가하기


##### Consider defining a bean of type 'com.example.springcrud.mapper.BoardMapper' in your configuration.
###### SpringcrudApplication에 추가
  @MapperScan(basePackages = "com.example.springcrud")
  
 
  

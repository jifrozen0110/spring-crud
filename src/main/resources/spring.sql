CREATE TABLE tbl_board(
        boardId int auto_increment,
        title varchar (30) not null,
        content varchar (30) not null,
        name varchar (30) not null,
        primary key(boardId)
);

INSERT into tbl_board(title,content,name) values
('타이틀','컨텐트','네임');
INSERT into tbl_board(title,content,name) values
('title1','content1','name1');
INSERT into tbl_board(title,content,name) values
('title2','content2','name2');
INSERT into tbl_board(title,content,name) values
('title3','content3','name3');
INSERT into tbl_board(title,content,name) values
('title4','content4','name4');
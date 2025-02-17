package com.ktdsuniversity.edu.hello_spring.bbs.service;

import com.ktdsuniversity.edu.hello_spring.bbs.vo.BoardListVO;
import com.ktdsuniversity.edu.hello_spring.bbs.vo.BoardVO;
import com.ktdsuniversity.edu.hello_spring.bbs.vo.WriteBoardVO;

public interface BoardService {
	public BoardListVO getAllBoard();
	
	public boolean createNewBoard(WriteBoardVO writeBoardVO);
	
	public BoardVO getOneBoard(int id);
}

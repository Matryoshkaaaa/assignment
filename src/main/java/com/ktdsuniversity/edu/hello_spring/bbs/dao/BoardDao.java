package com.ktdsuniversity.edu.hello_spring.bbs.dao;

import java.util.List;

import com.ktdsuniversity.edu.hello_spring.bbs.vo.BoardVO;
import com.ktdsuniversity.edu.hello_spring.bbs.vo.WriteBoardVO;

public interface BoardDao {
	
	public int selectBoardAllCount();
	
	public List<BoardVO> selectAllBoard();
	
	public int insertNewBoard(WriteBoardVO writeBoardVo);
	
	public int increaseViewCount(int id);
	
	public BoardVO getOneBoard(int id);
}

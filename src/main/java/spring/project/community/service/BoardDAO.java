package spring.project.community.service;

import java.util.ArrayList;

import spring.project.community.board.dto.boardDTO;

public interface BoardDAO {
	ArrayList<boardDTO> contentList();
	boardDTO contentView(int cNum);
	void contentWrite(boardDTO boardDto);
	void contentModify(boardDTO boardDto);
	void contentDelete(boardDTO boardDto);
	void contentHits(int cNum);

}

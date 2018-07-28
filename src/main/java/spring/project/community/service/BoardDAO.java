package spring.project.community.service;

import java.util.List;

import spring.project.community.board.criteria.SearchCriteria;
import spring.project.community.board.dto.boardDTO;

public interface BoardDAO {
	List<boardDTO> contentList(SearchCriteria scriteria);
	int contentAll(SearchCriteria scriteria);
	boardDTO contentView(int cNum);
	void contentWrite(boardDTO boardDto);
	void contentModify(boardDTO boardDto);
	int contentDelete(int cNum);
	void contentHits(int cNum);

}

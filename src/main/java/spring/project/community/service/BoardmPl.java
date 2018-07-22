package spring.project.community.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.project.community.board.dto.boardDTO;

@Repository
public class BoardmPl implements BoardDAO {
@Autowired
private SqlSession sqlSession;

	@Override
	public ArrayList<boardDTO> contentList() {
		// TODO Auto-generated method stub
		ArrayList<boardDTO> boardDtos = new ArrayList<boardDTO>();
		Board board = sqlSession.getMapper(Board.class);
		boardDtos = board.contentList();
		return boardDtos;
	}

	@Override
	public boardDTO contentView(int cNum) {
		// TODO Auto-generated method stub
		boardDTO boardDto = new boardDTO();
		contentHits(cNum);
		boardDto = sqlSession.selectOne("spring.project.community.service.Board.contentView", cNum);
		return boardDto;
	}

	@Override
	public void contentWrite(boardDTO boardDto) {
		// TODO Auto-generated method stub
		Board board = sqlSession.getMapper(Board.class);
		board.contentWrite(boardDto);

	}

	@Override
	public void contentModify(boardDTO boardDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contentDelete(boardDTO boardDto) {
		// TODO Auto-generated method stub

	}
	
	@Override
		public void contentHits(int cNum) {
			// TODO Auto-generated method stub
		boardDTO boardDto = new boardDTO();
			boardDto.setcHit(sqlSession.update("spring.project.community.service.Board.contentHits", cNum));
			
		}

}

package spring.project.community.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.project.community.board.criteria.SearchCriteria;
import spring.project.community.board.dto.boardDTO;

@Repository
public class BoardmPl implements BoardDAO {
@Autowired
private SqlSession sqlSession;

	@Override
	public List<boardDTO> contentList(SearchCriteria scriteria) {
		// TODO Auto-generated method stub
	
		//ArrayList<boardDTO> boardDtos = new ArrayList<boardDTO>();
//		
//		Board board = sqlSession.getMapper(Board.class);
//		boardDtos = board.contentList(criteria);
		return sqlSession.selectList("spring.project.community.service.Board.contentList", scriteria);
	}
	
	@Override
		public int contentAll(SearchCriteria scriteria) {
			// TODO Auto-generated method stub
		int count = sqlSession.selectOne("spring.project.community.service.Board.contentAll",scriteria);
			return count;
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
		Board board = sqlSession.getMapper(Board.class);
		board.contentModify(boardDto);

	}

	@Override
	public int contentDelete(int cNum) {
		// TODO Auto-generated method stub
		
		return sqlSession.delete("spring.project.community.service.Board.contentDelete", cNum);

	}
	
	@Override
		public void contentHits(int cNum) {
			// TODO Auto-generated method stub
		boardDTO boardDto = new boardDTO();
			boardDto.setcHit(sqlSession.update("spring.project.community.service.Board.contentHits", cNum));
			
		}

}

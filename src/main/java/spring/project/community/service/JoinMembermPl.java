package spring.project.community.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.project.community.join.dto.JoinDto;

@Repository
public class JoinMembermPl implements JoinMemberDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void join(JoinDto joinDto) {
		// TODO Auto-generated method stub
		JoinMember joinMember = sqlSession.getMapper(JoinMember.class);
		joinMember.join(joinDto);
		
	}

	@Override
	public JoinDto overLapid(String cId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean overLapNick(JoinDto joinDto) {
		// TODO Auto-generated method stub
		return false;
	}

}

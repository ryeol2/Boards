package spring.project.community;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.project.community.board.dto.boardDTO;
import spring.project.community.join.dto.JoinDto;
import spring.project.community.login.dto.LoginDTO;
import spring.project.community.service.JoinMembermPl;
import spring.project.community.service.BoardmPl;

@Controller
public class MainController {
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	JoinMembermPl joinMemberMpl;
	@Autowired
	BoardmPl boardmPl;

	private static final String loginNamespace = "spring.project.community.memberMapper";
	private String url;
	private HttpSession session;

	@RequestMapping("/login") // 주소창에 /login으로 하면
	public String Login() {

		return "/login/Login"; // login폴더 안의 Login.jsp파일로 접근
	}
	
	@RequestMapping("logout")
	public String logOut(HttpSession session) {
		session.invalidate(); //session.removeAttribute("Nick");
		return "redirect:/login";
	}

	@RequestMapping(value = "/login_member", method = RequestMethod.POST)
	public String loginCheck(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException {
		String cId = request.getParameter("cId");
		String cPwd = request.getParameter("cPwd");
		LoginDTO loginDto = new LoginDTO();
		loginDto = sqlSession.selectOne(loginNamespace + ".loginCheck", cId);
		if (loginDto != null) {
			if (loginDto.getcId().equals(cId) && loginDto.getcPwd().equals(cPwd)) {
				session = request.getSession(true);
				session.setAttribute("Nick", loginDto.getcNname());
				url = this.boardList(model);
			}
		} else {
			response.setContentType("text/html; charset=utf-8;");
			PrintWriter writer = response.getWriter();
			writer.println("<script> alert('로그인에 실패했습니다.'); document.location.href='login';</script>");
			writer.flush();
		}
		return url;

	}

	@RequestMapping("wantJoin")
	public String Join() {
		return "/join/joinForm";
	}

	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String joinCompelete(HttpServletRequest request, Model model) {
		String cId = request.getParameter("cId");
		String cName = request.getParameter("cName");
		String cPwd = request.getParameter("cPwd");
		String cNname = request.getParameter("cNname");
		String cEmail = request.getParameter("cEmail") + request.getParameter("eMailaddress");
		JoinDto joinDto = new JoinDto(cId, cName, cPwd, cNname, cEmail);

		joinMemberMpl.join(joinDto);

		return "redirect:/login";

	}

	@RequestMapping("overLapid")
	public void checkOverLapid(HttpServletRequest request, Model model, HttpServletResponse response)
			throws IOException {
		// JoinDto joinDto = sqlSession.selectOne(joinNamespace+".overLapid",
		// request.getAttribute("cId"));
		// boolean check = false;
		// response.setContentType("text/html; charset=utf-8");
		// PrintWriter writer = response.getWriter();
		// if(joinDto!=null) {
		// if(joinDto.getcId().equals(request.getAttribute("cId"))) {
		// writer.println("<script> alert('이미 존재하는 id입니다.');
		// document.history.go(-1);</script>");
		// writer.flush();
		// // url ="redirect:/wantJoin";
		// }
		// }else {
		//
		// writer.println("<script> alert('가입 가능한 id입니다.');
		// document.histroy.go(-1);</script>");
		// writer.flush();
		// // url = "redirect:/wantJoin";
		// }
		// System.out.println(joinDto.getcId());
		// //return url;

	}
	
	@RequestMapping("/board")
	public String boardList(Model model) {
		ArrayList<boardDTO> blist = boardmPl.contentList();
		model.addAttribute("blist", blist);
		for(int i=0;i<blist.size();i++)
		System.out.println(blist.get(i).getcHit());
		
		return "/board/board";
	}
	@RequestMapping("/contentView")
	public String contentView(HttpServletRequest request, Model model) {
		String cNum = request.getParameter("cNum");
		model.addAttribute("contentview",boardmPl.contentView(Integer.parseInt(cNum)));
		return "/board/contentView";
	}

	@RequestMapping("/boardWrite")
	public String boardWrite() {
		return "/board/boardWrite";
	}

	@RequestMapping(value = "Write", method = RequestMethod.POST)
	public String Write(HttpServletRequest request) {
		String cTitle = request.getParameter("cTitle");
		String cContent = request.getParameter("cContent");
		String cNname = (String) session.getAttribute("Nick");
		boardDTO boardDto = new boardDTO();
		boardDto.setcTitle(cTitle); boardDto.setcContent(cContent); boardDto.setcNname(cNname);
		boardmPl.contentWrite(boardDto);

		return "redirect:/board";
	}

}

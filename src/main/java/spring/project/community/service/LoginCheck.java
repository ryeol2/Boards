package spring.project.community.service;

import spring.project.community.login.dto.LoginDTO;

public interface LoginCheck {
	LoginDTO memberCheck(String cId);

}

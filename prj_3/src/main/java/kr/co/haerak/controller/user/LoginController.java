package kr.co.haerak.controller.user;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.service.user.LoginService;
import kr.co.haerak.vo.user.LoginVO;

@Controller
public class LoginController {

	@Autowired(required = false)
	private LoginService ls;
	
	@GetMapping("login_form.do")
	public String loginForm() {
		
		return "main/login";
	}//loginForm
	
	@PostMapping("/login_process.do")
	public String loginProcess(Model model, LoginVO lVO) throws NoSuchAlgorithmException {
		// userId, userPassword;
		LoginSessionDomain lsDomain = ls.loginService(lVO);
		if(lsDomain==null) {
			model.addAttribute("flag", false);
			return "main/login";
		}//end if
		model.addAttribute("lsDomain", lsDomain);
		return "main/main";
	}//loginForm
	
}//class

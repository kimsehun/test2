package kr.co.moebius.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/regist", method=RequestMethod.GET)
	public void regist() {}
	
	@RequestMapping(value = "/regist", method=RequestMethod.POST)
	public String registAction(UserVO userVO, Model model) throws Exception {
		model.addAttribute("userVO", userVO);
		//userVO.setUser_pwd(DigestUtils.md5Hex(userVO.getUser_pwd()));
		logger.info(userVO.toString());
		userService.registUser(userVO);
		return "user/registAction";
	}
}

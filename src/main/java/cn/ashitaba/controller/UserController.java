package cn.ashitaba.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cn.ashitaba.dao.UserDao;
import cn.ashitaba.model.User;

@Controller
public class UserController {

	Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	private UserDao userDao;
	
	//查询所有
	@GetMapping("/users")
	public String list(Model model){
		logger.info("find users");
		List<User> list = userDao.findAll();
		model.addAttribute("users", list);
		return "user/list";
	}
	
	//前往员工新增页面
	@GetMapping("/user")
	public String toAddPage(Model model){
		return "user/add";
	}
	
	
}

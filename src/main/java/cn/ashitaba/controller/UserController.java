package cn.ashitaba.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cn.ashitaba.dao.UserDao;
import cn.ashitaba.model.User;

@Controller
public class UserController {

	@Resource
	private UserDao userDao;
	
	//查询所有
	@GetMapping("/users")
	public String list(Model model){
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

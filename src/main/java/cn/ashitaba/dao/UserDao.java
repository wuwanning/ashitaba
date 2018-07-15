package cn.ashitaba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cn.ashitaba.model.User;

public interface UserDao extends JpaRepository<User,Integer>{

	
	/**
	 * 根据用户名查询用户
	 * @param username
	 * @return
	 */
	//@Query
	User findByUsername(String username);
}

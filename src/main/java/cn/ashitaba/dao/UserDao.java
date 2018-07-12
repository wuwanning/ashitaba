package cn.ashitaba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.ashitaba.model.User;

public interface UserDao extends JpaRepository<User,Integer>{

}

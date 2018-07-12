package cn.ashitaba.service;

import cn.ashitaba.model.User;

public interface UserService {

	User login(String username, String password);
}

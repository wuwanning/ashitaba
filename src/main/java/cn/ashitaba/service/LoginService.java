package cn.ashitaba.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import cn.ashitaba.dao.UserDao;
import cn.ashitaba.model.User;



/**
 * 用户登录认证
 * @author Administrator
 *
 */
@Component
public class LoginService implements UserDetailsService{
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("用户"+username+"正在认证");
		User user = userDao.findByUsername(username);
		if(user == null){
			logger.error("用户不存在:"+username);
			throw new UsernameNotFoundException("用户不存在");
		}
		return user;
	}

}

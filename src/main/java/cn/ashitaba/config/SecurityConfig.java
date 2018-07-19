package cn.ashitaba.config;

import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import cn.ashitaba.service.LoginService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Resource
	private DataSource dataSource;
	
	@Resource
	private LoginService loginService;
	/* 
	 * 定制授权规则
	 * 
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			 .antMatchers(new String[]{"/druid/**","/js/**","/css/**","/img/**","/images/**","/fonts/**","/**/favicon.ico"})
			 .permitAll()//放行url
	         .anyRequest().authenticated()//所有的请求需要认证即登陆后才能访问
	         .and()
	         .formLogin()
	         .loginPage("/login")
	         .defaultSuccessUrl("/",true)
	         .failureUrl("/login?error")
	         .permitAll() //登录页面可任意访问
	         .and()
	         .logout()
	         .permitAll();//注销请求可任意访问
		   
	}
    @Override
    public void configure(WebSecurity web) throws Exception {
	     web.ignoring().antMatchers("/druid/**");
	}
	/* 
	 * 定制认证规则
	 * 
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		 Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		 auth.userDetailsService(loginService).passwordEncoder(encoder);
	     //remember me
	     auth.eraseCredentials(false);
	}

}

package cn.ashitaba;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AshitabaApplicationTests {
	
	@Autowired
	DataSource dataSource;
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void contextLoads() throws Exception {
		/*logger.trace("trace");
		logger.info("info");
		logger.debug("debug");
		logger.warn("warn");
		logger.error("error");
		System.out.println(dataSource.getClass());
		Connection con = dataSource.getConnection();
		System.out.println(con);
		con.close();*/
		 Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		 System.out.println(encoder.encodePassword("123456", null));
	}

	
	
	
}

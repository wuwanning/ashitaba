package cn.ashitaba;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AshitabaApplicationTests {
	
	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() throws Exception {
		System.out.println(dataSource.getClass());
		Connection con = dataSource.getConnection();
		System.out.println(con);
		con.close();
	}

}

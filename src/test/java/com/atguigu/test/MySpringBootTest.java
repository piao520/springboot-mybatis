package com.atguigu.test;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringBootTest {

    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    @Test
    public void test1() {
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }

    @Test
    public void test2() throws SQLException {
        System.out.println("---------------------");
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println("---------------------");
        connection.close();
    }
}

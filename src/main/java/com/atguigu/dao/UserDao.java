package com.atguigu.dao;


import com.atguigu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper // 扫描单个dao
@Repository
public interface UserDao {

    List<User> findAll();
}

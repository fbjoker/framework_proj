package com.alex.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.alex.bean.User;
import com.alex.mapper.UserMapper;

public class TestUserMapper {

	@Test
	public void testMap2() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		Map<Integer, User> map = mapper.findalltomap();
		System.out.println(map);
	}
	@Test
	public void testList() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		 SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		 SqlSession session = build.openSession(true);
		 UserMapper mapper = session.getMapper(UserMapper.class);
		 
		 List<User> findall = mapper.findall();
		 System.out.println(findall);
	}
	@Test
	public void testMap() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		 Map<String, Object> map = mapper.slectUserByIdtomap("5");
		System.out.println(map);
	}

}

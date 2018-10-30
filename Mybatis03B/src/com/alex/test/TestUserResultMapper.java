package com.alex.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.alex.bean.User;
import com.alex.mapper.UserResultMapper;

public class TestUserResultMapper {

	@Test
	public void test3() throws IOException {
		
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		UserResultMapper mapper = session.getMapper(UserResultMapper.class);
		
		User user = mapper.findUserByIdassosiationstep("5");
		System.out.println(user.getUsername());
		
		
		System.out.println("---------------------------------------");
		System.out.println(user);
		
	}
	@Test
	public void test2() throws IOException {
		
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession(true);
		UserResultMapper mapper = session.getMapper(UserResultMapper.class);
		
		User user = mapper.findUserByIdassosiation("5");
		System.out.println(user);
		
	}
	@Test
	public void test1() throws IOException {
		
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		 SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		 SqlSession session = build.openSession(true);
		 UserResultMapper mapper = session.getMapper(UserResultMapper.class);
		 
		 User user = mapper.findUserById("5");
		 System.out.println(user);
		
	}
	@Test
	public void test0() throws IOException {
		
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession(true);
		UserResultMapper mapper = session.getMapper(UserResultMapper.class);
		
		User user = mapper.findUserByIdone("5");
		System.out.println(user);
		
		
	}

}

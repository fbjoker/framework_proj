package com.alex.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.alex.bean.User;
import com.alex.mapper.TestDanySql;

public class TestSql {

	@Test
	public void batchdelete() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		TestDanySql mapper = session.getMapper(TestDanySql.class);
		User user = new User();

		try {
			List<Integer> ids = new ArrayList<>();

			ids.add(34);
			ids.add(35);
			mapper.batchDelete(ids);
			session.commit();
		} finally {
			session.close();
		}

	}

	@Test
	public void batchUpdate() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		TestDanySql mapper = session.getMapper(TestDanySql.class);
		

		try {
			List<User> users1 = new ArrayList<>();

			users1.add(new User(37, "kakxi22", "kakx123", "wuwu@yahoo.com"));
			users1.add(new User(38, "kakxi43", "kakx123", "wuwu@yahoo.com"));
			users1.add(new User(39, "kakxi52", "kakx123", "wuwu@yahoo.com"));

			mapper.batchUpdate(users1);
			session.commit();
		} finally {
			session.close();
		}

	}

	@Test
	public void batchAdd() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		TestDanySql mapper = session.getMapper(TestDanySql.class);
		User user = new User();

		try {
			List<User> users1 = new ArrayList<>();

			users1.add(new User("kakxi4", "kakx123", "kakxi@yahoo.com"));
			users1.add(new User("kakxi5", "kakx123", "kakxi@yahoo.com"));
			users1.add(new User("kakxi6", "kakx123", "kakxi@yahoo.com"));

			mapper.batchAdd(users1);
			session.commit();
		} finally {
			session.close();
		}

	}

	@Test
	public void batchFind() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		TestDanySql mapper = session.getMapper(TestDanySql.class);
		User user = new User();

		try {
			List<Integer> ids = new ArrayList<>();

			ids.add(4);
			ids.add(28);

			List<User> batchFind = mapper.batchFind(ids);
			System.out.println(batchFind);
		} finally {
			session.close();
		}

	}

	@Test
	public void testSet() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		TestDanySql mapper = session.getMapper(TestDanySql.class);
		User user = new User();

		user.setId(28);

		user.setUsername("alex");
		user.setPassword("rr");
		user.setEmail("3asf@ww");

		mapper.testSet(user);
		session.commit();

	}

	@Test
	public void testTrim() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		TestDanySql mapper = session.getMapper(TestDanySql.class);
		User user = new User();

		user.setId(4);

		user.setUsername("test1");
		user.setPassword("9257");
		user.setEmail("33@ww");

		List<User> tt = mapper.testTrim(user);
		System.out.println(tt);
	}

	@Test
	public void testchoose() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		TestDanySql mapper = session.getMapper(TestDanySql.class);
		User user = new User();

		// user.setId(4);

		// user.setUsername("test1");
		// user.setPassword("9257");
		// user.setEmail("33@ww");

		List<User> tt = mapper.testchoose(user);
		System.out.println(tt);
	}

	@Test
	public void test() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession();
		TestDanySql mapper = session.getMapper(TestDanySql.class);
		User user = new User();
		user.setId(4);

		user.setUsername("test1");
		// user.setPassword("9257");
		user.setEmail("33@ww");

		User tt = mapper.testIF(user);
		System.out.println(tt);
	}

}

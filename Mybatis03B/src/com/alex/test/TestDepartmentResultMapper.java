package com.alex.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.alex.bean.Department;
import com.alex.mapper.DepartmentResultMapper;

public class TestDepartmentResultMapper {

	@Test
	public void test2() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession(true);
		DepartmentResultMapper mapper = session.getMapper(DepartmentResultMapper.class);
		Department dp = mapper.findByIdassociation("1001");
		System.out.println(dp.getDeptName());
		System.out.println("4444444444444444444444444444444444");
		System.out.println(dp);
	}
	@Test
	public void test1() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession(true);
		DepartmentResultMapper mapper = session.getMapper(DepartmentResultMapper.class);
		Department dp = mapper.findById("1001");
		System.out.println(dp);
	}
	@Test
	public void test0() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = build.openSession(true);
		DepartmentResultMapper mapper = session.getMapper(DepartmentResultMapper.class);
		Department dp = mapper.findByIdone("1001");
		System.out.println(dp);
	}

}

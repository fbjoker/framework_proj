package com.atguigu.mybatis.test;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.mapper.EmployeeMapper;

public class TestMybatis {
	
	
	@Test
	public void testSelect()  throws Exception{
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			
//			List<Employee> emps = mapper.selectEmployees();
//			System.out.println(emps );
			
//			Map<String,Object> map = mapper.selectEmployeeByIdReturnMap(3);
//			System.out.println(map );
			
			Map<Integer ,Employee> map = mapper.selectEmployeesReturnMap();
			System.out.println(map );
		} finally {
			session.close();
		}
	}
	
	
	public SqlSessionFactory  getSqlSessionFactory() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
					new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	
	

}

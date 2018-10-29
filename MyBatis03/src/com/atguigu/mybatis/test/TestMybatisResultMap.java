package com.atguigu.mybatis.test;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.mybatis.beans.Department;
import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.mapper.DepartmentMapperResultMap;
import com.atguigu.mybatis.mapper.EmployeeMapper;
import com.atguigu.mybatis.mapper.EmployeeMapperResultMap;

public class TestMybatisResultMap {
	
	@Test
	public void testResultMapCollection()  throws Exception{
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			DepartmentMapperResultMap mapper = session.getMapper(DepartmentMapperResultMap.class);
			
			Department dept  =mapper.selectDeparmentAndEmpsById(101);
			System.out.println("dept:" + dept );
			System.out.println("emps: " + dept.getEmps());
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testResultMapAssociationStep()  throws Exception{
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			EmployeeMapperResultMap mapper  = session.getMapper(EmployeeMapperResultMap.class);
			
			Employee employee = mapper.selectEmployeeAndDeptByIdStep(8);
			
			System.out.println("employee : " + employee.getLastName());
			
			System.out.println("=---------------------------------------=");
			
			System.out.println("dept: " + employee.getDept());
			
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testResultMapAssociation()  throws Exception{
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			EmployeeMapperResultMap mapper  = session.getMapper(EmployeeMapperResultMap.class);
			
			Employee employee = mapper.selectEmployeeAndDeptById(8);
			
			System.out.println("employee : " + employee);
			
			System.out.println("dept: " + employee.getDept());
			
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testResultMapCascade()  throws Exception{
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			EmployeeMapperResultMap mapper  = session.getMapper(EmployeeMapperResultMap.class);
			
			Employee employee = mapper.selectEmployeeAndDeptById(8);
			
			System.out.println("employee : " + employee);
			
			System.out.println("dept: " + employee.getDept());
			
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

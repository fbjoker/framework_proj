package com.atguigu.mybatis.helloWorld;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.mapper.EmployeeMapper;

public class TestMybatis {
	
	public SqlSessionFactory  getSqlSessionFactory() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
					new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	
	@Test
	public void testJdbcReturnKeys() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url  = "jdbc:mysql://localhost:3306/javaee_0808";
		String user = "root";
		String password= "1234";
		Connection conn = DriverManager.getConnection(url, user, password);
		
		String sql = " insert into tbl_employee(last_name,email,gender) values(?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, "Tom");
		ps.setString(2, "tom@sina.com");
		ps.setInt(3, 1);
		
		int result = ps.executeUpdate();
		
		System.out.println("对数据库的影响条数: " + result );
		
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		int keys = rs.getInt(1);
		
		System.out.println("keys : " + keys );
		
	}
	
	
	
	@Test
	public void testCRUD()  throws Exception{
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			//获取Mapper接口的代理实现类对象
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			
			//查询
//			Employee employee = mapper.selectEmployeeById(2);
//			System.out.println("查询: " + employee );
			
			//添加
			Employee employee = new Employee(null, "许刚", "xg@atguigu.com", 1);
			Integer result  = mapper.insertEmployee(employee);
			System.out.println("result : " + result );
			
			System.out.println("自增的ID: " + employee.getId());

			
			//修改
//			Employee employee  = new Employee(6, "许妈妈","xmm@atguigu.com", 0);
//			mapper.updateEmployee(employee);
			
			//删除
//			Boolean result = mapper.deleteEmployeeById(7);
//			System.out.println("result : " + result );
//			
			
			//增删改需要进行提交
			session.commit();
		} finally {
			session.close();
		}
	}
	
	
	@Test
	public void testHelloWorldMapper()  throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
					new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session  = sqlSessionFactory.openSession();
		try {
			//获取Mapper接口的代理实现类对象
			EmployeeMapper  mapper  =  session.getMapper(EmployeeMapper.class);
			
			System.out.println("mapper: " + mapper.getClass().getName());
			
			
			Employee employee = mapper.selectEmployeeById(2);
			
			System.out.println("employee : " + employee );
			
			
		} finally {
			session.close();
		}
	}
	
	
	
	/**
	 * 小结:
	 * 	  两个重要的配置文件
	 * 		全局配置文件   mybatis-config.xml   ==>Mybatis 全局的一些配置 
	 * 		SQL映射文件   xxxMapper.xml    ==> CRUD的SQL语句 
	 * 	 两个中要的对象
	 * 		SqlSessionFactory  ： SqlSession工厂， 主要用于创建SqlSession
	 * 		SqlSession  ： 会话对象， 与数据库的会话对象.  可以理解为对Connection的封装. 
	 */
	@Test
	public void testHelloWorld()  throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
					new SqlSessionFactoryBuilder().build(inputStream);
		System.out.println(sqlSessionFactory);
		
		//获取SqlSession对象
		//SqlSession  session = sqlSessionFactory.openSession();
		
		//获取带自动提交的SqlSession
		SqlSession session = sqlSessionFactory.openSession(true);
		
		try {
			/**
			 * 两个参数:
			 * 	statement   Unique identifier matching the statement to use.   SQL语句的唯一标识
				parameter   A parameter object to pass to the statement.       执行SQL使用的参数
			 */
			Employee employee = session.selectOne("suibian.selectEmployee", 2);
			
			// insert()   update()  delete()
		
			System.out.println("employee : " + employee );
		} finally {
			session.close();
		}
		
	}

}

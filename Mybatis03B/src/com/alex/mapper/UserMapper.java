package com.alex.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.alex.bean.User;

public interface UserMapper {
	
	
	public Boolean addUser(User user);
	public Integer deleteUserById(String id);
	public Integer updateUser(User user);
	public User quaryUserById(String id);
	public Map<String,Object> slectUserByIdtomap(String id);
	public List<User> findall();
	@MapKey("id")
	public Map<Integer,User> findalltomap();
	
	public User quaryUserByIdAndUsername(@Param("id")String id,@Param("username")String username);

}

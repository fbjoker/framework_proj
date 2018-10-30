package com.alex.mapper;

import java.util.List;

import com.alex.bean.Department;
import com.alex.bean.User;

public interface DepartmentResultMapper {
	
	public Department findByIdone(String id);
	public Department findById(String id);
	public Department findByIdassociation(String id);
	public Department findByIdassociationsetp(String id);
	
	

}

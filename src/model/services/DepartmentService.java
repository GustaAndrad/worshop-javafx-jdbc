package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		list.add(new Department(01, "Books"));
		list.add(new Department(02, "Computers"));
		list.add(new Department(03, "Eletronics"));
		return list;
	}
	

}

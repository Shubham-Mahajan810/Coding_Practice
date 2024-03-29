package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjbdc.Student;

public class studentDaoImpl implements studentDao{
	private JdbcTemplate jdbcTemplate;
	@Override
	
	
	
	public int instert(Student student) {
		 String query="insert into student(id,name,city) value(?,?,?)";
	int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	
	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		String query="update student set name=?,city=? where id=?";
		int s = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return s;
	}
	@Override
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentId);
		return r;
	}

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	






	
  
	
}

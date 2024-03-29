package com.spring.jdbc.dao;

import com.spring.jdbc.springjbdc.Student;

public interface studentDao {
 public int instert(Student student);
 public int change(Student student );
 public int delete(int studenetId);
 
}

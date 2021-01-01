package com.maroti.springbootjdbc.dao;

import com.maroti.springbootjdbc.entity.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> getStudentList();
    public Student getStudentById(Integer roll);
    public void deleteStudent(Integer roll);
    public void insertStudent(Student student);
    public void updateStudent(Student student);

}

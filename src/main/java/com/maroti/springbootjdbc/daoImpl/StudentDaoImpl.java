package com.maroti.springbootjdbc.daoImpl;

import com.maroti.springbootjdbc.dao.StudentDao;
import com.maroti.springbootjdbc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {
    @Autowired
    EntityManager entityManager;

    @Override
    public List<Student> getStudentList() {
        TypedQuery<Student> namedQuery =entityManager.createNamedQuery("find_all_student", Student.class);
        return namedQuery.getResultList();
    }

    @Override
    public Student getStudentById(Integer roll) {
        return entityManager.find(Student.class, roll);
    }

    @Override
    public void deleteStudent(Integer roll) {
        Student student = getStudentById(roll);
         entityManager.remove(student);

    }

    @Override
    public void insertStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void updateStudent(Student student) {
        entityManager.merge(student);
    }

    /*@Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getStudentList() {
        return jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    public Student getStudentById(Integer roll) {
        return jdbcTemplate.queryForObject("select * from student where roll=?", new Object[]{roll}, new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    public int deleteStudent(Integer roll) {
        return jdbcTemplate.update("delete from student where roll=?", new Object[]{roll});
    }

    @Override
    public void insertStudent(Student student) {
        jdbcTemplate.update("insert into student (roll, name, addr, gender, mobile, dob) values(?,?,?,?,?,?)", student.getRoll(), student.getName(),
                student.getAddr(), student.getGender(), student.getMobile(), new Timestamp(student.getDob().getTime()) );

    }

    @Override
    public void updateStudent(Student student) {
        jdbcTemplate.update("update student set name=?, addr=?, gender=?, dob=?, mobile=? where roll=?",
                student.getName(), student.getAddr(), student.getGender(), new Timestamp(student.getDob().getTime()), student.getMobile(), student.getRoll());
    }*/
}

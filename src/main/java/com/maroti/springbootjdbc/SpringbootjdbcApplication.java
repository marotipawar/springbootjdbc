package com.maroti.springbootjdbc;

import com.maroti.springbootjdbc.dao.StudentDao;
import com.maroti.springbootjdbc.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootApplication
public class SpringbootjdbcApplication implements CommandLineRunner {

	@Autowired
	private StudentDao studentDao;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(SpringbootjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Student => {}", studentDao.getStudentList());
		logger.info("Find Student by Roll -> {}", studentDao.getStudentById(10001));
		logger.info("Delete Student Roll-> 10001 {}", studentDao.deleteStudent(10001));
		Student student = new Student(1004, "Jyoti", "Pune", "9876543215", new Date(), "Female");
		studentDao.updateStudent(student);
		Student student1 = new Student(1005, "Priyanka", "Mumbai", "9876543216",  new Date(), "Female");
		studentDao.insertStudent(student1);

	}
}

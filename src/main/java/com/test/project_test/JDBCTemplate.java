package com.test.project_test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class JDBCTemplate implements CommandLineRunner {

	@Autowired
	private JDBCTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(JDBCTemplate.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO employee (id_card, nama) VALUES ("+"1, 'Karyawan 1')";
		
		// int rows = jdbcTemplate.update(sql);
		
	}

}

package com.test.project_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Iterator;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ArrayList<String> employee = new ArrayList<String>();
		employee.add("Karyawan1");
		employee.add("Karyawan2");
		employee.add("Karyawan3");
		employee.add("Karyawan4");
		
		Iterator<String> iterasi = employee.iterator();
		while(iterasi.hasNext()) {
			System.out.println(iterasi.next());
		}
		
	}

}

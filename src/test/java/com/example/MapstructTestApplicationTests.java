package com.example;

import com.example.bean.Company;
import com.example.bean.CompanyConverter;
import com.example.bean.CompanyDTO;
import com.example.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapstructTestApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void mapStructTest(){
		Employee employee = new Employee();
		employee.setName("zhangsan");
		employee.setAge(20);
		Company company = new Company();
		company.setId(1);
		company.setEmployee(employee);
		company.setName("yiyun");
		company.setCreateTime(new Date());

		CompanyDTO companyDTO = CompanyConverter.INSTANCE.domain2DTO(company);
		System.out.printf(companyDTO.toString());
	}

}

package com.tnsif.deptinj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(DependencyInjectionApplication.class, args);
		Customer c = con.getBean(Customer.class);
		//Product p = con.getBean(Product.class);
		
		c.display();
		//p.show();
	}

}
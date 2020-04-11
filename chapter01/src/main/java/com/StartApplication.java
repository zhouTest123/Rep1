package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.model.Users;
import com.service.UsersServiceImpl;



@SpringBootApplication
//@ComponentScan(basePackages={"com.service"})
//@MapperScan("com.dao")
public class StartApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StartApplication.class, args);
		UsersServiceImpl impl = (UsersServiceImpl)context.getBean(UsersServiceImpl.class);
		Users users = impl.find(1);
		System.out.println(users.getUsername());
	}

}

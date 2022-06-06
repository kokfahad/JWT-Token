package com.token.jsonwebtoken;

import com.token.jsonwebtoken.domain.Role;
import com.token.jsonwebtoken.domain.User;
import com.token.jsonwebtoken.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JsonwebtokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonwebtokenApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}


	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"John Travolta","john","123",new ArrayList<>()));
			userService.saveUser(new User(null,"Will Smith","will","123",new ArrayList<>()));
			userService.saveUser(new User(null,"John Cena","cena","123",new ArrayList<>()));
			userService.saveUser(new User(null,"Shawn Umaga","umaga","123",new ArrayList<>()));

			userService.addRoleToUser("john","ROLE_USER");
			userService.addRoleToUser("will","ROLE_MANAGER");
			userService.addRoleToUser("cena","ROLE_ADMIN");
			userService.addRoleToUser("cena","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("cena","ROLE_USER");
		};
	}

}

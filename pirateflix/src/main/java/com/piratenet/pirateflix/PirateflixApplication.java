package com.piratenet.pirateflix;

import com.piratenet.pirateflix.entity.User;
import com.piratenet.pirateflix.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PirateflixApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(PirateflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("teste", "teste", "$2y$12$S3FXPIg3Icu4MRzFsj59rOzFFmEGwXOqVwyKJ0/oP3rW5JxNDU/2e", "teste@teste.teste");
		userRepository.save(user);
	}
}

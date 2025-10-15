package com.example.hotelbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelbookingApplication.class, args);
	}

}

// package com.hotelpackage;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

// import com.example.hotelbooking.hotelpackage.entity.User;
// import com.hotelpackage.repository.UserRepository;

// @SpringBootApplication
// public class HotelbookingApplication {

//     @Autowired
//     private UserRepository userRepository;

//     public static void main(String[] args) {
//         SpringApplication.run(HotelbookingApplication.class, args);
//     }

//     // CommandLineRunner to create a user when the application starts
//     @Bean
//     public CommandLineRunner createUser() {
//         return args -> {
//             // Check if a user already exists
//             if (userRepository.count() == 0) {
//                 // Create an Admin user with email and password
//                 User user = new User();
//                 user.setEmail("admin@example.com");
//                 user.setPassword("adminPassword");  // In real-world, hash the password
//                 user.setRole("ADMIN");

//                 // Save the user to the database
//                 userRepository.save(user);
//                 System.out.println("Admin user created: " + user.getEmail());
//             } else {
//                 System.out.println("User already exists.");
//             }
//         };
//     }
// }


package com.teapot.bootstrap;

import com.teapot.entity.User;
import com.teapot.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataGenerator implements CommandLineRunner {

    private UserRepository userRepository;


    public DataGenerator(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        //Delete All
        this.userRepository.deleteAll();

        //Create users
        User employee = new User("secil", "secil123", "USER","");
        User admin = new User("admin", "admin123","ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager", "manager123","MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(employee,admin,manager);

        userRepository.saveAll(users);


    }


}

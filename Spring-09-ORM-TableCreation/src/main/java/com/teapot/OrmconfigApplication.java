package com.teapot;

import com.teapot.entity.Car;
import com.teapot.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OrmconfigApplication {

	@Autowired
	CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrmconfigApplication.class, args);
	}

	@PostConstruct
	public void dataInit(){

//		List<Car> cars = new ArrayList<>();
//		cars.add(new Car());

		Car c1 = new Car("BMW", "M5");
		Car c2 = new Car("Audi", "A5");
		Car c3 = new Car("Nissan", "Almira");

		carRepository.save(c1);
		carRepository.save(c2);
		carRepository.save(c3);




	}

}

package com.example.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {
	
	private CarRepo carRepo;

	public CarController(@Autowired CarRepo carRepo) {
		this.carRepo = carRepo;
	}

	@GetMapping("cars")
	public List<Car> getCars() {
		return carRepo.findAll();
	}
	
	@PostMapping("/car")
	public Car addCar(@RequestBody Car car) {
		carRepo.save(car);
		return car;
	}
	
	@GetMapping("/car/{id}")
	public Optional<Car> getCarById(@PathVariable int id){
		return carRepo.findById(id);
	}

}

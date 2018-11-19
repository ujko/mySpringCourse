package pl.ujo.kursSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ujo.kursSpring.model.Car;
import pl.ujo.kursSpring.repositories.CarRepositoryMemory;

import java.util.List;

@Service
public class CarService implements ICarService{

    @Autowired
    CarRepositoryMemory carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    @Override
    public Car getCarByName(String name) {
        return carRepository.getCarByName(name);
    }

    @Override
    public Car getCarById(int id) {
        return carRepository.getCarById(id);
    }

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);
    }
}

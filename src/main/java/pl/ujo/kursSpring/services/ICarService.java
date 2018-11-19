package pl.ujo.kursSpring.services;

import pl.ujo.kursSpring.model.Car;

import java.util.List;

public interface ICarService {
    List<Car> getAllCars();
    Car getCarByName(String name);
    Car getCarById(int id);
    void addCar(Car car);
}

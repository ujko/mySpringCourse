package pl.ujo.kursSpring.repositories;

import pl.ujo.kursSpring.model.Car;

import java.util.List;

public interface ICarRepository {
    List<Car> getAllCars();
    Car getCarByName(String name);
    Car getCarById(int id);
    void addCar(Car car);
}

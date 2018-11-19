package pl.ujo.kursSpring.repositories;

import org.springframework.stereotype.Repository;
import pl.ujo.kursSpring.model.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CarRepositoryMemory implements ICarRepository {

    private Map<Integer, Car> cars = new HashMap<>();

    @PostConstruct
    public void createCars() {
        addCar(new Car("BMW", "Red"));
        addCar(new Car("Jaguar", "Silver"));
        addCar(new Car("BMW", "Green"));
    }

    private int createId() {
        return cars.keySet().stream().reduce(Integer::max).orElse(0) + 1;
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars.values());
    }

    @Override
    public Car getCarByName(String name) {
        return cars.values().stream().filter(s -> s.getName().equals(name)).findFirst().orElse(new Car("Default Car", "White"));
    }

    @Override
    public Car getCarById(int id) {
        return cars.get(id);
    }

    @Override
    public void addCar(Car car) {
        car.setId(createId());
        cars.put(car.getId(), car);
    }
}

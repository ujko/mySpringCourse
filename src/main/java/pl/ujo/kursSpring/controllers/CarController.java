package pl.ujo.kursSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.ujo.kursSpring.model.Car;
import pl.ujo.kursSpring.services.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/car")
    public String getCar(@RequestParam("id") Integer id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "car";
    }

    @RequestMapping("/allcars")
    public String showAllCars(Model model) {
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        return "allcars";
    }
}

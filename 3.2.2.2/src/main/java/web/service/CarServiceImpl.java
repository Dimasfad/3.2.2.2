package web.service;

import org.springframework.stereotype.Component;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Audi", "Black", 777));
        cars.add(new Car("Mercedes", "White", 888));
        cars.add(new Car("BMW", "Blue", 999));
        cars.add(new Car("Skoda", "Grey", 555));
        cars.add(new Car("Lada", "Red", 666));
    }
    @Override
    public List<Car> getCar(int count) {
        if(count == 0 || count >= 5) {
            return cars;
        } return cars.stream().limit(count).collect(Collectors.toList());
    }

}
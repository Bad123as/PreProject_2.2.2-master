package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ListCars {
    public static List<Car> returnCars(int i) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", 2020));
        cars.add(new Car("AUDI", "A8", 2021));
        cars.add(new Car("VOLVO", "70", 2015));
        cars.add(new Car("HONDA", "CIVIC", 2021));
        cars.add(new Car("NISSAN", "GTR", 2019));

        List<Car> returnCars = new ArrayList<>();
        for(int a = 0; a < i; a++){
            returnCars.add(cars.get(a));
        }
        return returnCars;
    }
}

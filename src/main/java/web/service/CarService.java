package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getSomeCars() {
        List<Car> list = new ArrayList<>();
        Car car1 = new Car("A8", "Audi", "67F5");
        Car car2 = new Car("Rio", "Kia", "24U8");
        Car car3 = new Car("X5", "BMW", "45R7");
        Car car4 = new Car("Solaris", "Hyundai", "87P2");

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);

        return list;

    }
}

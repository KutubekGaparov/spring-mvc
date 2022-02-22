package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoCarImpl implements DaoCar {

    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Audi", "red"));
        cars.add(new Car(2, "Volvo", "yellow"));
        cars.add(new Car(3, "Mers", "black"));
        cars.add(new Car(4, "BMW", "white"));
        cars.add(new Car(5, "Mazda", "gray"));
    }


    @Override
    public List<Car> getByNum(int num) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (num > 5) {
                return cars;
            } else {
                carList.add(cars.get(i));
            }
        }
        return carList;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }


}

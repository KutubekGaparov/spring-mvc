package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class Dao implements DaoCar {

    List<Car> users;

    {
        users = new ArrayList<>();
        users.add(new Car(1, "Audi", "red"));
        users.add(new Car(2, "Volvo", "yellow"));
        users.add(new Car(3, "Mers", "black"));
        users.add(new Car(4, "BMW", "white"));
        users.add(new Car(5, "Mazda", "gray"));
    }


    @Override
    public List<Car> getByNum(int num) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (num > 5) {
                return users;
            } else {
                carList.add(users.get(i));
            }
        }
        return carList;
    }

    @Override
    public List<Car> getAllCars() {
        return users;
    }


}

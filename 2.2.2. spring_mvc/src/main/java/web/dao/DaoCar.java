package web.dao;

import web.model.Car;

import java.util.List;

public interface DaoCar {
    public List<Car> getByNum(int num);
    public List<Car>getAllCars();
}

package web.service;

import org.springframework.stereotype.Component;
import web.dao.Dao;
import web.dao.DaoCar;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

    @Component
    public class ServiceCarImpl implements ServiceCar {

        private DaoCar daoCar=new Dao();

        @Override
        public List<Car> getByNum(int num) {
            return daoCar.getByNum(num);
        }

        @Override
        public List<Car> getAllCars() {
            return daoCar.getAllCars();
        }
    }


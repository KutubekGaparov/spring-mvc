package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.Dao;
import web.model.Car;
import web.service.ServiceCarImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    public final ServiceCarImpl dao;

    @Autowired
    public CarsController(ServiceCarImpl dao) {
        this.dao = dao;
    }


    @GetMapping
    public   String findAllCars(Model model) {
        model.addAttribute("cars1",dao.getAllCars());
        return "/getAllCar";
    }

    @GetMapping("/")
    public String getCar(@RequestParam("count") int count, Model model){
        model.addAttribute("cars2", dao.getByNum(count));
        return "/cars";
    }


}
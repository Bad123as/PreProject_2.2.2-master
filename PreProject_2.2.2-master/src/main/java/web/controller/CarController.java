package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.ListCars;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarsTwo(HttpServletRequest model, ModelMap modell) {
        int e = Integer.parseInt(model.getParameter("count"));
        if(e >= 5){
            e = 5;
        }
        List<Car> cars = ListCars.returnCars(e);
        List<String> carss = new ArrayList<>();
        for (Car s : cars) {
            carss.add(s.toString());
        }
        modell.addAttribute("cars", carss);
        return "cars";
    }
}
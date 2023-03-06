package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;
import web.service.ServiceImpl;


@Controller
public class CarController {
    private Service serv = new ServiceImpl();
    @GetMapping(value ="/cars")
    public String carModels(ModelMap model) {
        model.addAttribute("messages", new ServiceImpl().getAllCars());
        return "cars";
    }
    @GetMapping(value ="/cars",params = "count")
    public String carModels(@RequestParam("count") int count, ModelMap model) {
        model.addAttribute("messages", serv.getCars(count));
        return "cars";
    }
}

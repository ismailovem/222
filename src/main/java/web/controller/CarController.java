package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;


@Controller
public class CarController {
    private Service serv;
    @Autowired
    public CarController(Service serv) {
        this.serv = serv;
    }
    @GetMapping(value ="/cars")
    public String carModels(@RequestParam(required=false) Integer count, ModelMap model) {
        model.addAttribute("messages", serv.getCars(count));
        return "cars";
    }
}

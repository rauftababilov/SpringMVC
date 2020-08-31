package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars", params = "locale")
    public String getSomeCars(@RequestParam(name = "locale") String locale, Model model) {
        if (locale.equals("en")) {
            model.addAttribute("title", "CARS")
                    .addAttribute("mark", "Mark")
                    .addAttribute("carModel", "Model")
                    .addAttribute("number", "Number");
        } else if (locale.equals("ru")) {
            model.addAttribute("title", "МАШИНЫ")
                    .addAttribute("mark", "Марка")
                    .addAttribute("carModel", "Модель")
                    .addAttribute("number", "Номер");
        }

        model.addAttribute("cars", carService.getSomeCars());
        return "cars";
    }
}

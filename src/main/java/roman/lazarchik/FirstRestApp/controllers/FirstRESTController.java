package roman.lazarchik.FirstRestApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // тоже самое что @Controller + @ResponseBody над каждым методом
@RequestMapping("/api")
public class FirstRESTController {

    @GetMapping("/hello")
    private String sayHello(){
        return "Hello";
    }
}

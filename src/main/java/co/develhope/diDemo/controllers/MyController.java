package co.develhope.diDemo.controllers;


import co.develhope.diDemo.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //it is a component
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/getName")
    public String getName(){
        return myService.getName();
    }

    @GetMapping("/")
    public String getMessage(){
        return "Welcome to spring";
    }
}

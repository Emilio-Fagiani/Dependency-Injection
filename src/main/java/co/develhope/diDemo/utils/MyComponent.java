package co.develhope.diDemo.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent() {
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Emilio";
    }


    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }
}

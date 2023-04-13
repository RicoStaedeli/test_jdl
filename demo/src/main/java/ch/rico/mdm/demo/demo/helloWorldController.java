package ch.rico.mdm.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloWorldController {
    
    @GetMapping("/ping")
    public String ping(){
        return "Hello";
    }
}

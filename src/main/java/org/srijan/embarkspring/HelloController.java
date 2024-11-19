package org.srijan.embarkspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kilo")
public class HelloController {

    @GetMapping("/world")
    public String helloWorld() {
        System.out.println("Hello World");
        return "Hello World";
    }
}

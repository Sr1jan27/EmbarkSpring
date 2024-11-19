package org.srijan.embarkspring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class HelloController {

    @GetMapping("/world")
    public HelloResponse helloWorld() {
//        System.out.println("Hello World");
        return new HelloResponse("Faltu Try", "Srijan");
    }

    @GetMapping("/hello/{name}")
    public HelloResponse hello(@PathVariable String name) {
//        System.out.println("Hello World");
        return new HelloResponse("Faltu Try", name);
    }

    @PostMapping("/hey")
    public HelloResponse hey(@RequestBody HelloResponse helloResponse) {
        return new HelloResponse(helloResponse.getMessage(), helloResponse.getName());
    }
}

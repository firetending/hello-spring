package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

////    handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String Hello() {
//        return "Hello, Spring!";
//    }

//    @GetMapping("goodbye")
//    @ResponseBody
//    public String Goodbye() {
//        return "Goodbye, Spring!";
//    }

    // handler for requests of the for /hello?name=LaunchCode
    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // handler for requests of the for /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathVariable(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // handler that redirects to a path rather than using @ResponseBody
    @GetMapping("helloRE")
    public String helloRedirect() {
        return "redirect:/hello/gotcha";
    }
}

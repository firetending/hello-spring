package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

//    // handler for requests of the for /hello/~~~~
//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloWithPathVariable(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//
//    // handler that redirects to a path rather than using @ResponseBody
//    @GetMapping("helloRE")
//    public String helloRedirect() {
//        return "redirect:/hello/gotcha";
//    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='hello'>" + //submit a request to /hello
                "<input type='text' name='name'>" + //parameter is name, 'name' is just what displays in textbox
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}

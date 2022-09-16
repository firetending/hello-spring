package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    // handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String Hello() {
//        return "Hello, Spring!";
//    }
//
//    // path is /hello/goodbye since RequestMapping was added to the class
//    @GetMapping("goodbye")
//    public String Goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    // handler for requests of the for /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }
//
//    // handler for requests of the for /hello/~~~~
//    @GetMapping("{name}")
//    public String helloWithPathVariable(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//
//    // handler that redirects to a path rather than using @ResponseBody
//    @GetMapping("helloRE")
//    public String helloRedirect() {
//        return "redirect:/hello/gotcha";
//    }
//
//    // lives at /hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form method='post' action='hello'>" + //submit a request to /hello
//                "<input type='text' name='name'>" + //parameter is name, 'name' is just what displays in textbox
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    @GetMapping
    public String languageForm() {
        return "<html>" +
                "<body>" +
                    "<form action='hello' method='post'>" +
                        "<input type='text' name='greetName'>" +
                        "<select name='language'>" +
                            "<option value='english'>English</option>" +
                            "<option value='french'>French</option>" +
                            "<option value='idk'>IDK</option>" +
                        "</select>" +
                        "<input type='submit' value='Greet me!'>" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping
    public String postmethod(@RequestParam String greetName, @RequestParam String language) {
        String msg = "";
        if (language.equals("english")) {
            msg = "Hello, "+greetName+"!";
        } else if (language.equals("french")) {
            msg = "Bonjour, "+greetName+"!";
        } else if (language.equals("idk")) {
            msg = "Blurbbendorf, "+greetName+"!";
        } else {
            msg = "uh, " + greetName + "?";
        }

        return "<html>" +
                "<body>" +
                    "<h1>"+msg+"</h1>" +
                "</body>" +
                "</html>";
    }

}

package br.com.notelab.backend.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class CadernoController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}

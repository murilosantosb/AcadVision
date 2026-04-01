package br.com.notelab.backend.Controllers;

import org.springframework.stereotype.Controller;

import br.com.notelab.backend.Model.User;
import br.com.notelab.backend.Services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Controller
public class UserController {
    private UserService users;

    public UserController(UserService users) {
        this.users = users;
    }

    @PostMapping("/")
    public User userRegister(User user) {
        users.userRegister(user);
        return user;
    }
    
}

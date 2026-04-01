package br.com.notelab.backend.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.notelab.backend.Model.User;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public void userRegister(User user) {
        users.add(user);
    }
}

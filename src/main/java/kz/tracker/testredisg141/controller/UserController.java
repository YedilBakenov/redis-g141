package kz.tracker.testredisg141.controller;

import kz.tracker.testredisg141.model.User;
import kz.tracker.testredisg141.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return userService.getUserById(id);
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @PostMapping(value = "/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}

package kz.tracker.testredisg141.service;

import kz.tracker.testredisg141.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Optional <User> getUserById(String id);
    List<User> getUsers();

    User addUser(User user);
}

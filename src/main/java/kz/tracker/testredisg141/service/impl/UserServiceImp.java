package kz.tracker.testredisg141.service.impl;

import kz.tracker.testredisg141.model.User;
import kz.tracker.testredisg141.repository.UserRepository;
import kz.tracker.testredisg141.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Override
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        if(user.getTtl()==null) user.setTtl(10L);
        return userRepository.save(user);
    }
}

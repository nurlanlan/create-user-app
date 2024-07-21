package az.edu.turing.createappgradle.service;

import az.edu.turing.createappgradle.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(int id);

    void deleteUser(int id);

    void createUser(User user);

    void updateUser(User user);
}

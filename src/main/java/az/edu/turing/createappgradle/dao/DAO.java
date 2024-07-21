package az.edu.turing.createappgradle.dao;

import az.edu.turing.createappgradle.entity.User;

import java.util.List;
import java.util.Optional;

public interface DAO {
    List<User> getAllUsers();

    Optional<User> getUserById(int id);

    void deleteUser(int id);

    void createUser(User user);

    void updateUser(User user);
}

package az.edu.turing.createappgradle.service.impl;

import az.edu.turing.createappgradle.dao.DAO;
import az.edu.turing.createappgradle.entity.User;
import az.edu.turing.createappgradle.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final DAO userDAO;

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public void createUser(User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        userDAO.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        user.setUpdatedAt(LocalDateTime.now());
        userDAO.updateUser(user);
    }
}

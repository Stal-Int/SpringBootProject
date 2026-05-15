package Lesson331.SpringBootProject.dao;

import Lesson331.SpringBootProject.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveOrUpdateUser(User user);
    void deleteUser(Long id);
    boolean existsByEmail(String email);
}

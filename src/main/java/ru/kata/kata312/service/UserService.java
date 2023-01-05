
package ru.kata.kata312.service;

import ru.kata.kata312.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUserList();

    void addUser(User user);

    User getUserById(int id);

    void update(User user);

    void delete (int id);
}
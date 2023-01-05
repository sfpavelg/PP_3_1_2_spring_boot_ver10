package ru.kata.kata312.dao;

import ru.kata.kata312.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUserList();

    void addUser(User user);

    User getUserById(int id);

//    void update(int id, User user);
    void update(User user);
    void delete (int id);

}
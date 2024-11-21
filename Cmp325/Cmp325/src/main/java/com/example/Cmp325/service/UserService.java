package com.example.Cmp325.service;
import com.example.Cmp325.model.User;
import java.util.List;

public interface UserService {
    User createUser(User User);
    User updateUse(User User);

    List<User> getAllUsers();
}

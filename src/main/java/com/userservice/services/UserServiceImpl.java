package com.userservice.services;

import com.userservice.entities.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    // fake services.....

    List<User> userList = List.of(
            new User(1311L,"Ramshek","99999"),
            new User(1312L,"Rohit","998888"),
            new User(1313L,"motu","8787587"),
            new User(1314L,"Kaddu","554545")
    );


    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user -> user.getUserid().equals(id)).findAny().orElse(null);
    }
}

package com.vinmayiswamy.business.service;

import com.vinmayiswamy.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

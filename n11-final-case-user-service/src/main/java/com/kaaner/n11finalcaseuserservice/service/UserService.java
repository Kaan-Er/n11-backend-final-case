package com.kaaner.n11finalcaseuserservice.service;

import com.kaaner.n11finalcaseuserservice.dto.UserDto;
import com.kaaner.n11finalcaseuserservice.entity.User;
import com.kaaner.n11finalcaseuserservice.request.UserSaveRequest;

public interface UserService {

    UserDto save(UserSaveRequest user);

    void remove(Long id);

    UserDto update(User user);
}

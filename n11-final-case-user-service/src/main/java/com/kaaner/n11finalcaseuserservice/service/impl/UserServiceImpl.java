package com.kaaner.n11finalcaseuserservice.service.impl;

import com.kaaner.n11finalcaseuserservice.dto.UserDto;
import com.kaaner.n11finalcaseuserservice.entity.User;
import com.kaaner.n11finalcaseuserservice.mapper.UserMapper;
import com.kaaner.n11finalcaseuserservice.repository.UserRepository;
import com.kaaner.n11finalcaseuserservice.request.UserSaveRequest;
import com.kaaner.n11finalcaseuserservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public UserDto save(UserSaveRequest userRequest) {
        User user = UserMapper.INSTANCE.toUser(userRequest);
        return UserMapper.INSTANCE.toUserDto(userRepository.save(user));
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto update(User user) {
        return UserMapper.INSTANCE.toUserDto(userRepository.save(user));
    }
}

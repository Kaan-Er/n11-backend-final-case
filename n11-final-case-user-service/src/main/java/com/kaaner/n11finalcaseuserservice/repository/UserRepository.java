package com.kaaner.n11finalcaseuserservice.repository;

import com.kaaner.n11finalcaseuserservice.dto.UserDto;
import com.kaaner.n11finalcaseuserservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.kaaner.n11finalcaseuserservice.controller;

import com.kaaner.n11finalcaseuserservice.dto.UserDto;
import com.kaaner.n11finalcaseuserservice.entity.User;
import com.kaaner.n11finalcaseuserservice.request.UserSaveRequest;
import com.kaaner.n11finalcaseuserservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserSaveRequest user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @PutMapping()
    public ResponseEntity<UserDto> update(@RequestBody User user) {
        return ResponseEntity.ok(userService.update(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        userService.remove(id);
        return ResponseEntity.ok().build();
    }
}

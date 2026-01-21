package com.proyect.usermanagement.service.impl;

import com.proyect.usermanagement.dto.request.CreateUserRequest;
import com.proyect.usermanagement.dto.response.UserResponse;
import com.proyect.usermanagement.model.entity.UserEntity;
import com.proyect.usermanagement.repository.UserRepository;
import com.proyect.usermanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponse createUser(CreateUserRequest request) {

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("Username already exists");
        }

        UserEntity user = UserEntity.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .enabled(true)
                .build();

        UserEntity savedUser = userRepository.save(user);

        return UserResponse.builder()
                .id(savedUser.getId())
                .username(savedUser.getUsername())
                .email(savedUser.getEmail())
                .enabled(savedUser.isEnabled())
                .build();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> ac9deff (depure code)

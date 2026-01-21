package com.proyect.usermanagement.service;

import com.proyect.usermanagement.dto.request.CreateUserRequest;
import com.proyect.usermanagement.dto.response.UserResponse;

public interface UserService {
    UserResponse createUser(CreateUserRequest request);
}


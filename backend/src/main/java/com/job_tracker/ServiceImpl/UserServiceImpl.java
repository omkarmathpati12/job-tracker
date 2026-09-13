package com.job_tracker.ServiceImpl;

import com.job_tracker.Dto.Request.UserRequest;
import com.job_tracker.Dto.Response.UserResponse;
import com.job_tracker.Entity.UserEntity;
import com.job_tracker.Enums.Role;
import com.job_tracker.Enums.UserStatus;
import com.job_tracker.Exceptions.DuplicateResourceException;
import com.job_tracker.Exceptions.ResourceNotFoundException;
import com.job_tracker.Mapper.UserMapper;
import com.job_tracker.Repository.UserRepo;
import com.job_tracker.Service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final UserMapper userMapper;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.debug("Creating User {}", userRequest);
        if(userRepo.findByEmail(userRequest.email()).isPresent()){
            throw new DuplicateResourceException("User already exists with this email {}",userRequest.email());
        }
        UserEntity user=userMapper.toRequest(userRequest);
        user.setRole(Role.USER);
        user.setUserStatus(UserStatus.ACTIVE);
        UserEntity savedUser=userRepo.save(user);
        log.debug("Created User {}", savedUser);
        return userMapper.toResponse(savedUser);
    }

    @Override
    public UserResponse updateUser(UserRequest userRequest,Long userId) {
        UserEntity user=userRepo.findById(userId)
                .orElseThrow(()->new ResourceNotFoundException("User with id "+userId+" not found"));
        userMapper.updateEntity(userRequest,user);
        UserEntity savedUser=userRepo.save(user);
        return userMapper.toResponse(savedUser);
    }

    @Override
    public String deleteUser(Long userId) {
        log.debug("Deleting User {}", userId);
        UserEntity user=userRepo.findById(userId)
                .orElseThrow(()-> new RuntimeException("User not found"));
        user.setUserStatus(UserStatus.INACTIVE);
        userRepo.save(user);
        log.debug("Deleted User {}", userId);
        return "User deleted";
    }

    @Override
    public UserResponse getUserById(Long userId) {
        return null;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        List<UserEntity> users=userRepo.findAll();
        return users.stream()
                .map(userMapper::toResponse)
                .toList();
    }
}

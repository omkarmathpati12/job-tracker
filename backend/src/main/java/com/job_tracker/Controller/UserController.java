package com.job_tracker.Controller;

import com.job_tracker.Dto.Request.UserRequest;
import com.job_tracker.Dto.Response.UserResponse;
import com.job_tracker.ServiceImpl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserRequest userRequest){
        return  ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userRequest));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(userService.deleteUser(userId));
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody UserRequest userRequest,@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(userRequest,userId));
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
    }


}

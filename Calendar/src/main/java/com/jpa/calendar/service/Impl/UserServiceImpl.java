package com.jpa.calendar.service.Impl;

import com.jpa.calendar.dto.UserRequest;
import com.jpa.calendar.entity.User;
import com.jpa.calendar.repository.UserRepository;
import com.jpa.calendar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public String insertUser(UserRequest userRequest) {
        try {
            userRepository.save(userRequest.toEntity());
        }
        catch (Exception e){
            return "fail";
        }
        return "success";
    }

    @Override
    public String selectUser(UserRequest userRequest) {
        User user = userRepository.findByEmailAndPassword(userRequest.getEmail(),userRequest.getPassword()).orElse(null);

        if(user!=null){return "success";}
        else{return "fail";}
    }
}

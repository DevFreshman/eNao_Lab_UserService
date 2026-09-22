package org.com.lab.controller;

import org.com.lab.dto.response.*;
import org.com.lab.services.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/me")
    public UserInfoResponse getMe() {
        return userServices.getUserInfo();
    }

}
package com.teapot.controller;

import com.teapot.entity.AuthenticationRequest;
import com.teapot.entity.ResponseWrapper;
import com.teapot.entity.User;
import com.teapot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/authenticate")
    public ResponseEntity<ResponseWrapper> doLogin(@RequestBody AuthenticationRequest authenticationRequest){

        String username = authenticationRequest.getUsername();
        String password = authenticationRequest.getPassword();

        User foundUser = userService.readByUsername(username);

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        authenticationManager.authenticate(authenticationToken);

    }
}

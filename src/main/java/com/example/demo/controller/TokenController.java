package com.example.demo.controller;

import com.example.demo.model.JwtUser;
import com.example.demo.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sugeesh Chandraweera
 */
@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {
        return jwtGenerator.generate(jwtUser);
    }

}

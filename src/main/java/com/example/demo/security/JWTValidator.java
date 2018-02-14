package com.example.demo.security;

import com.example.demo.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

/**
 * @author Sugeesh Chandraweera
 */
@Component
public class JWTValidator {
    private String secret = "youtube";

    public JwtUser validate(String token) {

        JwtUser jwtUser = null;

        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
            jwtUser = new JwtUser();
            jwtUser.setUserName(body.getSubject());
            jwtUser.setId(Long.parseLong(body.get("userId").toString()));
            jwtUser.setRole(body.get("role").toString());

        }catch (Exception e){
            System.out.println("JWT Token is missing");
            e.printStackTrace();
        }

        return jwtUser;
    }
}

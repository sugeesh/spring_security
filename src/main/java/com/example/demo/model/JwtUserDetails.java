package com.example.demo.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @author Sugeesh Chandraweera
 */
public class JwtUserDetails implements UserDetails {

    private String userName;
    private String token;
    private Long id;
    private Collection<? extends GrantedAuthority> grantedAuthorities;

    public JwtUserDetails(String userName, long id, String token, List<GrantedAuthority> grantedAuthorities) {
        this.id = id;
        this.token = token;
        this.userName = userName;
        this.grantedAuthorities = grantedAuthorities;

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getUserName() {
        return userName;
    }

    public String getToken() {
        return token;
    }

    public Long getId() {
        return id;
    }

    public Collection<? extends GrantedAuthority> getGrantedAuthorities() {
        return grantedAuthorities;
    }

}

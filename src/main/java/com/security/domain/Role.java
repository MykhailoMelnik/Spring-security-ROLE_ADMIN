package com.security.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Embeddable;


@Embeddable
public class Role implements GrantedAuthority {
    String name;

    @Override
    public String getAuthority() {
        return name;
    }
}

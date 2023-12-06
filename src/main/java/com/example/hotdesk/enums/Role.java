package com.example.hotdesk.enums;

import lombok.Getter;

import java.util.Set;
@Getter
public enum Role {

    USER(Set.of()),
    ADMIN(Set.of(Permission.GET_ALL,Permission.CREATE,Permission.DELETE,Permission.UPDATE)),
    MODERATOR(Set.of(Permission.CREATE, Permission.GET_ALL));

    private final Set<Permission>permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}

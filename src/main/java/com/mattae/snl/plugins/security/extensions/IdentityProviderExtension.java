package com.mattae.snl.plugins.security.extensions;

import io.github.jbella.snl.core.api.extensions.OrderedExtension;

import java.util.List;
import java.util.Set;

public interface IdentityProviderExtension extends OrderedExtension {
    List<User> getUsers();

    List<Role> getRoles();

    public record User(
            String username,
            String firstName,
            String lastName,
            String email,
            String displayName,
            String picture,
            Set<Role> roles
    ) {
    }


    public record Role(String name) {
    }
}

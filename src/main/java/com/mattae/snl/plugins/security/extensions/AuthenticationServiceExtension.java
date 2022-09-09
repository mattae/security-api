package com.mattae.snl.plugins.security.extensions;

import io.github.jbella.snl.core.api.domain.Organisation;
import org.pf4j.ExtensionPoint;

import java.util.List;
import java.util.Optional;

public interface AuthenticationServiceExtension extends ExtensionPoint {
    Optional<String> getCurrentUsername();

    boolean isAuthenticated();

    boolean isCurrentUserInRole(String authority);

    public Organisation.IdView organisation();

    List<String> grantedAuthorities();
}

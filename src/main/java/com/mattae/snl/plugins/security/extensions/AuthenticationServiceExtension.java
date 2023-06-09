package com.mattae.snl.plugins.security.extensions;

import io.github.jbella.snl.core.api.domain.Organisation;
import io.github.jbella.snl.core.api.extensions.OrderedExtension;

import java.util.List;
import java.util.Optional;

public interface AuthenticationServiceExtension extends OrderedExtension {
    Optional<String> getCurrentUsername();

    boolean isAuthenticated();

    boolean isCurrentUserInRole(String authority);

    Organisation.IdView organisation();

    List<Organisation.ShortView> getOrganisationHierarchy();

    List<String> grantedAuthorities();
}

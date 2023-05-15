package org.makechtec.software.caltentli.user_auth;

import org.makechtec.software.caltentli.token_auth.TokenAuthenticator;

public interface UserAuthenticator extends TokenAuthenticator {
    void loadUserRequest(UserAuthRequest request);

}

package org.makechtec.software.caltentli.token_auth;

import org.makechtec.software.caltentli.auth.AuthStrategy;

public interface TokenAuthenticator extends AuthStrategy {

    void loadToken(String token);

    String getGeneratedToken();

}

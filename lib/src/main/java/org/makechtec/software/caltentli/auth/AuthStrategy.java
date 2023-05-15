package org.makechtec.software.caltentli.auth;

public interface AuthStrategy {

    AuthResponse login();
    AuthResponse check();
    void logout();

}

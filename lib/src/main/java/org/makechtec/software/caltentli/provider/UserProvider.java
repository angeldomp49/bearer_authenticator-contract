package org.makechtec.software.caltentli.provider;

import java.util.Optional;

public interface UserProvider {

    Optional<User> byUsername(String username);

}

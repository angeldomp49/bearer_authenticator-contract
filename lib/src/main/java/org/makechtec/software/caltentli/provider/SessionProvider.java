package org.makechtec.software.caltentli.provider;

import java.util.Optional;

public interface SessionProvider {

    void openSession(Session session);
    void closeSessionByToken(String token);
    Optional<Session> byToken(String token);

}

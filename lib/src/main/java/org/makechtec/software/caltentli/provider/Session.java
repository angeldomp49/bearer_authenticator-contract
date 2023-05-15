package org.makechtec.software.caltentli.provider;

import java.util.Calendar;

public record Session(
        Calendar stardedDate,
        Calendar endedDate,
        String username,
        boolean isOpen,
        String token
) {
}

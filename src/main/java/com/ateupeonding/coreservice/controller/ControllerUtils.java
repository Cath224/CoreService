package com.ateupeonding.coreservice.controller;

import java.util.UUID;

public final class ControllerUtils {

    public static UUID parseIdToUUID(String id) {
        try {
            return UUID.fromString(id);
        } catch (IllegalArgumentException ex) {
            throw new RuntimeException();
        }
    }

}

package com.floristeria.floristeria_app.crosscutting.helpers;

import java.util.UUID;

public class UUIDHelper {

    private static final String UUID_DEFAULT_VALUE = "00000000-0000-0000-0000-000000000000";

    private UUIDHelper() {
        super();
    }

    public static UUID convertToUUID(final String uuidAsString) {
        return UUID.fromString(uuidAsString);
    }

    public static UUID getDefault(final UUID uuid, final UUID defaultUuid) {
        return ObjectHelper.getDefaultValue(uuid, defaultUuid);
    }

}

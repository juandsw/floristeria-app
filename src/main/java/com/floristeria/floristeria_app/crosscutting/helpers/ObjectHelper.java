package com.floristeria.floristeria_app.crosscutting.helpers;

public class ObjectHelper {

    private ObjectHelper() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static <O> boolean isNull(final O object) {
        return object == null;
    }

    public static <O> O getDefaultValue(final O object, final O defaultObject) {
        return isNull(object) ? defaultObject : object;
    }
}

package com.floristeria.floristeria_app.crosscutting.helpers;

public class NumericHelper {

    public static final int DEFAULT_INT = 0;
    public static final double DEFAULT_DOUBLE = 0.0;

    private NumericHelper() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static <T extends Number> boolean isNull(final T value) {
        return ObjectHelper.isNull(value);
    }


    public static Integer getDefaultValue(final Integer value) {
        return isNull(value) ? DEFAULT_INT : value;
    }

    public static Double getDefaultValue(final Double value) {
        return isNull(value) ? DEFAULT_DOUBLE : value;
    }




}

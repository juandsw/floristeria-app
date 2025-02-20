package com.floristeria.floristeria_app.crosscutting.helpers;

import java.util.regex.Pattern;

public class TextHelper {

    public static final String EMPTY= "";
    private static final Pattern Only_Letters_Pattern = Pattern.compile("^[a-zA-Z]+$");

    private TextHelper() {}

    public static boolean isNull(final String string){
        return ObjectHelper.isNull(string);
    }

    public static String getDefault(final String string, final String defaultValue) {
        return ObjectHelper.getDefaultValue(string, defaultValue);
    }

    public static boolean isEmpty(final String string){
        return EMPTY.equals(string);
    }

    public static String applyTrim(final String string){
        return string.trim();
    }

}

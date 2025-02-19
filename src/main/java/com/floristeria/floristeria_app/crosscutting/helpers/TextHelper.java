package com.floristeria.floristeria_app.crosscutting.helpers;

import java.util.regex.Pattern;

public class TextHelper {

    public static final String Empty= "";
    public static final String Underline= "_";
    private static final Pattern Only_Letters_Pattern = Pattern.compile("^[a-zA-Z]+$");

    private TextHelper() {}

    public static boolean isNull(final String string){
        return string == null;
    }

    public static boolean isEmptyorNull(final String string){
        return Empty.equals(string) || isNull(string);
    }

    public static String getDefault(final String string, final String defaultValue) {
        return isNull(string) ? defaultValue : string;
    }

    public static String getDefault(final String string){
        return getDefault(string, Empty);
    }

    public static boolean isEmpty(final String string){
        return Empty.equals(getDefault(string));
    }



}

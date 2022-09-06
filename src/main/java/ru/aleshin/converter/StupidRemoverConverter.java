package ru.aleshin.converter;

public class StupidRemoverConverter extends Converter {

    public static final String STUPID_WORD = "stupid";
    public static final String STUPID_MASK = "s*****";

    @Override
    public String convert(String message) {
        return convertNext(message.replace(STUPID_WORD, STUPID_MASK));
    }
}

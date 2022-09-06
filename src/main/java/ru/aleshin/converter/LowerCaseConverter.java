package ru.aleshin.converter;

public class LowerCaseConverter extends Converter {

    @Override
    public String convert(String message) {
        return convertNext(message.toLowerCase());
    }
}

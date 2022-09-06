package ru.aleshin.converter;

public class UpperCaseConverter extends Converter {

    @Override
    public String convert(String message) {
        return convertNext(message.toUpperCase());
    }
}

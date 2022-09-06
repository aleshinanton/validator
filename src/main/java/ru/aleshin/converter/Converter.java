package ru.aleshin.converter;

public abstract class Converter {

    private Converter nextConverter;

    public abstract String convert(String message);

    public static Converter link(Converter first, Converter... chain) {
        Converter head = first;
        for (Converter nextInChain : chain) {
            head.nextConverter = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    protected String convertNext(String message) {
        if (nextConverter == null) {
            return message;
        }
        return nextConverter.convert(message);
    }
}

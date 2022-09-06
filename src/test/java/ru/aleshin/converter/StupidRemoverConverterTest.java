package ru.aleshin.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StupidRemoverConverterTest {

    private final Converter converter = new StupidRemoverConverter();

    @Test
    void convert() {
        Assertions.assertEquals("this is s*****",converter.convert("this is stupid"));
    }
}
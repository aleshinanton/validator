package ru.aleshin.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseConverterTest {

    private final Converter converter = new LowerCaseConverter();

    @Test
    void convert() {
        Assertions.assertEquals("lowercase",converter.convert("LowerCase"));
    }
}
package ru.aleshin.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseConverterTest {

    private final Converter converter = new UpperCaseConverter();

    @Test
    void convert() {
        Assertions.assertEquals("UPPERCASE",converter.convert("uppercase"));
    }
}
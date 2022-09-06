package ru.aleshin.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuplicateRemoverConverterTest {

    private final Converter converter = new DuplicateRemoverConverter();

    @Test
    void convert() {
        Assertions.assertEquals("This is", converter.convert("This is is"));
    }
}
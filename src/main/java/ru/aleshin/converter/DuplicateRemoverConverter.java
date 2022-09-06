package ru.aleshin.converter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateRemoverConverter extends Converter {

    public static final String WORD_DELIMITER = " ";

    @Override
    public String convert(String message) {
        return convertNext(Arrays.stream(message.split(WORD_DELIMITER))
                .distinct()
                .collect(Collectors.joining(WORD_DELIMITER)));
    }
}

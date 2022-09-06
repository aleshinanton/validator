package ru.aleshin;

import ru.aleshin.converter.*;
import ru.aleshin.writer.FileWriter;
import ru.aleshin.writer.Writer;

import java.io.IOException;

public class Validator {

    private static Converter converterChain;
    private static Writer writer;

    public static void init() {
        converterChain = Converter.link(new DuplicateRemoverConverter(), new LowerCaseConverter(), new StupidRemoverConverter(), new UpperCaseConverter());
        writer = new FileWriter();
    }

    public static void main(String[] args) throws IOException {
        init();
        writer.write(converterChain.convert("This is is really stupid"));
    }
}

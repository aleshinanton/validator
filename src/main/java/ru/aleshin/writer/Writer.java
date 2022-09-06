package ru.aleshin.writer;

import java.io.Closeable;
import java.io.IOException;

public interface Writer extends Closeable {

    void write(String message) throws IOException;
}

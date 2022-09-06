package ru.aleshin.writer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class FileWriter implements Writer {

    private boolean closed;
    private static final String FILENAME = "myfile.dat";

    @Override
    public void close() throws IOException {
        if (closed)
            return;
        closed = true;
    }

    @Override
    public void write(String message) throws IOException {
        ensureOpen();
        Files.write(Paths.get(FILENAME), Collections.singletonList(message), StandardCharsets.UTF_8);
    }

    private void ensureOpen() throws IOException {
        if (closed)
            throw new IOException("Writer closed");
    }
}

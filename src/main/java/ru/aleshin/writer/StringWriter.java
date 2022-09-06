package ru.aleshin.writer;

import java.io.IOException;

public class StringWriter implements Writer {

    private boolean closed;

    @Override
    public void close() throws IOException {
        if (closed)
            return;
        closed = true;
    }

    @Override
    public void write(String message) throws IOException {
        ensureOpen();
        System.out.println(message);
    }

    private void ensureOpen() throws IOException {
        if (closed)
            throw new IOException("Writer closed");
    }
}

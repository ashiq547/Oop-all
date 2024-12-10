package org.example.publiclibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(FileOutputStream fos) throws IOException {
        super();
    }

    protected AppendableObjectOutputStream() throws IOException, SecurityException {
    }

    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
}

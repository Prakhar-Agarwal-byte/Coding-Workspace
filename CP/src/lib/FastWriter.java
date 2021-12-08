package lib;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FastWriter {
    BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
    public void writeln(Object i) throws IOException {
        log.write(i + "\n");
    }
    public void write(Object i) throws IOException {
        log.write((String) i);
    }
    public void flush() throws IOException {
        log.flush();
    }
}

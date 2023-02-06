import org.junit.jupiter.api.Assertions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    @org.junit.jupiter.api.Test

    void fib_naieve() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fib.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String [] ans = line.split(":");

        }

    }
}
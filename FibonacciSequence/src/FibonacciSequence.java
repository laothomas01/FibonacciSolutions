import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FibonacciSequence {
    static int i = 0;
    static int sum = 0;

    public static void main(String args[]) throws IOException {
        /**
         * 1) write function to provide algorithm and outputs we will be testing
         * 2) pass a loop of inputs into the function
         * 3) write the input and output to a file
         * 4) parse the file into an array of input and output
         * 5) run inputs through new function similar to fibonacci that is more optimized
         * 6) compare all outputs of new fibonnaci with previously foundly outputs
         */
        FileWriter fw = new FileWriter("fib.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i <= 10; i++) {
            bw.write(i + ":" + fib_naive(i) + "\n");
        }
        bw.close();

        //make connection to file
        Path file = Paths.get("fib.txt");

        //read all lines of the file
        long count = Files.lines(file).count();

        //output array
        int[] f_y = new int[(int) count];
        //input array
        int[] f_x = new int[(int) count];


        BufferedReader br = new BufferedReader(new FileReader("fib.txt"));
        String line;

        //index of input array
        int x = 0;
        ///index of output array
        int y = 0;
        while ((line = br.readLine()) != null) {
            String[] res = line.split(":");
            f_x[x] = Integer.parseInt(res[0]);
            f_y[y] = Integer.parseInt(res[1]);
            x++;
            y++;
        }
        br.close();

        for (int i = 0; i < f_x.length; i++) {
            if (fib_naive(f_x[i]) == f_y[i]) {
                System.out.println(f_x[i] + ":" + f_y[i] + " PASSED");
            } else {
                System.out.println(f_x[i] + ":" + f_y[i] + " FAILED");
            }
        }



//


    }

    public static int fib_naive(int n) {


        if (n <= 1) {
            return n;
        }


        return fib_naive(n - 1) + fib_naive(n - 2);
    }


}

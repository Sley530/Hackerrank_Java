import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @author Sley
 *
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (N >= 1 && N <= 100)
        {
            if (N % 2 == 1)
            {
                System.out.println("Weird");
            }
            if (N % 2 == 0 && N >= 2 && N <= 5)
            {
                System.out.println("Not Weird");
            }
            if (N % 2 == 0 && N >= 6 && N <= 20)
            {
                System.out.println("Weird");
            }
            if (N % 2 == 0 && N > 20)
            {
                System.out.println("Not Weird");
            }
        }

    }

}

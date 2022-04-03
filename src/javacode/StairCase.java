package javacode;

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

public class StairCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

         int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }

    public static void staircase(int n) {
        // Write your code here

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {

                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }

            System.out.print("\n");
        }

    }
}

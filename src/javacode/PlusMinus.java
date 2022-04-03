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

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        double totalCount = arr.size();
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for (Integer integer : arr) {

            if (integer > 0) {
                positiveCount++;
            }

            if (integer < 0) {
                negativeCount++;
            }

            if (integer == 0) {
                zeroCount++;
            }

        }

        System.out.println(String.format("%.6f", positiveCount / totalCount));
        System.out.println(String.format("%.6f", negativeCount / totalCount));
        System.out.println(String.format("%.6f", zeroCount / totalCount));

    }
}
 

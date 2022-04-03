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


public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long min = 0,max = 0,sum = 0;
        min = arr.get(0);
        max = min;
        sum = min;

        for(int i = 1;i<arr.size();i++){
            sum+=arr.get(i);
            if(arr.get(i) < min){
                min = arr.get(i);
            }
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        System.out.println((sum - max) +" "+(sum - min));

    }

}

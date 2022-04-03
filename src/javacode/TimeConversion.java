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


public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static String timeConversion(String time) {
        // Write your code here
        String tArr[] = time.split(":");
        String AmPm = tArr[2].substring(2,4);
        int hh,mm,ss;
        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0,2));

        System.out.print(hh+" "+mm+" "+ss+" "+AmPm);

        String checkPM = "PM",checkAM ="AM";
        int h = hh;
        if(AmPm.equals(checkAM) && hh==12)
            h=0;
        else if(AmPm.equals(checkPM)&& hh<12)
            h+=12;

        String result = String.format("%02d:%02d:%02d",h,mm,ss);
        System.out.printf("%02d:%02d:%02d",h,mm,ss);
        return result;
    }
}

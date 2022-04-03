package javacode;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf("\n\n\n\n"+result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int matrixSize = arr.size();
        int ltrDiagonalSum = 0;
        int rtlDiagonalSum = 0;
        for(int i = 0;i<matrixSize;i++){

            for(int j =0 ;j<matrixSize;j++){
                if(i == j){
                    ltrDiagonalSum += arr.get(i).get(j);
                }
                if(i+j == matrixSize-1){
                    rtlDiagonalSum += arr.get(i).get(j);
                }
            }
        }

        System.out.println(ltrDiagonalSum);
        System.out.println(rtlDiagonalSum);
        return Math.abs(ltrDiagonalSum - rtlDiagonalSum);
    }
}

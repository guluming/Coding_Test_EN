package plus_minus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int count_pv = 0;
        int count_nv = 0;
        int count_ze = 0;

        for (int i = 0; i<arr.size(); i++) {
            if (arr.get(i) > 0) {
                count_pv++;
            } else if (arr.get(i) < 0) {
                count_nv++;
            } else {
                count_ze++;
            }
        }

        double result_pv = 0;
        double result_nv = 0;
        double result_ze = 0;

        result_pv = (double) count_pv/arr.size();
        result_nv = (double) count_nv/arr.size();
        result_ze = (double) count_ze/arr.size();

        System.out.printf("%.6f \n", result_pv);
        System.out.printf("%.6f \n", result_nv);
        System.out.printf("%.6f", result_ze);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        plusMinus(arr);

        bufferedReader.close();
    }
}
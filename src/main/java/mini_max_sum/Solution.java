package mini_max_sum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long answer_asc = 0L;
        Long answer_desc = 0L;
        Collections.sort(arr);
        for (int i = 0; i < 4; i++) {
            answer_asc = answer_asc + arr.get(i);
        }
        for (int i = 0; i < 4; i++) {
            answer_desc = answer_desc + arr.get(arr.size() - 1 - i);
        }
        System.out.printf("%d %d", answer_asc, answer_desc);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
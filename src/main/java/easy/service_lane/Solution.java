package easy.service_lane;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases) {
        // Write your code here
        List<Integer> answer = new ArrayList<>();

        int start = 0;
        int end = 0;

        for (int i = 0; i<cases.size(); i++) {
            List<Integer> a = new ArrayList<>();
            start = cases.get(i).get(0);
            end = cases.get(i).get(1);

            for (int j = start; j<end+1; j++) {
                a.add(width.get(j));
            }

            Collections.sort(a);
            answer.add(a.get(0));
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] widthTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> width = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthTemp[i]);
            width.add(widthItem);
        }

        List<List<Integer>> cases = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String[] casesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> casesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowTempItems[j]);
                casesRowItems.add(casesItem);
            }

            cases.add(casesRowItems);
        }

        List<Integer> result = serviceLane(n, width, cases);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
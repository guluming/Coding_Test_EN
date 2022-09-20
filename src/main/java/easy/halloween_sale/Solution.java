package easy.halloween_sale;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int total = 0;
        int answer = 0;

        while (total <= s) {
            total = total + p;

            if (p > m && p-d > m) {
                p = p - d;
            } else {
                p = m;
            }

            answer++;
            System.out.println(total);

        }
        return answer-1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int p = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        int m = Integer.parseInt(firstMultipleInput[2]);

        int s = Integer.parseInt(firstMultipleInput[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
package medium.extra_long_factorials;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger answer = Factorials(n);
        System.out.println(answer);
    }

    public static BigInteger Factorials(int n) {
        String a = String.valueOf(n);
        BigInteger bignum1 = new BigInteger(a);
        if (n == 1) {
            return bignum1;
        } else {
            return bignum1.multiply(Factorials(n-1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        extraLongFactorials(n);

        bufferedReader.close();
    }
}
package medium.the_time_in_words;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static String timeInWords(int h, int m) {
        // Write your code here
        String hs = "";
        String ms = "";
        String answer = "";

        if (m == 0) {
            hs = hour(h);
            answer = hs + " o' clock";
        } else if (m == 30) {
            hs = hour(h);
            answer = "half past " + hs;
        } else if (m/15 == 1 && m%15 == 0) {
            hs = hour(h);
            answer = "quarter past " + hs;
        } else if (m/15 == 3 && m%15 == 0) {
            h = h+1;
            if (h > 12) {
                h = 1;
            }
            hs = hour(h);
            answer = "quarter to " + hs;
        } else if (m < 30) {
            hs = hour(h);
            ms = minute(m);
            answer = ms + " past " + hs;

        } else if (m > 30) {
            h = h+1;
            if (h > 12) {
                h = 1;
            }
            m = 60 - m;
            hs = hour(h);
            ms = minute(m);
            answer = ms + " to " + hs;
        }
        return answer;

    }

    public static String hour(int h) {
        String timehour = "";
        switch (h) {
            case 1: timehour = "one";
                break;
            case 2: timehour = "two";
                break;
            case 3: timehour = "three";
                break;
            case 4: timehour = "four";
                break;
            case 5: timehour = "five";
                break;
            case 6: timehour = "six";
                break;
            case 7: timehour = "seven";
                break;
            case 8: timehour = "eight";
                break;
            case 9: timehour = "nine";
                break;
            case 10: timehour = "ten";
                break;
            case 11: timehour = "eleven";
                break;
            case 12: timehour = "twelve";
                break;
        }
        return timehour;
    }

    public static String minute(int m) {
        String timeminute = "";
        switch (m) {
            case 1: timeminute = "one minute";
                break;
            case 2: timeminute = "two minutes";
                break;
            case 3: timeminute = "three minutes";
                break;
            case 4: timeminute = "four minutes";
                break;
            case 5: timeminute = "five minutes";
                break;
            case 6: timeminute = "six minutes";
                break;
            case 7: timeminute = "seven minutes";
                break;
            case 8: timeminute = "eight minutes";
                break;
            case 9: timeminute = "nine minutes";
                break;
            case 10: timeminute = "ten minutes";
                break;
            case 11: timeminute = "eleven minutes";
                break;
            case 12: timeminute = "twelve minutes";
                break;
            case 13: timeminute = "thirteen minutes";
                break;
            case 14: timeminute = "fourteen minutes";
                break;
            case 16: timeminute = "sixteen minutes";
                break;
            case 17: timeminute = "seventeen minutes";
                break;
            case 18: timeminute = "eighteen minutes";
                break;
            case 19: timeminute = "nineteen minutes";
                break;
            case 20: timeminute = "twenty minutes";
                break;
            case 21: timeminute = "twenty one minutes";
                break;
            case 22: timeminute = "twenty two minutes";
                break;
            case 23: timeminute = "twenty three minutes";
                break;
            case 24: timeminute = "twenty four minutes";
                break;
            case 25: timeminute = "twenty five minutes";
                break;
            case 26: timeminute = "twenty six minutes";
                break;
            case 27: timeminute = "twenty seven minutes";
                break;
            case 28: timeminute = "twenty eight minutes";
                break;
            case 29: timeminute = "twenty nine minutes";
                break;
        }
        return timeminute;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
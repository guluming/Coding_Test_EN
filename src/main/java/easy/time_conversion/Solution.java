package easy.time_conversion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static String timeConversion(String s) {
        // Write your code here
        String answer = "";
        String[] time = {"","",""};
        String m_time = "";
        String hs = "";

        time = s.split(":");
        int h = Integer.parseInt(time[0]);
        m_time = time[2].substring(2, 3);

        if (m_time.equals("P") && h != 12) {
            h = h+12;
        }
        else if (m_time.equals("A") && h==12) {
            h = h-12;
        }

        if (h<10) {
            hs = "0"+h;
        } else {
            hs = ""+h;
        }

        answer = hs+":"+time[1]+":"+time[2].substring(0, 2);

        System.out.println(hs);
        System.out.println(time[1]);
        System.out.println(time[2].substring(0, 2));
        System.out.println("0"+0);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
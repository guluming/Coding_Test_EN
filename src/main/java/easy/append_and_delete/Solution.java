package easy.append_and_delete;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int sl=s.length();
        int tl=t.length();
        String answer = "";
        int ll= Math.min(sl, tl);
        int m;
        for(m=0;m<ll;m++)
        {
            if(s.charAt(m)!=t.charAt(m))break;

        }

        int sleft=sl-m;
        int tleft=tl-m;

        int flag=0;

        if(sleft+tleft>k)flag=1;
        else
        {
            int sub=k-(sleft+tleft);
            if((sub%2!=0) && !(sub>2*m))flag=1;
        }

        if(flag==0){
            return answer = "Yes";
        } else {
            return answer = "No";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
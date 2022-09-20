package easy.grading_students;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> answer = new ArrayList<>();
        int checkpointten=0;
        int checkpointone=0;
        for (int i =0; i<grades.size(); i++) {
            checkpointten = grades.get(i)/10;
            checkpointone = grades.get(i)%10;

            if (checkpointone <= 5 && checkpointten > 3) {
                if (5-checkpointone < 3) {
                    answer.add(grades.get(i)-checkpointone+5);
                } else {
                    answer.add(grades.get(i));
                }
            } else if (checkpointone > 5 && checkpointten > 3) {
                if (10-checkpointone < 3) {
                    answer.add(grades.get(i)-checkpointone+10);
                } else {
                    answer.add(grades.get(i));
                }
            } else if (10-checkpointone < 3 && checkpointten == 3) {
                answer.add(grades.get(i)-checkpointone+10);
            } else {
                answer.add(grades.get(i));
            }
        }
        System.out.println(0%10);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = gradingStudents(grades);

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
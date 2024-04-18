package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution(); //반례: aaabbb //기대값 aaabbb,
        String result = solution.solution("aaaaaa","bbb",3); // cnffurrkqt bbbbbb
        System.out.println("result:"+result);
    }
}

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
            String replaceStr = my_string.substring(s,s+overwrite_string.length());
            answer = my_string.replace(replaceStr,overwrite_string);
        return answer;
    }
    public String solution2(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}
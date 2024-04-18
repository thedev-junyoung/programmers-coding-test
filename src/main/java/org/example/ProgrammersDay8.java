package org.example;

import java.util.Arrays;

public class ProgrammersDay8 {
    public static void main(String[] args){
        Solution8 solution=new Solution8();
        /*boolean result=solution.solution1(false,true,true,true);
        System.out.println("result:"+result);*/

        /*String my_string="cvsgiorszzzmrpaqpe";
        int[] index={16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String result=solution.solution3(my_string,index);
        System.out.println("result:"+result);*/
        /*int result = solution.solution4("123");
        System.out.println("result:"+result);*/

        String my_string="rermgorpsam";
        int[][] queries={{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String result = solution.solution5(my_string,queries);
        System.out.println("result:"+result.toString());

    }


}
class Solution8{ //
    public boolean solution1(boolean x1, boolean x2, boolean x3, boolean x4) {
        // V: 하나라도 참이면 참    A: 하나라도 거짓이면 거짓
        boolean answer = true;
        answer = (x1 || x2 == true) && (x3 || x4 == true);
        System.out.println("answer:"+answer);
        return answer;
    }
    public int solution2(int a, int b, int c, int d) {
        int answer = 0;
        int[] counts = new int[7]; // 1부터 6까지의 주사위 숫자에 대한 개수를 저장할 배열
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;

        // 개수를 기준으로 조건을 판단
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 4) {
                return 1111 * i; // 네 주사위가 모두 같은 경우
            }
        }

        // 세 주사위가 같은 경우와 두 개씩 같은 경우를 찾기
        int triple = -1, pair1 = -1, pair2 = -1;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) {
                triple = i;
            } else if (counts[i] == 2) {
                if (pair1 == -1) {
                    pair1 = i;
                } else {
                    pair2 = i;
                }
            }
        }

        if (triple != -1) { // 세 주사위가 같은 경우
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 1) {
                    return (10 * triple + i) * (10 * triple + i);
                }
            }
        } else if (pair1 != -1 && pair2 != -1) { // 두 개씩 같은 경우
            return (pair1 + pair2) * Math.abs(pair1 - pair2);
        } else if (pair1 != -1) { // 하나의 쌍만 있는 경우
            int mult = 1;
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 1) {
                    mult *= i;
                }
            }
            return mult;
        }

        // 모든 숫자가 다른 경우
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 1) {
                return i; // 가장 작은 숫자 반환
            }
        }
        return answer;
    }
    public String solution3(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder sb= new StringBuilder();
        for (int i =0; i<index_list.length;i++){
            sb.append(my_string.charAt(index_list[i]));
        }
        answer=sb.toString();
        return answer;
    }
    public int solution4(String number) {
        int answer = 0;
        char[] chars = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            answer += chars[i] - '0';
        }
        return answer%9;
    }
    public String solution5(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            reverseSubstring(sb, start, end);
        }
        return sb.toString();
    }
    private void reverseSubstring(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
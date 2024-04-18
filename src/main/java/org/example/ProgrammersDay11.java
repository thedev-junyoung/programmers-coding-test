package org.example;

import java.util.HashSet;

public class ProgrammersDay11 {
    public static void main(String[] args) {
        Solution11 solution=new Solution11();

        //solution.solution1("Programmers");
        /*int[] indices={1, 16, 6, 15, 0, 10, 11, 3};
        solution.solution3("apporoograpemmemprs",indices);*/
        int[] arr={0, 0, 0, 1};
        int idx=1;
        System.out.println(solution.solution5(arr,idx));
    }
}

class Solution11 {
    public int[] solution1(String my_string) {
        int[] frequencies = new int[52];
        for (char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                frequencies[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                frequencies[c - 'a' + 26]++;
            }
        }
        return frequencies;
    }
    public int[] solution2(int n, int k) {
        int[] answer = new int[n/k];
        for (int i = 1; i <= answer.length; i++) {
            answer[i-1]=k*i;
        }
        return answer;
    }
    public String solution3(String my_string, int[] indices) {
        StringBuilder sb=new StringBuilder(my_string);
        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], '0');
        }
        return sb.toString().replace("0","");
    }
    public int[] solution4(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=start-i;
        }
        return answer;
    }
    public int solution5(int[] arr, int idx) {
        /* idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요 */
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i]:"+arr[i]);
            if(idx<i && arr[i]==1){
                return i;
            }
        }
        return answer;
    }
}
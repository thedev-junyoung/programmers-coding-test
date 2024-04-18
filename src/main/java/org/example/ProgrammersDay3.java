package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProgrammersDay3 {
    public static void main(String[] args){
        Solution3 solution3=new Solution3();
        //solution3.solution("aaaaa","bbbbb");
        String[] arr= {"a","b","c"};
        String result =solution3.solution(arr);
        //String result= solution3.solution("love",3);
        //int result= solution3.solution2(91,2);
        System.out.println(result);
    }
}


class Solution3 {
    /** [문자열 섞기]
     * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
     * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
     * 제한사항
     * 1 ≤ str1의 길이 = str2의 길이 ≤ 10
     * str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
     * */
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        System.out.println(sb);
        answer = String.valueOf(sb);
        return answer;
    }
    /** [문자 리스트를 문자열로 변환하기]
     * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
     */
    public String solution(String[] arr) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        answer = String.valueOf(sb);
        String result = Arrays.stream(arr).collect(Collectors.joining());

        return result;
    }
    public String solution(String my_string, int k) {
        //my_string.repeat(k);
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(my_string);
        }
        answer=sb.toString();
        return answer;
    }

    public int solution(int a, int b) {
        int answer = 0;
        int case1= Integer.valueOf(String.valueOf(a)+String.valueOf(b));
        int case2= Integer.valueOf(String.valueOf(b)+String.valueOf(a));
        if(case1<case2){
            return case2;
        }else {
            return case1;
        }
    }

    public int solution2(int a, int b) {
        int answer = 0;
        int result1=Integer.parseInt(""+a+b);
        int result2=2*a*b;
        System.out.println("result1:"+result1);
        System.out.println("result2:"+result2);
        if(result1<result2){
            return result2;
        }else {
            return  result1;
        }
    }
}
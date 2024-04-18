package org.example;

import java.util.ArrayList;

public class ProgrammersDay10 {

    public static void main(String[] args){
        Solution10 solution =new Solution10();
        /*String my_string="banana";
        String is_prefix="ban";
        int result=solution.solution2(my_string,is_prefix);
        System.out.println(result);*/
   /*     int s= 6,e=	12;
        String my_string="Progra21Sremm3";
        String result=solution.solution3(my_string,s,e);
        System.out.println("result:"+result);*/
       /* int m=4,c=2;
        String my_string="ihrhbakrfpndopljhygc";
        solution.solution4(my_string,m,c);*/

        int q=2,r=0;
        String code="hjeblalao";
        String result=solution.solution5(q,r,code);
        System.out.println("result:"+result);
    }

}
class Solution10 {
    public String solution(String my_string, int n) {
        String answer = "";
        int length = my_string.length();
        boolean check = length <= 1000 && n <= length;
        if(check){
            answer = my_string.substring(0,n);
        }
        return answer;
    }
    public int solution2(String my_string, String is_prefix) {
        int answer = 0;
        for (int i = 0; i <= my_string.length(); i++) {
            if (is_prefix.equals(my_string.substring(0,i))) answer=1;
        }
        return answer;
    // String의 startsWith 메서드를 사용하여 접두사가 맞는지 직접 확인
    // return my_string.startsWith(is_prefix) ? 1 : 0;
    }
    public String solution3(String my_string, int s, int e) {
        String answer = "";
        /*StringBuilder sb=new StringBuilder(my_string.substring(s,e+1));*/
        answer=my_string.replace(my_string.substring(s,e+1),new StringBuilder(my_string.substring(s,e+1)).reverse());
        return answer;
        /*최적화
            StringBuilder sb = new StringBuilder(my_string);
            // 부분 문자열을 직접 뒤집기
            return sb.replace(s, e + 1, new StringBuilder(my_string.substring(s, e + 1)).reverse().toString()).toString();
        * */
    }
    public String solution4(String my_string, int m, int c) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        int columnIndex = c - 1;
        for(int i=columnIndex;i<=my_string.length();i+=m){
            result.append(my_string.charAt(i));
        }
        answer=result.toString();
    return answer;
    }
    public String solution5(int q, int r, String code) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for (int i = code.length()%q;i<code.length();i+=q){
            sb.append(code.charAt(i));
        }
        answer=sb.toString();
        return answer;
    }
}

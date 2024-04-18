package org.example;

public class ProgrammersDay4 {
    public static void main(String[] args){
        Solution4 solution4=new Solution4();
        int result =solution4.solution(10);
        System.out.println(result);
    }
}

class Solution4 {
    public int solution(int num, int n) {
        int answer = 0;
        if(num%n==0){
            return 1;
        }else {
            return 0;
        }
    }
    public int solution(int number, int n, int m) {
        int answer = 0;
        answer=(number%n == 0) && (number%m == 0) ? 1 : answer;
        return answer;
    }
    public int solution(int n) {
        int answer = 0;
        if(n%2==0){ //짝수
            for (int i = 2; i <= n; i += 2) {
                answer += i*i;
            }
        } else { // 홀수
            for (int i = 1; i <= n; i += 2) {
                answer+=i;
            }
        }
        return answer;
    }
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        return answer;
    }
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ? a + b : a-b;
        return answer;
    }
}
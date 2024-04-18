package org.example;

public class ProgrammersDay5 {
    public static void main(String[] args){
        Solution5 solution4=new Solution5();
        int[] a={3, 4, 5, 2, 1};
        int result = solution4.solution(a);
        System.out.println("result:"+result);
    }
}
class Solution5 {
    /*
    * mode 는 0, 1
'문자열 ret 만들기'
주어진 'code'의 문자열 중 앞에서 읽으면서 문자가 '1'이면 mode 변경
mode == 0 일 때,
code[idx] 에서 idx가 짝수일때 'ret' 의 맨뒤에 문자 code[idx] 추가
1이면 0으로 변경
mode == 1 일 때,
code[idx] 에서 idx가 홀수일때 'ret' 의 맨뒤에 문자 code[idx] 추가
0이면 1으로 변경
시작시 mode==0, ret이 빈 문자열이면 EMPTY 리턴
    * */
    public String solution(String code) {
        /*String answer = "";
        int mode = 0;

        for(int i = 0;i<code.length();i++){
            if(mode==0){
                if(code.charAt(i)!='1'){
                    if(i%2==0){//짝수일 때
                        answer+=code.charAt(i);
                    }
                }else {
                    mode = 1;
                }
            }else{
                if(code.charAt(i)!='1'){
                    if(i%2==1){//짝수일 때
                        answer+=code.charAt(i);
                    }
                }else {
                    mode =0;
                }
            }
        }
        if(answer==""){
            answer = "EMPTY";
        }
        return answer;*/
        StringBuilder answerBuilder = new StringBuilder(); // StringBuilder 사용
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);
            if (currentChar == '1') {
                mode = 1 - mode; // mode 토글
                continue; // 현재 반복을 건너뛰고 다음으로 진행
            }

            // mode 0에서 짝수 인덱스, mode 1에서 홀수 인덱스에 해당하는 문자 추가
            if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                answerBuilder.append(currentChar);
            }
        }

        String answer = answerBuilder.toString();
        if (answer.isEmpty()) {
            answer = "EMPTY";
        }
        return answer;
    }

    public int solution(int a, int d, boolean[] included) {
        // n개의 항의 합을 Sn
        // Sn = n/2*[(2*첫째 항)+(n번째합-1)*공차)]
        // a: 첫째항
        // d: 공차
        // n: included.length;
        // 일반항
        // 첫째항+(n-1)공차
        //
        /*int answer = 0;
        //int n = included.length;
        //int test = n/2*(((2*a)+(n-1)*d));

        for(int i =0;i<included.length;i++){
            if(included[i]==true){
                answer += a + (i)*d;
            }
            System.out.println("answer:"+answer);
        }
        return answer;*/
        //return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
return 0;
    }


    public int solution(int a, int b, int c) {
        int sum = a + b + c; // a, b, c 의 합
        int squareSum = a*a + b*b + c*c; // a^2, b^2, c^2 의 합
        int cubeSum = a*a*a + b*b*b + c*c*c; // a^3, b^3, c^3 의 합
        if (a == b && b == c) {
            // 세 숫자가 모두 같은 경우
            return sum * squareSum * cubeSum;
        } else if (a == b || a == c || b == c) {
            // 세 숫자 중 어느 두 숫자는 같고 나머지 하나가 다른 경우
            return sum * squareSum;
        } else {
            // 세 숫자가 모두 다른 경우
            return sum;
        }
    }
    public int solution(int[] num_list) {
/*        int answer = 0;
        int sum=0;
        int multi=1;
        for (int num : num_list) {
            sum +=num;
            multi *= num;
            System.out.println("sum:"+sum);
            System.out.println("multi:"+multi);
        }
        if((sum*sum)>multi){
            answer = 1;
        }else {
            answer = 0;
        }
        System.out.println("sum:"+sum);
        System.out.println("multi:"+multi);
        return answer;*/



        /*StringBuilder odd=new StringBuilder();
        StringBuilder even=new StringBuilder();

        int answer = 0;
        for (int num : num_list) {
            if((num%2)==0){ // 짝수
                even.append(num);
            }else { //홀수
                odd.append(num);
            }
        }
        System.out.println("even:"+even);
        System.out.println("odd:"+odd);
        answer = Integer.valueOf(odd.toString()) + Integer.valueOf(even.toString());
        return answer;*/
        int answer = 0;
        String odd="";
        String even="";
        for (int num : num_list) {
            if((num%2)==0){ // 짝수
                even+=num;
            }else { //홀수
                odd+=num;
            }
        }
        answer = Integer.valueOf(odd) + Integer.valueOf(even);
        return answer;
    }
}
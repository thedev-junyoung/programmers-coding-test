package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProgrammersDay18 {
    public static void main(String[] args) {
        Solution18 solution=new Solution18();
        /*String myString="oxooxoxxox";
        int[] result=solution.solution1(myString);
        System.out.println(Arrays.toString(result));*/

        /*String myString="dxccxbbbxaaaa";
        String[] result=solution.solution2(myString);
        System.out.println(Arrays.toString(result));*/

      /*  String myString="masterpiece";
        String result=solution.solution5(myString);
        System.out.println(result);*/

        String binomial="40000 * 40000";
        int result=solution.solution3(binomial);
        System.out.println(result);

        /*String myString="ABBAA";
        String pat="AABB";
        int result=solution.solution4(myString,pat);
        System.out.println(result);*/

    }
}
class Solution18 {
    public int[] solution1(String myString) {
        int count=0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
            if(myString.charAt(i)=='x'){
                System.out.println("i:"+i+"   count:"+count);
                arrayList.add(count);
                count=0;
            }else {
                count++;
            }
        }
        arrayList.add(count);
        int[] answer=new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=arrayList.get(i);
        }
        return answer;
/*최적화
*  // List<Integer>를 사용하여 동적 배열 관리
        List<Integer> counts = new ArrayList<>();
        int count = 0;

        // 문자열 순회하며 'x'를 기준으로 문자 수 계산
        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                counts.add(count);
                count = 0;  // 카운트 초기화
            } else {
                count++;
            }
        }
        counts.add(count);  // 마지막 카운트 추가

        // List<Integer>를 int[] 배열로 변환
        return counts.stream().mapToInt(i -> i).toArray();*/
    }


    public String[] solution2(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        return answer;
    }

    public int solution3(String binomial) {
        int answer = 0;
        String[] temp= binomial.split(" ");
        if(temp[1].equals("+")){
            answer = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
        } else if (temp[1].equals("-")) {
            answer = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
        } else if(temp[1].equals("*")) {
            answer = Integer.parseInt(temp[0]) * Integer.parseInt(temp[2]);
        }

        switch (temp[1]){
            case "+":
                answer = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
            case "-":
                answer = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
            case "*":
                answer = Integer.parseInt(temp[0]) * Integer.parseInt(temp[2]);
        }

        return answer;
    }
    public int solution4(String myString, String pat) {
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i)=='A'){
                sb.append('B');
            }else {
                sb.append('A');
            }
        }
        if(sb.toString().contains(pat)){
            return 1;
        }else {
            return 2;
        }
    }
    public String solution5(String rny_string) {
        String answer = rny_string.replace("m", "rn");
        for (int i = 0; i < rny_string.length(); i++) {
            if(rny_string.charAt(i)=='m'){

            }
        }
        return answer;
    }
}

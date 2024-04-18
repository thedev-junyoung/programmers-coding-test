package org.example;

import java.util.Arrays;

public class ProgrammersDay6 {
    public static void main(String[] args){
        Solution6 solution=new Solution6();
        //int[] num_list={2,1,6};
        //int[] num_list={5, 2, 1, 7, 5};
        //int[] result =solution.solution(num_list);
        //System.out.println(Arrays.toString(result));

        /*String control="wsdawsdassw";
        int n=0;
        int result=solution.solution2(n,control);
        System.out.println(result);*/

        /*int[] numlog={0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String result=solution.solution3(numlog);
        System.out.println(result);*/

        int[] arr={0, 1, 2, 4, 3};
        int[][] queries={{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[] result = solution.solution5(arr,queries);
        System.out.println(Arrays.toString(result));

    }
}
class Solution6 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        if(num_list[num_list.length-1]>(num_list[num_list.length-2])){
            int element=(num_list[num_list.length-1])-(num_list[num_list.length-2]);
            return append2Array(num_list,element);
        }else {
            int element=(num_list[num_list.length-1])*2;
            return append2Array(num_list,element);
        }
    }
    public int[] append2Array(int[] elements, int element) {
        int[] newArray = Arrays.copyOf(elements, elements.length + 1);
        newArray[elements.length] = element;
        return newArray;
    }
    public int[] solution1_1(int[] num_list) {
        int length = num_list.length;
        int lastElement = num_list[length - 1];
        int secondLastElement = num_list[length - 2];

        // if-else 구조를 하나의 삼항 연산자로 간소화
        int element = lastElement > secondLastElement ? lastElement - secondLastElement : lastElement * 2;

        // append2Array 메소드를 직접 구현하여 코드 중복을 줄임
        int[] newArray = Arrays.copyOf(num_list, length + 1);
        newArray[length] = element;
        return newArray;
    }
    public int solution2(int n, String control) {
        int answer = 0;
        //control == 'w','a','s','d' 로이루어진 문자열
        for(int i=0; i<control.length();i++){
            System.out.println("control.charAt(i):"+control.charAt(i));
            switch (control.charAt(i)){
                case 'w':
                    n=n+1;
                    break;
                case 'a':
                    n=n-10;
                    break;
                case 's':
                    n=n-1;
                    break;
                case 'd':
                    n=n+10;
                    break;
            }
        }
        return n;
    }

    public String solution3(int[] numLog) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for(int i = 0; i<numLog.length-1; i++){
            int n = numLog[i+1]-numLog[i];
             switch (n){
                 case 1:
                     sb.append('w');
                     break;
                 case -1:
                     sb.append('s');
                     break;
                 case 10:
                     sb.append('d');
                     break;
                 case -10:
                     sb.append('a');
                     break;
             }
        }
        return String.valueOf(sb);
    }
    public int[] solution4(int[] arr, int[][] queries) {
        //arr: 조작하는 것
        //queries: 이거에 따라 변경해라.
        int[] answer = {};
        answer = arr;
        for(int i=0;i<queries.length;i++){
            /*System.out.println(Arrays.toString(queries[i]));
            int temp=answer[queries[i][0]];
            answer[queries[i][0]]=queries[i][1];
            System.out.println("temp:"+temp);
            //queries[i][1]=temp;
            answer[queries[i][1]]=temp;
            System.out.println("queries[i][1]:"+queries[i][1]);
            temp=-1;
            System.out.println(Arrays.toString(answer));*/
            int index1 = queries[i][0];
            int index2 = queries[i][1];
            int temp = queries[i][0];
            answer[index1] = answer[index2];
            answer[index2] = temp;

        }

        return answer;
    }

    public int[] solution5(int[] arr, int[][] queries) {
        //int queries[][]= [{s, e, k},{s, e, k},{s, e, k}....];
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            //s,e 범위
            //k 비교값
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int minVal = Integer.MAX_VALUE;
            boolean found=false;
            for(int j = s; j <= e; j++){
                if(arr[j]>k && arr[j]<minVal){
                    minVal = arr[j];
                    found = true;
                }
            }
            if(found){
            answer[i]=minVal;
            }else {
                answer[i]=-1;
            }
        }
        return answer;
    }
}

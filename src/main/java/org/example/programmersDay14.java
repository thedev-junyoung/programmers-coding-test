package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class programmersDay14 {
    public static void main(String[] args) {
        Solution14 solution=new Solution14();
        /*int[] num_list={4, 2, 6, 1, 7, 6};
        int result=solution.solution1(num_list);
        System.out.println(result);*/
        /*String[] names={"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(solution.solution2(names)));*/

/*        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        String[] result=solution.solution3(todo_list,finished);
        System.out.println(Arrays.toString(result));*/
        int[] arr={0, 1, 2, 3, 4};
        int[][] queries={{0, 1},{1, 2},{2, 3}};
        int[] result=solution.solution5(arr,queries);
        System.out.println(Arrays.toString(result));
    }
}
class Solution14 {
    public int solution1(int[] num_list) {
        int odd=0;
        int even=0;
        for (int i = 0; i < num_list.length; i++) {
            if(i%2==0){ // 짝수 원소
                even+=num_list[i];
            }else { // 홀수 원소
                odd+=num_list[i];
            }
        }
        return Math.max(odd, even);
    }
    public String[] solution2(String[] names) {
        String[] answer = new String[(int)Math.ceil((double) names.length/5)];
        //System.out.println((int)Math.ceil((double) names.length/5));
        int j=0;
        for (int i = 0; i < names.length; i+=5) {
            answer[j]=names[i];
            j++;
        }
        return answer;
    }
    public String[] solution3(String[] todo_list, boolean[] finished) {
       /* int count = 0;
        for (boolean value : finished) {
            if (value) {
                count++;
            }
        }
        String[] answer = new String[count];
        int j=0;
        for (int i = 0; i < todo_list.length; i++) {
            if(finished[i]!=true){
                answer[j]=todo_list[i];
                j++;
            }
        }*/
        //String[] answer={};
        return IntStream.range(0, todo_list.length)  // 인덱스 기반 스트림 생성
                .filter(i -> finished[i])                                    // 완료되지 않은 인덱스 필터링
                .mapToObj(i -> todo_list[i])                               // 필터링된 인덱스로 할 일 매핑
                .toArray(String[]::new);
        //return answer;
    }

    public int[] solution5(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            for(int j=s;j<=e;j++){
                arr[j]++;
            }
        }
        return arr;
    }
}
package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgrammersDay12 {
    public static void main(String[] args) {
        /*int n=1;
        int[] slice={1, 5, 2};
        System.out.println(Arrays.toString(solution.solution(n,slice,num_list)));
        int[] num_list={1, 2, 3, 4, 5, 6, 7, 8, 9};*/
        Solution12 solution= new Solution12();
/*
        int[] arr ={1, 2, 3, 4, 5};
        int[][] intervals={{1, 3}, {0, 4}};
        solution.solution(arr,intervals);*/
        int[] arr={1, 2, 1, 2, 1, 10, 2, 1};
        /*
        입력값 〉 [2, 2, 3]
        기댓값 〉 [2, 2]*/
        int[] result=solution.solution4(arr);
        System.out.println(Arrays.toString(result));

    }
}
class Solution12 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a=slicer[0],b=slicer[1],c=slicer[2];
        switch (n){
            case 1:
                //num_list의 0번 인덱스부터 b번 인덱스까지
                int result1[] = new int[b+1];
                int j=0;
                for (int i = 0; i <=b ; i++) {
                    result1[j]=num_list[i];
                    j++;
                }
                return result1;
            case 2:
                //num_list의 a번 인덱스부터 마지막 인덱스까지
                int[] result2=new int[num_list.length-a];
                int k=0;
                for (int i = a; i <num_list.length ; i++) {
                    result2[k]=num_list[i];
                    k++;
                }
                return result2;
            case 3:
                //num_list의 a번 인덱스부터 b번 인덱스까지
                int[] result3=new int[b-a+1];
                int l=0;
                for (int i = a; i <=b ; i++) {
                    result3[l]=num_list[i];
                    l++;
                }
                return result3;
            case 4:
                //num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
                int[] result4=new int[(int) Math.ceil((double)(b-a+1)/c)];
                int m=0,o=0;
                for (int i = a; i <=b ; i++) {
                    if(num_list[i]%c==0){
                        result4[m]=num_list[i];
                        m++;
                    }
                }
                for (int i = a; i <= b; i += c) {
                    System.out.println(num_list[i]);
                }
                return result4;
        }
        return answer;
    }

    public int solution2(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]<0) return i;
        }
        return answer;
    }
    public int[] solution3(int[] arr, int[][] intervals) {
        int[] answer = new int[(intervals[0][1]-intervals[0][0]+1)+(intervals[1][1]-intervals[1][0]+1)];

        return answer;
    }

    public int[] solution4(int[] arr) {
        int[] answer = {};
        int count=0;
        for (int n:arr){
            if(n==2) count++;
        }
        if (count==1) return new int[]{-1};

        return answer;
    }
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        for (int i = 0; i < query.length; i++) {
            int idx=query[i];
            if(i%2==0){
                arr =Arrays.copyOfRange(arr,0,idx);
            }else {

            }
        }
        return answer;
    }


}

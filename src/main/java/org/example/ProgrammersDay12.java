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
        /*int[] arr={10, 10, 10, 2, 1, 3, 2, 2, 6};
        *//*
        입력값 〉 [2, 2, 3]
        기댓값 〉 [2, 2]*//*
        int[] result=solution.solution4(arr);*/

        int[] arr={0, 1, 2, 3, 4, 5};
        int[] query={4, 1, 2};
        int[] result=solution.solution5(arr,query);
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
        int[] index= {-1, -1};
        for (int i=0;i<arr.length;i++){
            if(arr[i]==2) {
                if(index[0]==-1){
                    index[0]=i;
                }else {
                    index[1]=i;
                }
                count++;
            }
        }
        if (count==0) return new int[]{-1};
        if (count==1) return new int[]{2};
        return Arrays.copyOfRange(arr,index[0],index[1]+1);
        // 최적화
        /*int[] index = {-1, -1};  // 첫 번째와 마지막 2의 인덱스를 추적
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (index[0] == -1) {
                    index[0] = i;  // 첫 번째 2의 위치를 저장
                }
                index[1] = i;  // 마지막 2의 위치를 계속 업데이트
            }
        }

        // 2가 배열에 없으면
        if (index[0] == -1) {
            return new int[]{-1};  // 2가 없으므로 [-1] 반환
        }

        // 2가 포함된 가장 작은 연속된 부분 배열 반환
        return Arrays.copyOfRange(arr, index[0], index[1] + 1);*/
    }
    public int[] solution5(int[] arr, int[] query) {
        int[] answer = {};
        for (int i = 0; i < query.length; i++) {
            int idx=query[i];
            System.out.println("-------------------------");
            System.out.println("i:"+i);
            System.out.println("idx:"+idx);
            if(i%2==0){ //짝수
                System.out.println("짝수");
                arr =Arrays.copyOfRange(arr,0,idx+1);
            }else { // 홀수
                System.out.println("홀수");
                arr =Arrays.copyOfRange(arr,idx,arr.length);
            }
        }
        return arr;
    }


}

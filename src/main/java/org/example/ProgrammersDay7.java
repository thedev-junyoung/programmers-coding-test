package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgrammersDay7 {
    public static void main(String[] args){
        Solution7 solution=new Solution7();
        /*int [] arr={0, 1, 2, 4, 3};
        int[][] queries={{0, 4, 1}, {0, 3, 2},{0, 3, 3}};
        int[] result =solution.solution1(arr,queries);
        System.out.println(Arrays.toString(result));*/

        /*int i =5,r=555;
        int[] result=solution.solution2(i,r);
        System.out.println(Arrays.toString(result));*/

        /*int start_num=3,end_num=10;
        int[] result=solution.solution3(start_num,end_num);
        System.out.println(Arrays.toString(result));*/

        /*int n=10;
        int[] result=solution.solution4(n);
        System.out.println(Arrays.toString(result));*/

        int[] arr = {1, 4, 2, 5, 3};
        int[] result=solution.solution5(arr);
        System.out.println(Arrays.toString(result));
    }
}
class Solution7 {
    public int[] solution1(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length); // arr 배열을 복사하여 answer 배열을 초기화합니다.
        //queries ={ s, e, k }

        for(int i=0; i < queries.length; i++){

            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for(int j = s; j <= e; j++){
                if(j % k == 0){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
    public int[] solution2(int l, int r) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isZeroFiveNumber(i)) {
                arrayList.add(i);
            }
        }

        // 리스트가 비어있으면 -1을 포함하는 배열 반환
        if (arrayList.isEmpty()) {
            return new int[]{-1};
        }

        // 결과를 배열로 변환
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
    public boolean isZeroFiveNumber(int num) {
        if (num == 0) return true;  // 0을 처리
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public int[] solution3(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        for(int i=0;i<answer.length;i++){
            answer[i]=start_num;
            start_num++;
        }
        return answer;
    }

    public int[] solution4(int n) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        while (n!=1){
            arrayList.add(n);
            if(n%2!=0){ //홀수
                n=3*n+1;
            }else { //짝수
                n=n/2;
            }
        }
        arrayList.add(1);
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

    public int[] solution5(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                // stk가 빈 배열이면 arr[i]를 추가
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                // stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk에 추가
                stk.add(arr[i]);
                i++;
            } else {
                // stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk에서 마지막 원소 제거
                stk.remove(stk.size() - 1);
            }
        }

        // 결과를 int[]로 변환하여 반환
        int[] result = new int[stk.size()];
        for (i = 0; i < stk.size(); i++) {
            result[i] = stk.get(i);
        }
        return result;
        /*최적화: 스택사용
        int[] stk = new int[arr.length]; // 스택으로 사용할 배열
        int top = -1; // 스택의 top을 가리키는 인덱스

        for (int i = 0; i < arr.length; i++) {
            while (top >= 0 && stk[top] >= arr[i]) {
                top--; // stk의 마지막 원소가 arr[i]보다 크거나 같으면 제거
            }

            if (top < 0 || stk[top] < arr[i]) {
                stk[++top] = arr[i]; // arr[i]를 stk에 추가
            }
        }

        // 결과 배열을 생성하고 stk의 유효한 부분을 복사
        int[] result = new int[top + 1];
        System.arraycopy(stk, 0, result, 0, top + 1);

        return result;
        * */

    }

}

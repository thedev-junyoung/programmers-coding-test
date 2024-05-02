package org.example;

import java.util.Arrays;
import java.util.Locale;

public class ProgrammersDay15 {
    public static void main(String[] args) {
        Solution15 solution=new Solution15();
        int[] arr={1, 2, 3, 100, 99, 98};
        //int[] result=solution.solution1(arr);
        //int result=solution.solution2(arr);
        //int[] num_list={12, 4, 15, 1, 14};
        //int result=solution.solution3(num_list);
        /*int[] num_list={2,3,4,5};
        int result=solution.solution4(num_list);
        System.out.println("result:"+result);*/

        String myString="AbCdEfG";
        String pat="aBc";
        int result=solution.solution5(myString,pat);
        System.out.println(result);
    }
}
class Solution15{
    public int[] solution1(int[] arr) {
        for(int i=0;i< arr.length;i++){
            if(arr[i]>=50&&arr[i]%2==0){
                arr[i]=arr[i]/2;
            }else if(arr[i]<50&&arr[i]%2!=0) {
                arr[i]=arr[i]*2+1;
            }
        }
        return arr;
    }
    public int solution2(int[] arr) {
        int answer = 0;
        boolean check=true;
        while (check){
            int[] temp=Arrays.copyOf(arr,arr.length);
            arr=solution1(arr);
            if(Arrays.equals(arr, temp)) return answer;
            answer++;
        }
        return answer;
    }

    public int solution3(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            while (true){
                if (num_list[i]==1) {
                    break;
                }
                if(num_list[i]%2==0){
                    num_list[i]=num_list[i]/2;
                }else {
                    num_list[i]=(num_list[i]-1)/2;
                }
                answer++;
            }
        }
        return answer;
    }
    public int solution4(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list.length>=11){
                answer+=num_list[i];
            }else {
                if(answer==0) answer=1;
                answer*=num_list[i];
            }
        }
        return answer;
    }
    public int solution5(String myString, String pat) {
        myString=myString.toUpperCase();
        pat=pat.toUpperCase();
        if(myString.contains(pat)) return 1;
        return 0;
    }
}
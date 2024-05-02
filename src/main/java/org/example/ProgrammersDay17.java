package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersDay17 {
    public static void main(String[] args) {
        Solution17 solution=new Solution17();
       /* String myString="AAAAaaaa";
        String pat="a";
        solution.solution(myString,pat);*/
/*        String myString="banana";
        String pat="ana";
        int result = solution.solution2(myString,pat);*/
        //String[] strArr={"and","notad","abcd"};
        /*String[] strArr={"there","are","no","a","ds"};
        String[] result=solution.solution3(strArr);
        System.out.println(Arrays.toString(result));*/
        String my_string=" i    love  you";
        String[] result=solution.solution5(my_string);
        System.out.println(Arrays.toString(result));
    }

}
class Solution17 {
    public String solution(String myString, String pat) {
        return myString.substring(0,myString.lastIndexOf(pat)+pat.length());
    }
    public int solution2(String myString, String pat) {
        int answer = 0;
        List<Integer> indices = new ArrayList<>();
        int index = myString.indexOf(pat);
        while (index >= 0) {
            indices.add(index);
            index = myString.indexOf(pat, index + 1); // 다음 인덱스부터 다시 찾기 시작
            System.out.println("index:"+index);
        }
        System.out.println("index:"+indices);
        return indices.size();
    }
    public String[] solution3(String[] strArr) {
        int length=0;
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].contains("ad")){
                System.out.println(strArr[i]);
                length++;
            }
        }
        String[] answer = new String[length+1];
        System.out.println(answer.length);
        if(answer.length==1) return strArr;
        int j=0;
        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")){
                answer[j]=strArr[i];
                j++;
            }
        }
        return answer;
    }
    public String[] solution4(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
    public String[] solution5(String my_string) {
        String[] answer = my_string.split(" ");
        ArrayList<String> arrayList=new ArrayList<String>();
        for (int i = 0; i < answer.length; i++) {
            if(!answer[i].equals("")){
                arrayList.add(answer[i]);
            }
        }
        System.out.println(arrayList);
        String[] result=new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i]=arrayList.get(i);
        }
        return result;
    }
}
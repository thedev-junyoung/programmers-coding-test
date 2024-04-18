package org.example;

import java.util.*;
import java.util.HashSet;

public class ProgrammersDay9 {
    public static void main(String[] args){
        Solution9 solution =new Solution9();
        //String result=solution.solution2(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}});
        //System.out.println(result);

        /*String my_string= "ProgrammerS123"; int n =11;
        System.out.println(solution.solution3(my_string,n));*/

        /*String[] result=solution.solution4("banana");
        System.out.println(Arrays.toString(result));
*/
        int result=solution.solution5("banana","ana");
        System.out.println(result);

    }
}
class Solution9{
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // input: ["0123456789","9876543210","9999999999999"]	k:50000	 s:5	l:5
        // [56789, 99999]
        int[] answer = {};
        ArrayList arrayList=new ArrayList(intStrs.length);
        for (int i = 0; i<intStrs.length;i++){
            String str = intStrs[i].substring(s,s+l);
            System.out.println(Integer.parseInt(str));
            System.out.println(k<Integer.parseInt(str));
            if(k<Integer.parseInt(str)){
                System.out.println(str);
                arrayList.add(Integer.parseInt(str));
            }
        }
        System.out.println("arrayList.size:"+arrayList.size());
        answer = new int[arrayList.size()];
        System.out.println(arrayList.toString());
        System.out.println("answer.length:"+answer.length);
        for (int i=0;i< answer.length;i++){
            answer[i]= (int) arrayList.get(i);
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
    public String solution2(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<my_strings.length;i++){
            sb.append(my_strings[i].substring(parts[i][0],parts[i][1]+1));
        }
        answer=sb.toString();
        return answer;
    }
    public String solution3(String my_string, int n) {
        //String answer = my_string.substring(my_string.length()-n,my_string.length());
        // 위에 보다 이게 더 성능이 좋음
        String answer = my_string.substring(my_string.length()-n);
        return answer;
    }
    public String[] solution4(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i]=my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    public int solution5(String my_string, String is_suffix) {
        int answer = 0;
        HashSet<String> hashSet=new HashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            hashSet.add(my_string.substring(i));
        }
        if(hashSet.contains(is_suffix)) answer = 1;
        return answer;
    }

}
package org.example;

import java.util.Arrays;


public class ProgrammersDay13 {
    public static void main(String[] args) {

        Solution13 solution=new Solution13();
/*        int[] num_list={5, 2, 1, 7, 5};
        int n = 2;
        int[] result=solution.solution1(num_list,n);
        System.out.println(Arrays.toString(result));*/

        /*int[] num_list={5, 2, 1, 7, 5};
        int n = 3;
        int[] result=solution.solution2(num_list,n);
        System.out.println(Arrays.toString(result));
*/
       /* int[] num_list={5, 2, 1, 7, 5};
        int n = 3;
        System.out.println(Arrays.toString(solution.solution2(num_list,n)));*/

        /*String[] str_list={"r", "u", "d", "d"};
        String[] result=solution.solution3(str_list);
        System.out.println(Arrays.toString(result));*/

        int[] num_list={4,2,6,1,7,6};
        int n = 2;
        System.out.println(Arrays.toString(solution.solution5(num_list,n)));
    }


}
class Solution13 {
    public int[] solution1(int[] num_list, int n) {
        int[] answer={};
        answer=Arrays.copyOfRange(num_list,n-1,num_list.length);
        return answer;
    }
    public int[] solution2(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        /*int[] forward=Arrays.copyOfRange(num_list,0,n);
        int[] back=Arrays.copyOfRange(num_list,n,num_list.length);
        System.out.println(Arrays.toString(forward));
        System.out.println(Arrays.toString(back));

        */
        // 첫 번째 구간 복사: a부터 b까지
        System.out.println(num_list.length-1);
        System.arraycopy(num_list, n, answer, 0, answer.length-n);
        System.arraycopy(num_list, 0, answer, answer.length-n, n);
        System.out.println(Arrays.toString(answer));
// 두 번째 구간 복사: 0부터 a까지
        /*System.arraycopy(num_list, 0, result, b - a + 1, a + 1);*/
        return answer;


    }

    public String[] solution3(String[] str_list) {
        String[] answer = {};
        System.out.println(str_list.length);
        for (int i = 0; i < str_list.length; i++) {
            System.out.println(i);
            if(str_list[i].equals("l")){
                Arrays.copyOfRange(str_list,0,i);
                //System.out.println(Arrays.toString(Arrays.copyOfRange(str_list,0,i)));
                return Arrays.copyOfRange(str_list, 0, i);
            }else if(str_list[i].equals("r")){
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            }
        }
        return answer;
    }
    public int[] solution4(int[] num_list, int n) {
        int[] answer = Arrays.copyOfRange(num_list,0,n);
        //        System.arraycopy(num_list, 0, answer, 0, n);
        return answer;
    }
    public int[] solution5(int[] num_list, int n) {
        int[] answer = new int[(num_list.length+n-1)/n];
        int j=0;
        for (int i = 0; i < num_list.length; i+=n) {
            answer[j]=num_list[i];
            j++;
        }
        return answer;
    }
}
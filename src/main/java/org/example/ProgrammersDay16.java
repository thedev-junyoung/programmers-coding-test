package org.example;

public class ProgrammersDay16 {
    public static void main(String[] args) {
        Solution16 solution=new Solution16();
        //String myString="abstract algebra";
        //solution.solution4(myString);
        String myString="programmers";
        String apl="p";
        String result=solution.solution5(myString,apl);
        System.out.println(result);

    }
}
class Solution16 {
    public String solution1(String myString) {
        String answer = "";
        return myString.toUpperCase();
    }
    public String solution2(String myString) {
        return myString.toLowerCase();
    }
    public String[] solution3(String[] strArr) {
        String[] answer = {};
        for (int i = 0; i < strArr.length; i++) {
            if(i%2!=0){
                strArr[i]=strArr[i].toUpperCase();
            }else {
                strArr[i]=strArr[i].toLowerCase();
            }
        }
        return strArr;
    }
    public String solution4(String myString) {
        System.out.println(myString.toLowerCase().replace("a","A"));
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i)=='a' || myString.charAt(i)=='A'){
            }
        }
        return myString;
    }
    public String solution5(String my_string, String alp) {
        String answer = "";
        System.out.println(my_string.replace(alp,alp.toUpperCase()));
        return my_string.contains(alp)?my_string.replace(alp,alp.toUpperCase()):my_string ;
    }
}
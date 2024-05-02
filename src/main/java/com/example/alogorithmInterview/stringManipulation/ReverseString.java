package com.example.alogorithmInterview.stringManipulation;

public class ReverseString {
    //리트코드 344문제
    //문자열을 뒤집는 함수를 작성 , 입력값은 문자 배열이며 리턴없이 입력 배열내부를 직접 조작
    // 입력 ["r","a","c","e","c","a","r"]
    // 출력 ["r","a","c","e","c","a","r"]
    // swap 연습 문제
    public static void main(String[] args) {

        char[] s = new char[]{'r','a','c','e','c','a','r'};

        solution(s);

         int length = s.length;
        for (int i = 0; i < length; i++) {

            System.out.print(s[i]+" ");

        }

    }

    static void solution(char[] s) {

        int start = 0;
        int end = s.length-1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;

        }


    }




}

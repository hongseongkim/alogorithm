package com.example.stringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reorderLogFiles {
/*
*리트코드 937 난이도1
* 로그의 가장 앞부분은 식별자로서 순서에 영향을 끼치지않음
* 문자로 구성된 로그가 숫자 로그보다 앞에 오며 문자 로그는 사전순으로 한다.
* 문자가 동일할경우에는 식별자 순으로 한다.
* 숫자로그는 입력순서대로 한다.
* Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
  Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
*/

    public static void main(String[] args) {

        String[] logs = new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};


        System.out.println(Arrays.toString(solution(logs)));

    }


    public static String[] solution(String[] logs) {


        List<String> letters =new ArrayList<>();
        List<String> digits =new ArrayList<>();

        for (String log : logs){
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digits.add(log);
            } else {
                letters.add(log);
            }
        }

        letters.sort((o1, o2) -> {
            String[] o1x = o1.split(" ",2);
            String[] o2x = o2.split(" ",2);

            int compared = o1x[1].compareTo(o2x[1]);
            if (compared == 0) {
                return o1x[0].compareTo(o2x[0]);
            } else {
                return compared;
            }

        });

        letters.addAll(digits);
        return letters.toArray(new String[0]);

    }


}

package com.example.programers.basic;

import java.util.stream.IntStream;


/*
첫 번째로 나오는 음수

문제 설명
정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
start_num	    end_num	    result
10	            3	        [10, 9, 8, 7, 6, 5, 4, 3]
 */
public class Solution21 {
    public int[] solution(int start, int end_num) {

//        return IntStream.rangeClosed(end_num,start).map(i -> start - i +end_num)
//                .toArray();

        // 다른사람 풀이.. 음수로 하니까 더쉽다

        return IntStream.rangeClosed(-start, -end_num).map(i -> -i).toArray();

    }


// fori

//    public int[] solution(int start, int end) {
//        int[] answer = new int[start-end+1];
//        for(int i=0; i<=start-end; i++) {
//            answer[i] = start - i;
//        }
//        return answer;
//    }


}
package com.example.programers.basic;

import java.util.stream.IntStream;


/*
카운트 다운

문제 설명
정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
start_num	    end_num	    result
10	            3	        [10, 9, 8, 7, 6, 5, 4, 3]
 */
import java.util.stream.IntStream;
public class Solution21 {
        public int[] solution(int start, int end_num) {
            return IntStream.rangeClosed(end_num,start).map(i -> start - i +end_num)
                    .toArray();
        }
    }



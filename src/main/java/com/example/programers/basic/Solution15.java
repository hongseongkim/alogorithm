package com.example.programers.basic;

import java.util.stream.IntStream;

/*
홀수 vs 짝수
제출 내역
문제 설명
정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때,
 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요.
 두 값이 같을 경우 그 값을 return합니다.

제한사항
5 ≤ num_list의 길이 ≤ 50
-9 ≤ num_list의 원소 ≤ 9
입출력 예
num_list	        result
[4, 2, 6, 1, 7, 6]	17
[-1, 2, 5, 6, 3]	8
 */
public class Solution15 {
    public int solution(int[] num_list) {

        int o = IntStream.range(0, num_list.length)
                .filter(i -> i % 2 != 0)
                .map(i -> num_list[i])
                .sum();
        int e = IntStream.range(0, num_list.length)
                .filter(i -> i % 2 == 0)
                .map(i -> num_list[i])
                .sum();
        return Math.max(o,e);
    }
}

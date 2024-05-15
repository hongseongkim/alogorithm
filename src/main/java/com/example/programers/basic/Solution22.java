package com.example.programers.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


/*
배열 만들기 1
문제 설명
정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

 입출력 예
n	k	result
10	3	[3, 6, 9]
15	5	[5, 10, 15]
 */

public class Solution22 {
// intStream 만 이용한 솔루션
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % k == 0)
                .toArray();
    }

//       for i + stream 이용한 솔루션
//        public int[] solution(int n, int k) {
//
//            List<Integer> s = new ArrayList<>();
//
//
//            for (int i = 1; i <= n; i++) {
//                if (i % k == 0) {
//                    s.add(i);
//                }
//            }
//
//
//            return s.stream().mapToInt(Integer::intValue).toArray();
//
//        }



//    for i 만 사용 한 솔루션
//    public int[] solution(int n, int k) {
//        List<Integer> m = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (i % k == 0) {
//                m.add(i);
//            }
//        }
//
//        // ArrayList를 int 배열로 변환
//        int[] result = new int[m.size()];
//        for (int i = 0; i < m.size(); i++) {
//            result[i] = m.get(i);
//        }
//
//        return result;
//    }
//
    }
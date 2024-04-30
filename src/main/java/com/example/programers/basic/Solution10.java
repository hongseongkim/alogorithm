package com.example.programers.basic;

import java.util.stream.IntStream;

class Solution10 {
    public int solution(int[] num_list) {
//        if (num_list.length < 11){
//            return IntStream.of(num_list).reduce((a, b)-> a*b).orElse(0);
//        }else{
//
////        return IntStream.of(num_list).reduce(Integer::sum).orElse(0);
//        return IntStream.of(num_list).sum();
//        }

         IntStream s =IntStream.of(num_list);

        return num_list.length<11 ? s.reduce((a,b)-> a*b).orElse(0):s.sum();


    }
}
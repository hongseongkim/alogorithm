package com.example.alogorithmInterview.stringManipulation;

import java.util.*;

/*
리트코드 819문제
금지된 단어를 제외하고 가장 흔하게 등장하는 단어를 출력
대소문자 구분 X 구두점(마침표,쉼표 등등) 무시
 */
public class MostCommonWord {
    // 전처리 작업후 개수처리 및 추출 문제
    public static void main(String[] args) {

        String p = "As the sun set over the horizon, painting the sky with hues of orange and pink, the children in the park continued to play and laugh, their laughter echoing through the trees while the parents watched from the benches, chatting amongst themselves about the events of the day, the day which had started with a light breakfast and a brisk walk through the neighborhood, neighborhood that had become a close-knit community where everyone knew everyone, everyone who always looked out for one another and shared in each other's joys and sorrows."






                ;
        String[] banned = new String[]{"fff"};

        System.out.println("가장흔한단어 : "+result(p,banned));

    }

    public static String result(String p , String[] banned) {

        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        HashMap<String,Integer> count = new HashMap<>();

        String[] words = p.replaceAll("\\W+"," ").toLowerCase().split(" ");

        for (String w : words) {
            if (!ban.contains(w)) {
                count.put(w,count.getOrDefault(w,0)+1);
            }
        }

        return Collections.max(count.entrySet(),Map.Entry.comparingByValue()).getKey();

    }

}

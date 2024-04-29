package com.example.stringManipulation;

public class palindrome {

    // 주어진 문자열이 팰린드롬인지 확인하라 대소문자 구분 x 영숫자만을 대상으로 한다 .
    public static void main(String[] args) {

        String s = "Do geese see God?";

        System.out.println(isPalindrome1(s));
        System.out.println(isPalindrome2(s));



    }
      static boolean isPalindrome1(String s){
            int start = 0;
            int end = s.length() - 1;
                //isDigit 영숫자 인지 판별 ,toLowerCase 소문자로 변환
            
            //서로 중앙으로 이동하다 만나는 지점에서 종료
            while (start < end) {
                //영숫자 판별후 유효하지 않으면 한칸씩 이동
                if (!Character.isDigit(s.charAt(start))) {
                    start++;
                } else if (!Character.isDigit(s.charAt(end))) {
                    end--;
                } else {
                    //하나라도 일치하지 않는다면 팰린드롬x -> false 리턴
                    if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                        return false;
                    }
                    // 앞쪽문자는 한칸 뒤로 뒤쪽 문자는 한칸 앞으로 이동
                    start++;
                    end--;
                }
            }
            // 팰린드롬 일경우 true 리턴
            return true;
        }


    static boolean isPalindrome2(String s) {
        // StringBuilder 이용 문자열을 뒤집어서 바로 비교


        // 유요한 문자만 정규식으로 추출후 소문자로 변경시키기
        String s_filtered = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        String s_reverse = new StringBuffer(s_filtered).reverse().toString();

        // StringBuilder는 스레드에 안전하지않음.
        // 코드가 간결해졌지만 클래스를 직접 비교하기 때문에 isPalindrome1 보다 느림
        return s_filtered.equals(s_reverse);
    }

}

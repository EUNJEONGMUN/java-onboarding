package onboarding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Problem1 {
    static final int LEFT = 0;
    static final int RIGHT = 1;
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    private static int getPlus(Integer pageNumber) {
        int value = 0;
        while(pageNumber>0) {
            value += pageNumber%10;
            pageNumber /= 10;
        }
        return value;
    }
}
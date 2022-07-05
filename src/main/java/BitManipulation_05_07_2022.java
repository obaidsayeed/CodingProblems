//Asked by Facebook.
//
//Given three 32-bit integers x, y, and b, return x if b is 1 and y if b is 0,
// using only mathematical or bit operations. You can assume b can only be 1 or 0.

public class BitManipulation_05_07_2022 {

    public static int solution(int x,int y, int b){
        int result = x*b + y*(1-b);
        return result;
    }

    public static int solution2(int x, int y, int b){
        if ((b&1) == 1){
            return x;
        }
        return y;
    }
}

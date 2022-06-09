//There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner. You can only move right or down.
//
//For example, given a 2 by 2 matrix, you should return 2, since there are two ways to get to the bottom-right:
//
//Right, then down
//Down, then right
//Given a 5 by 5 matrix, there are 70 ways to get to the bottom-right.
public class CountWaysToReachBottom_09_06_2022 {
    public static int solution(int m,int n){
        if(m == 1 || n == 1){
            return 1;
        }
        return solution(m-1,n) + solution(m,n-1);
    }
}
;
//asked by Microsoft.
//
//Given an array of numbers, find the length of the longest increasing subsequence in the array.
// The subsequence does not necessarily have to be contiguous.
//
//For example, given the array [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15],
// the longest increasing subsequence has length 6: it is 0, 2, 6, 9, 11, 15.
//Constraints:
//
//1 <= nums.length <= 2500
//-104 <= nums[i] <= 104

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestIncreasingSubSequence_21_06_2022 {
    static int max_length;
    public static int solution(int[] nums,int n){
        // Recursive approach
        // Time Complexity is exponential
        // Space Complexity is O(1)
        if (n == 1){
            return 1;
        }

        int res, max_ending_at_ith = 1;
        for(int i = 1;i < n;i++){
            res = solution(nums,i);
            if ( nums[i - 1] < nums[ n - 1] && res + 1 > max_ending_at_ith){
                max_ending_at_ith = res + 1;
            }
        }

        if ( max_length < max_ending_at_ith){
            max_length = max_ending_at_ith;
        }
        return max_ending_at_ith;
    }

    public static int solution2(int[] nums,int n){
        // DP apprach
        // Time Complexity is O(n^2)
        // Space Complexity is O(n)

        // Intializing array to keep track of max length of LIS at ith index
        int[] lis = new int[n];
        Arrays.fill(lis,1);

        // Iterating from index 1 to n
        for(int i = 1;i < n;i++){
            // Iteratng from index 0 to i - 1
            for(int j = 0;j < i;j++){
                // Check if curr element is greater than previous jth element and
                // check if the max length of LIS at ith index is less than max length at jth + 1
                if ( nums[i] > nums[j] && lis[i] < lis[j] + 1){
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // Iterate through the dp array to get max length of LIS
        for(int i = 0; i < n;i++){
            if(max_length < lis[i]){
                max_length = lis[i];
            }
        }
        return max_length;
    }
}

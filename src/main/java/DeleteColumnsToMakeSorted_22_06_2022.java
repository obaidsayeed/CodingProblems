//Asked by Google.
//
//You are given an N by M 2D matrix of lowercase letters.
// Determine the minimum number of columns that can be removed
// to ensure that each row is ordered from top to bottom lexicographically.
// That is, the letter at each column is lexicographically later as you go down each row.
// It does not matter whether each row itself is ordered lexicographically.
//
//For example, given the following table:
//
//cba
//daf
//ghi
//This is not ordered because of the a in the center. We can remove the second column to make it ordered:
//
//ca
//df
//gi
//So your function should return 1, since we only needed to remove 1 column.
//
//As another example, given the following table:
//
//abcdef
//Your function should return 0, since the rows are already ordered (there's only one row).
//
//As another example, given the following table:
//
//zyx
//wvu
//tsr
//Your function should return 3, since we would need to remove all the columns to order it.

public class DeleteColumnsToMakeSorted_22_06_2022 {
    public static int solution(Character[][] ch ){
        // Brute force approach

        int n = ch.length;
        int m = ch[0].length;
        int cnt = 0;
        if (n == 1){
            return 0;
        }

        for(int j = 0; j < m; j++){
            for(int i = 1; i < n; i++){
                int val1 = ch[i-1][j];
                int val2 = ch[i][j];
                if (val1 > val2){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}

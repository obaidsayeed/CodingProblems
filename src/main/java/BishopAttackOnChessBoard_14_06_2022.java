//Asked by Google.
//
//On our special chessboard, two bishops attack each other if they share the same diagonal.
// This includes bishops that have another bishop located between them,
// i.e. bishops can attack through pieces.
//
//You are given N bishops, represented as (row, column) tuples on a M by M chessboard.
// Write a function to count the number of pairs of bishops that attack each other.
// The ordering of the pair doesn't matter: (1, 2) is considered the same as (2, 1).
//
//For example, given M = 5 and the list of bishops:
//
//(0, 0)
//(1, 2)
//(2, 2)
//(4, 0)
//The board would look like this:
//
//[b 0 0 0 0]
//[0 0 b 0 0]
//[0 0 b 0 0]
//[0 0 0 0 0]
//[b 0 0 0 0]
//You should return 2, since bishops 1 and 3 attack each other, as well as bishops 3 and 4.
//Constraints
//1 ≤ n ≤ 106
//1 ≤ row , col ≤ 103
public class BishopAttackOnChessBoard_14_06_2022 {
    public static int solution(int[][] pairs,int m){
        int noOfAttackingBishopPairs = 0;
        int i,j;
        int n = pairs.length;
        for(i = 0;i < n - 1;i++){
            int x1 = pairs[i][0],y1 = pairs[i][1];
            for(j = i + 1;j < n;j++){
                int x2 = pairs[j][0],y2 = pairs[j][1];
                if(x1 < m && y1 < m && x2 < m && y2 < m && Math.abs(x1 - x2) == Math.abs(y1 - y2)){
                    noOfAttackingBishopPairs++;
                }
            }
        }
        return noOfAttackingBishopPairs;
    }
}

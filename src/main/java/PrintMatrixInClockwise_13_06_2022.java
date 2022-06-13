//Asked by Amazon.
//
//Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
//
//For example, given the following matrix:
//
//[[1,  2,  3,  4,  5],
// [6,  7,  8,  9,  10],
// [11, 12, 13, 14, 15],
// [16, 17, 18, 19, 20]]
//You should print out the following:
//
//1
//2
//3
//4
//5
//10
//15
//20
//19
//18
//17
//16
//11
//6
//7
//8
//9
//14
//13
//12

//Constraints:
//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 10
//-100 <= matrix[i][j] <= 100
public class PrintMatrixInClockwise_13_06_2022 {
    public static void solution(int[][] mat){
        int k = 0,m = mat.length,l = 0,n = mat[0].length;
        int i;
        while(k < m && l < n){
            for(i = 0; i < n;i++){
                System.out.println(mat[k][i]);
            }
            k++;
            for(i = 0; i < m;i++){
                System.out.println(mat[i][n - 1]);
            }
            n--;

            if(k < m){
                for(i = n - 1; i >= l;--i){
                    System.out.println(mat[m - 1][i]);
                }
                m--;
            }

            if(l < n){
                for(i = m - 1;i >= k;--i){
                    System.out.println(mat[i][l]);
                }
                l++;
            }
        }
        System.out.println();

    }
}

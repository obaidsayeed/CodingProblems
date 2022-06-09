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

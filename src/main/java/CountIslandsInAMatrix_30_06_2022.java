//Asked by Amazon.
//
//Given a matrix of 1s and 0s, return the number of "islands" in the matrix.
// A 1 represents land and 0 represents water,
// so an island is a group of 1s that are neighboring whose perimeter is surrounded by water.
//
//For example, this matrix has 4 islands.
//
//1 0 0 0 0
//0 0 1 1 0
//0 1 1 0 0
//0 0 0 0 0
//1 1 0 0 1
//1 1 0 0 1

// Dry Run : https://docs.google.com/document/d/1ZEpdxVxiAVElMEYGJepZ4N3TO4Q8Mm20Whs7yq1rum0/edit

public class CountIslandsInAMatrix_30_06_2022 {

    public static void DFS(int[][] M, int i, int j, int ROW, int COL) {
        if (i < 0 || j < 0 || i > ROW - 1 || j > COL - 1 || M[i][j] != 1 ){
            return;
        }

        if (M[i][j] == 1){
            M[i][j] = 0;
            DFS(M, i + 1, j, ROW, COL);     //right side traversal
            DFS(M, i - 1, j, ROW, COL);     //left side traversal
            DFS(M, i, j + 1, ROW, COL);     //upward side traversal
            DFS(M, i, j - 1, ROW, COL);     //downward side traversal
            DFS(M, i + 1, j + 1, ROW, COL); //upward-right side traversal
            DFS(M, i - 1, j - 1, ROW, COL); //downward-left side traversal
            DFS(M, i + 1, j - 1, ROW, COL); //downward-right side traversal
            DFS(M, i - 1, j + 1, ROW, COL); //upward-left side traversal

        }
    }

    public static int solution(int[][] M){
        int ROW = M.length;
        int COL = M[0].length;
        int cnt = 0;
        for(int i = 0;i < ROW;i++){
            for(int j = 0; j < COL;j++){
                if (M[i][j] == 1){
                    M[i][j] = 0;
                    cnt++;
                    DFS(M, i + 1, j, ROW, COL);     //right side traversal
                    DFS(M, i - 1, j, ROW, COL);     //left side traversal
                    DFS(M, i, j + 1, ROW, COL);     //upward side traversal
                    DFS(M, i, j - 1, ROW, COL);     //downward side traversal
                    DFS(M, i + 1, j + 1, ROW, COL); //upward-right side traversal
                    DFS(M, i - 1, j - 1, ROW, COL); //downward-left side traversal
                    DFS(M, i + 1, j - 1, ROW, COL); //downward-right side traversal
                    DFS(M, i - 1, j + 1, ROW, COL); //upward-left side traversal

                }
            }
        }
        return cnt;
    }
}

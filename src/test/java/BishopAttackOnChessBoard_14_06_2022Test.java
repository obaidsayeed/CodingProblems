import org.junit.Test;

public class BishopAttackOnChessBoard_14_06_2022Test {

    @Test
    public void testCase_1(){
        int[][] pairs = {{0,0},{0,4},{2,2},{4,0},{4,4}};
        System.out.println(BishopAttackOnChessBoard_14_06_2022.solution(pairs,5));
    }

    @Test
    public void testCase_2(){
        int[][] pairs = {{0,0},{1,2},{2,2},{4,0}};
        System.out.println(BishopAttackOnChessBoard_14_06_2022.solution(pairs,5));
    }

    @Test
    public void testCase_3(){
        int[][] pairs = {{0,0}};
        System.out.println(BishopAttackOnChessBoard_14_06_2022.solution(pairs,1));
    }

    @Test
    public void testCase_4(){
        int[][] pairs = {{0,0},{0,1},{1,1},{1,0}};
        System.out.println(BishopAttackOnChessBoard_14_06_2022.solution(pairs,2));
    }

    @Test
    public void testCase_5(){
        int[][] pairs = {{0,0},{0,4},{2,2},{4,0},{4,4}};
        System.out.println(BishopAttackOnChessBoard_14_06_2022.solution(pairs,5));
    }
}

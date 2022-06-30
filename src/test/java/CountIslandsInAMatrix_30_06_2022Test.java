import org.junit.Test;

public class CountIslandsInAMatrix_30_06_2022Test {
    @Test
    public void testCase_1(){
        int[][] mat = {{1,0,0,0,0},{0,0,0,0,1},{1,0,0,0,0},{0,0,0,0,1},{0,0,1,0,0}};
        System.out.println(CountIslandsInAMatrix_30_06_2022.solution(mat));
    }

    @Test
    public void testCase_2(){
        int[][] mat = {{1,0,0,0,0},{0,0,1,1,0},{0,1,1,0,0},{0,0,0,0,0},{1,1,0,0,1},{1,1,0,0,1}};
        System.out.println(CountIslandsInAMatrix_30_06_2022.solution(mat));
    }
}

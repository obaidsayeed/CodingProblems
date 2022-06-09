import org.junit.Test;

public class PrintMatrixInClockwise_13_06_2022Test {
    @Test
    public void testCase_1(){
        int[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        PrintMatrixInClockwise_13_06_2022.solution(mat);
    }

    @Test
    public void testCase_2(){
        int[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        PrintMatrixInClockwise_13_06_2022.solution(mat);
    }

    @Test
    public void testCase_3(){
        int[][] mat = {{1,2,3,4,5}};
        PrintMatrixInClockwise_13_06_2022.solution(mat);
    }

    @Test
    public void testCase_4(){
        int[][] mat = {{1},{6},{11},{16},{21}};
        PrintMatrixInClockwise_13_06_2022.solution(mat);
    }

    @Test
    public void testCase_5(){
        int[][] mat = {{1,2,3,4,5},{6,7,8,9,10}};
        PrintMatrixInClockwise_13_06_2022.solution(mat);
    }
}

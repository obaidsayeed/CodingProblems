import org.junit.Test;

public class LargestProduct_15_06_2022Test {

    @Test
    public void testCase_1(){
        int[] arr = {-10,-10,5,2};
        System.out.println(LargestProduct_15_06_2022.solution1(arr,4));
        System.out.println(LargestProduct_15_06_2022.solution2(arr,4));
    }

    @Test
    public void testCase_2(){
        int[] arr = {10,3,5,6,20};
        System.out.println(LargestProduct_15_06_2022.solution1(arr,5));
        System.out.println(LargestProduct_15_06_2022.solution2(arr,5));
    }

    @Test
    public void testCase_3(){
        int[] arr = {-10,-3,-5,-6,-20};
        System.out.println(LargestProduct_15_06_2022.solution1(arr,5));
        System.out.println(LargestProduct_15_06_2022.solution2(arr,5));
    }

    @Test
    public void testCase_4(){
        int[] arr = {10};
        System.out.println(LargestProduct_15_06_2022.solution1(arr,1));
        System.out.println(LargestProduct_15_06_2022.solution2(arr,1));
    }

    @Test
    public void testCase_5(){
        int[] arr = {1,-4,3,-6,7,0};
        System.out.println(LargestProduct_15_06_2022.solution1(arr,6));
        System.out.println(LargestProduct_15_06_2022.solution2(arr,6));
    }
}

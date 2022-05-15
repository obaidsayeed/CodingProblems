import org.junit.Test;

public class FirstMissingPositiveInteger_10_05_2022Test {
    @Test
    public void testCase_1(){
        int arr[] = {1,2,3,4,5};
        System.out.println(FirstMissingPositiveInteger_10_05_2022.solution(5,arr));
    }
    @Test
    public void testCase_2(){
        int arr[] = {0};
        System.out.println(FirstMissingPositiveInteger_10_05_2022.solution(1,arr));
    }
    @Test
    public void testCase_3(){
        int arr[] = {1,3,3,4,2,6,10,-1};
        System.out.println(FirstMissingPositiveInteger_10_05_2022.solution(8,arr));
    }
    @Test
    public void testCase_4(){
        int arr[] = {1,1,1,1,1,1};
        System.out.println(FirstMissingPositiveInteger_10_05_2022.solution(6,arr));
    }
    @Test
    public void testCase_5(){
        int arr[] = {1,34,123,542,21,43,54};
        System.out.println(FirstMissingPositiveInteger_10_05_2022.solution(7,arr));
    }
}

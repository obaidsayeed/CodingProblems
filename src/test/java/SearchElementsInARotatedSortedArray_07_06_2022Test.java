import org.junit.Test;

public class SearchElementsInARotatedSortedArray_07_06_2022Test {
    @Test
    public void testCase_1(){
        int[] arr = {4,5,1,2,3};
        System.out.println(SearchElementInARotatedSortedArray_07_06_2022.solution(arr,2));
    }

    @Test
    public void testCase_2(){
        int[] arr = {88,90,123,4,65,78,83};
        System.out.println(SearchElementInARotatedSortedArray_07_06_2022.solution(arr,88));
    }

    @Test
    public void testCase_3(){
        int[] arr = {1,2,3,4,5};
        System.out.println(SearchElementInARotatedSortedArray_07_06_2022.solution(arr,2));
    }

    @Test
    public void testCase_4(){
        int[] arr = {2,1};
        System.out.println(SearchElementInARotatedSortedArray_07_06_2022.solution(arr,1));
    }

    @Test
    public void testCase_5(){
        int[] arr = {0};
        System.out.println(SearchElementInARotatedSortedArray_07_06_2022.solution(arr,2));
    }
}

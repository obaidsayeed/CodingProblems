import org.junit.Test;

public class SecondLargestNodeInABinaryTree_12_05_2022Test {
    @Test
    public void testCase_1(){
        System.out.println(SecondLargestNodeInABinaryTree_12_05_2022.solution(SecondLargestNodeInABinaryTree_12_05_2022.deseriaize("2 2 5 -1 -1 5 7 -1 -1 -1 -1")));
    }
    @Test
    public void testCase_2(){
        System.out.println(SecondLargestNodeInABinaryTree_12_05_2022.solution(SecondLargestNodeInABinaryTree_12_05_2022.deseriaize("5 -1 -1")));
    }
    @Test
    public void testCase_3(){
        System.out.println(SecondLargestNodeInABinaryTree_12_05_2022.solution(SecondLargestNodeInABinaryTree_12_05_2022.deseriaize("7 7 7 -1 -1 -1 -1")));
    }
    @Test
    public void testCase_4(){
        System.out.println(SecondLargestNodeInABinaryTree_12_05_2022.solution(SecondLargestNodeInABinaryTree_12_05_2022.deseriaize("12 3 8 -1 2 5 5 -1 -1 -1 -1 -1 -1")));
    }
    @Test
    public void testCase_5(){
        System.out.println(SecondLargestNodeInABinaryTree_12_05_2022.solution(SecondLargestNodeInABinaryTree_12_05_2022.deseriaize("1 2 3 4 5 6 7 8 9 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1")));
    }
}

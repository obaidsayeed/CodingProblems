import org.junit.Test;

public class LexicographicallyShortestPath_18_05_2022Test {
    @Test
    public void testCase_1(){
        String[][] arr = {{"A","B"},{"A","C"},{"B","C"},{"C","A"}};
        String start = "A";
        System.out.println(LexicographicallyShortestPath_18_05_2022.solution(arr,start));
    }
}

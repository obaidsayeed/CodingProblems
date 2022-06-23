import org.junit.Test;

public class OverlappingIntervals_23_06_2022Test {
    @Test
    public void testCase_1(){
        Intervals[] arr = new Intervals[4];
        arr[0] = new Intervals(1,3);
        arr[1] = new Intervals(5,8);
        arr[2] = new Intervals(4,10);
        arr[3] = new Intervals(20,25);
        OverlappingIntervals_23_06_2022.solution(arr);
    }
}

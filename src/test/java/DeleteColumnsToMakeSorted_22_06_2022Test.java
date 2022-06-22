import org.junit.Test;

public class DeleteColumnsToMakeSorted_22_06_2022Test {

    @Test
    public void testCase_1(){
        Character[][] ch = {{'c','b','a'},{'d','a','f'},{'g','h','i'}};
        System.out.println(DeleteColumnsToMakeSorted_22_06_2022.solution(ch));
    }

    @Test
    public void testCase_2(){
        Character[][] ch = {{'a','b','c','d','e','f'}};
        System.out.println(DeleteColumnsToMakeSorted_22_06_2022.solution(ch));
    }

    @Test
    public void testCase_3(){
        Character[][] ch = {{'x','c'},{'y','b'},{'z','a'}};
        System.out.println(DeleteColumnsToMakeSorted_22_06_2022.solution(ch));
    }
}

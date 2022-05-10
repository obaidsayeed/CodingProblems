import org.junit.Test;

public class CheckBalanceBracketsTest {
    @Test
    public void testCase_1(){
        System.out.println(CheckBalanceBrackets.solution("[]{}()"));
    }
    @Test
    public void testCase_2(){
        System.out.println(CheckBalanceBrackets.solution("{[(])}"));
    }
    @Test
    public void testCase_3(){
        System.out.println(CheckBalanceBrackets.solution("((()"));
    }
    @Test
    public void testCase_4(){
        System.out.println(CheckBalanceBrackets.solution("[[[}})"));
    }
    @Test
    public void testCase_5(){
        System.out.println(CheckBalanceBrackets.solution("({[()]})"));
    }
}
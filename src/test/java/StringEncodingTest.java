import org.junit.Test;

public class StringEncodingTest {
    @Test
    public void testCase_1(){
        System.out.println(StringEncoding.solution("AAAABBBCCD"));
    }
    @Test
    public void testCase_2(){
        System.out.println(StringEncoding.solution("AAAABBBCCDAA"));
    }
    @Test
    public void testCase_3(){
        System.out.println(StringEncoding.solution("AABBCCDABCBDA"));
    }
    @Test
    public void testCase_4(){
        System.out.println(StringEncoding.solution("ABCDABABCCDA"));
    }
    @Test
    public void testCase_5(){
        System.out.println(StringEncoding.solution("BDACBCAEHHFD"));
    }
}

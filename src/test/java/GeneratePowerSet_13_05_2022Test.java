import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratePowerSet_13_05_2022Test {
    @Test
    public void testCase_1(){
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(GeneratePowerSet_13_05_2022.solution(s,3));
    }
    @Test
    public void testCase_2(){
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(GeneratePowerSet_13_05_2022.solution(s,5));
    }
    @Test
    public void testCase_3(){
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        System.out.println(GeneratePowerSet_13_05_2022.solution(s,2));
    }
    @Test
    public void testCase_4(){
        Set<Integer> s = new HashSet<>();
        s.add(1);
        System.out.println(GeneratePowerSet_13_05_2022.solution(s,1));
    }
    @Test
    public void testCase_5(){
        Set<Integer> s = new HashSet<>();
        s.add(2);
        s.add(3);
        s.add(1);
        s.add(5);
        System.out.println(GeneratePowerSet_13_05_2022.solution(s,4));
    }
}

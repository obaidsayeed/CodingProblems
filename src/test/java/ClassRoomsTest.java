import org.junit.Test;

public class ClassRoomsTest {
    @Test
    public void testCase_1(){
        int[][] intervals = {{30,75},{0,50},{60,150}};
        System.out.println(ClassRooms.solution(3,intervals));
    }
    @Test
    public void testCase_2(){
        int[][] intervals = {{0,150},{40,110},{50,90}};
        System.out.println(ClassRooms.solution(3,intervals));
    }
    @Test
    public void testCase_3(){
        int[][] intervals = {{30,75},{0,50},{60,150},{160,200}};
        System.out.println(ClassRooms.solution(4,intervals));
    }
    @Test
    public void testCase_4(){
        int[][] intervals = {{15,45},{25,50}};
        System.out.println(ClassRooms.solution(2,intervals));
    }
    @Test
    public void testCase_5(){
        int[][] intervals = {{0,75},{60,90},{80,120},{119,200}};
        System.out.println(ClassRooms.solution(4,intervals));
    }
}

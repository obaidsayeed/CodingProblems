import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

//Asked by Snapchat.
//
//Given a list of possibly overlapping intervals, return a new list of intervals
// where all overlapping intervals have been merged.
//
//The input list is not necessarily ordered in any way.
//
//For example, given [(1, 3), (5, 8), (4, 10), (20, 25)], you should return [(1, 3), (4, 10), (20, 25)].
//Constraints:
//
//1 <= intervals.length <= 104
//intervals[i].length == 2
//0 <= starti <= endi <= 104
public class OverlappingIntervals_23_06_2022 {
    public static void solution(Intervals[] arr){
        if(arr.length == 1){
            System.out.println(arr);
        }

        Stack<Intervals> st = new Stack<>();
        Arrays.sort(arr, new Comparator<Intervals>() {
            @Override
            public int compare(Intervals i1, Intervals i2) {
                return i1.start - i2.start;
            }
        });

        st.push(arr[0]);
        for(int i = 1;i < arr.length;i++){
            Intervals top = st.peek();
            if (top.end < arr[i].start){
                st.push(arr[i]);
            } else if (top.end < arr[i].end) {
                top.end = arr[i].end;
                st.pop();
                st.push(top);
            }
        }
        while(!st.isEmpty()){
            Intervals top = st.pop();
            System.out.println("[" + top.start + "," + top.end + "]" );
        }
    }
}

class Intervals{
    int start,end;
    Intervals(int start,int end){
        this.start = start;
        this.end = end;
    }
}

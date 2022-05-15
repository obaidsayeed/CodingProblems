//The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.
//
//For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GeneratePowerSet_13_05_2022 {
    public static Set<Set<Integer>> solution(Set s,int n){
        ArrayList<Integer> ls = new ArrayList<>(s);
        Set<Set<Integer>> set = new HashSet<>();
        long power_set_size = (long)Math.pow(2,n);
        for(int i = 0; i < power_set_size; i++){
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) > 0){
                    System.out.print(ls.get(j));
                }
            }
            System.out.println();
        }

        return set;
    }
}

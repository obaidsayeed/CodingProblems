//Asked by Yelp.
//
//Given a mapping of digits to letters (as in a phone number), and a digit string,
// return all possible letters the number could represent.
// You can assume each valid number in the mapping is a single digit.
//
//For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …} then
// “23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"].

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class GenerateAllCombinations_27_06_2022 {
    public static void solution(String num_str){
        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        GenerateAllCombinations_27_06_2022.solutionHelper(num_str,0,"",arr);
    }

    public static void solutionHelper(String num_string,int str_len,String curr_str,String[] arr){
        if(str_len == num_string.length()){
            System.out.println(curr_str);
            return ;
        }
        String str = arr[num_string.charAt(str_len)].charAt(i).split("");
        for (int i = 0;i < arr[num_string.charAt(str_len)].length();i++){
            if(arr[num_string.charAt(str_len)].charAt(i) != ' '){
                GenerateAllCombinations_27_06_2022.solutionHelper(num_string,str_len + 1,curr_str + arr[num_string.charAt(str_len)].charAt(i),arr);
        }

        }
    }
}

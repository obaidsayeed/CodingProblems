//Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

import java.util.*;
public class FirstMissingPositiveInteger_10_05_2022{
    public static int solution(int n,int arr[]){
        int ans = 0;
        int i;
        int j = 0;
        for(i = 0;i < n;i++){
            if(arr[i] > 0 && arr[i] < n){
                int pos = arr[i] - 1;
                if(arr[i] != arr[pos]){
                    int temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                    i--;
                }
            }
        }

        while(j < n){
            if(arr[j] != j + 1){
                ans = j + 1;
                break;
            }
            j++;
        }

        if(ans == 0)
        {
            ans = n + 1;
        }

        return ans;
    }
}
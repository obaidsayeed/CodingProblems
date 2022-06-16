import java.util.Arrays;

//Asked by Facebook.
//
//Given a list of integers, return the largest product that can be made by multiplying any three integers.
//
//For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5
public class LargestProduct_15_06_2022 {
    public static int solution1(int[] arr,int n){
        // First approach
        // 1.Sort the array
        // 2.Return the maximum of product of first two elements and last element and last three elements
        if(n < 3){
            return -1;
        }
        Arrays.sort(arr);
        int product1 = arr[0]*arr[1]*arr[n-1];
        int product2 = arr[n - 1]*arr[n - 2]*arr[n - 3];
        return Math.max(product1,product2);
    }

    public static int solution2(int[] arr,int n){
        if (n < 3)
            return -1;

        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        Arrays.fill(leftMin, -1);
        Arrays.fill(leftMax, -1);
        Arrays.fill(rightMax, -1);
        Arrays.fill(rightMin, -1);

        int max_product = Integer.MIN_VALUE;

        int max_sum = arr[0];

        int min_sum = arr[0];

        for (int i = 1; i < n; i++)
        {
            leftMax[i] = max_sum;
            if (arr[i] > max_sum)
                max_sum = arr[i];

            leftMin[i] = min_sum;
            if (arr[i] < min_sum)
                min_sum = arr[i];
        }

        max_sum = arr[n - 1];

        min_sum = arr[n - 1];

        for (int j = n - 2; j >= 0; j--)
        {
            rightMax[j] = max_sum;
            if (arr[j] > max_sum)
                max_sum = arr[j];

            rightMin[j] = min_sum;
            if (arr[j] < min_sum)
                min_sum = arr[j];
        }

        for (int i = 1; i < n - 1; i++)
        {
            int max1 = Math.max(arr[i] * leftMax[i] * rightMax[i],
                    arr[i] * leftMin[i] * rightMin[i]);

            int max2 = Math.max(arr[i] * leftMax[i] * rightMin[i],
                    arr[i] * leftMin[i] * rightMax[i]);

            max_product = Math.max(max_product, Math.max(max1, max2));
        }

        return max_product;
    }
}

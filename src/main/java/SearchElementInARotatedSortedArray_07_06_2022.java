public class SearchElementInARotatedSortedArray_07_06_2022 {
    public static int solution(int[] arr,int key){
        int keyindex = -1;
        int pivot = -1;
        int n = arr.length;
        for(int i = 0; i < n - 1;i++){
            if(arr[i] > arr[i + 1]){
                pivot = i;
                break;
            }
        }
        int low;
        int high;

        if(key == arr[0]){
            return 0;
        }
        else if(key > arr[0]){
            low = 0;
            high = pivot;
        }
        else{
            low = pivot + 1;
            high = n - 1;
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key){
                keyindex = mid;
                break;
            }

            else if(arr[mid] > key){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }
        return keyindex;
    }
}

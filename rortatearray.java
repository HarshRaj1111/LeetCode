package practiceArray;
import java.util.*;
public class rortatearray {
    public static void rotatee(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;
        k %= n;
        if (k == 0) return;

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }
        System.arraycopy(res, 0, nums, 0, n);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotatee(arr,2);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    
}

package practiceArray;

import java.util.HashMap;
import java.util.*;
public class checkifsorted {
    public static boolean checksort(int []arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int num: nums){
                map.put(num,map.getOrDefault(map, 0)+1);
        }
        for(int num: nums){
            if(map.get(num)==1){
                sum = sum + num;
            }
        }
        return sum;
    }
        
    public static void main(String[] args) {
        int []arr = {3,4,5,2};
        System.out.println(sumOfUnique(arr));
    }
    }

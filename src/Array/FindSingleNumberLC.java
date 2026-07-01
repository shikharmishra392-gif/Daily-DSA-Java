package Array;

import java.util.HashMap;

public class FindSingleNumberLC {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int val:nums){
            freq.put(val,(freq.getOrDefault(val,0)+1));
        }
        for(int c:nums){
            if(freq.get(c)==1){
                return c;
            }
        }
        return -1;
    }

    static void main() {
        int []nums={1,1,2,3,2,3,4,3,3};
        System.out.println(singleNumber(nums));
    }
}


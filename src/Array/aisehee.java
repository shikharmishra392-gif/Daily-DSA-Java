package Array;

import java.util.ArrayList;

public class aisehee {
    static void main() {

        int j=0;
        int []nums= {1,2,3,4,5,6,7};
        int k=3;
        ArrayList<Integer> brr= new ArrayList<>();
        for(int i=nums.length-k;i<nums.length;i++){
            brr.add(nums[i]);
        }
        for(int val:brr){
            System.out.println(val);
        }
    }
}


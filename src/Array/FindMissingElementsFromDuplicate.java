package Array;

import java.util.ArrayList;
import java.util.List;
//iss question mei missing elements ki list deni thi array me se jisme khuch duplicate elements bhi present the to hum ne  marking facility use kro

public class FindMissingElementsFromDuplicate {
    public static List<Integer> findDisappearedNumber(int[]nums){
        ArrayList<Integer> missingelement= new ArrayList<>();

        for(int val:nums){
            if (Math.abs(val)- 1 >= 0 && Math.abs(val) - 1 < nums.length){
            if(nums[Math.abs(val)-1]>0) {
                nums[Math.abs(val) - 1] = -nums[Math.abs(val) - 1];
            }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                missingelement.add(i+1);
            }
        }
        return missingelement;
    }

    static void main() {
        int[]nums={1,4,2,5,6};
        System.out.println(findDisappearedNumber(nums));
    }
}


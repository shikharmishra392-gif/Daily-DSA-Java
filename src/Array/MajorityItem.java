package Array;

import java.util.HashMap;

public class MajorityItem { public int majorityElement(int[] nums) {
    int MajorityVal= nums[0];
    int MaxAmountnum=0;
    int n=nums.length;
    HashMap<Integer,Integer> result= new HashMap<>();
    for(int val:nums){
        result.put(val,result.getOrDefault(val,0)+1);
    }
    for(int vals:nums){
        if(result.get(vals)>MaxAmountnum&&result.get(vals)>(n/2)){
            MaxAmountnum=result.get(vals);
            MajorityVal=vals;
        }
    }
    return MajorityVal;
}
}

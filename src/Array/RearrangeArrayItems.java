package Array;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayItems {
    public int [] rearrangeArray(int[] nums) {

        List<Integer> seperatedarray=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                seperatedarray.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                seperatedarray.add(nums[i]);
            }
        }

        int ans[]=new int[nums.length];

        int i=0;
        int j=seperatedarray.size()/2;
        int k=0;
      while(k<seperatedarray.size()){
            if(k%2==0){
                ans[k]= seperatedarray.get(i);
                i++;
            }else if(k%2!=0){
                ans[k]= seperatedarray.get(j);
                j++;
            }
            k++;
      }
        return ans;

        }

    }


}


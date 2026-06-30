package Array;

public class Movezerotoend {public void moveZeroes(int[] nums) {

    if(nums.length!=1){
        int i=0;
        int j=1;
        while(i<nums.length-1&&j<nums.length){
            if(nums[i]==0&&nums[j]!=0){
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if(nums[j]==0){
                j++;
            }else if(nums[i]!=0){
                i++;
                if(i==j){
                    j++;
                }
            }
        }
    }
}

}

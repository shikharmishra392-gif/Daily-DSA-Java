package Array;

public class RotateAnArray {  public void reverse(int i,int j,int[]nums){
    while(i<j) {
        int temp = 0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }

}
    public void rotate(int[] nums, int k){
        int n= nums.length-1;
        reverse(0,k,nums);
        reverse((k+1),n,nums);
        reverse(0,n,nums);




    }
    public  void main(String[] args){
        int[]nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for(int val:nums){
            System.out.println(val);
        }
    }
}

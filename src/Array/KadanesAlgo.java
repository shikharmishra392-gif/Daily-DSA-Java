package Array;

public class KadanesAlgo {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //storing the sum value
            sum=sum+nums[i];
            //checking if current sum value is greater than maxsum then updating it
            if(sum>maxsum){
                maxsum=sum;
            }
            //if any negative number is added to the sum it reduces overall sum so we neglect that and dicard all the element till that element
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;

    }

}

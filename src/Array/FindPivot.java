package Array;

public class FindPivot {
    //iss question me pivot element nikalna hai jiske left elements ka sum aur right elements ka sub barbarabr ho hamne isme 2 new array banayi hai jisme se hum ek mei left se sum ki values rakhlenge aur ek mei right se sum ki value rakhlenge fir saare elements ko dono array me compare krayenge jo common value hogi uss index ko lauta dennge
    public static  void Findpivot(int[]nums){
        int leftsum[]= new int[nums.length];
        int rightsum[]= new int[nums.length];
        leftsum[0]=nums[0];
        int k=0;
        for(int i=1;i< nums.length;i++){
            leftsum[i]=leftsum[i]+nums[i];

        }
        rightsum[rightsum.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j==0;j--){
            rightsum[j]=leftsum[j]+nums[j];

        }
        int i=0;
        int j= 0;

        while(i<leftsum.length&&j<rightsum.length){
            if(leftsum[i]==rightsum[j]){
                 k =nums[i];
                 break;
            }else {
                i++;
                j++;
            }
        }
        System.out.println(nums[i]);
    }

    static void main() {
        int[]nums={12,19,2,-20,6,14,-1};
        Findpivot(nums);
    }
}

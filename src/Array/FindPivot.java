package Array;

public class FindPivot {
    //iss question me pivot element nikalna hai jiske left elements ka sum aur right elements ka sub barbarabr ho hamne isme 2 new array banayi hai jisme se hum ek mei left se sum ki values rakhlenge aur ek mei right se sum ki value rakhlenge fir saare elements ko dono array me compare krayenge jo common value hogi uss index ko lauta dennge
    public static  void Findpivot(int[]nums){
        int leftsum[]= new int[nums.length];
        int rightsum[]= new int[nums.length];
        leftsum[0]=nums[0];
        int k=0;
        for(int i=1;i<nums.length;i++){
            leftsum[i]=leftsum[i-1]+nums[i];

        }
        rightsum[rightsum.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            rightsum[j]=rightsum[j+1]+nums[j];

        }
        int i=0;
        int pivotindex=-1;

        while(i<rightsum.length){
            if(leftsum[i]==rightsum[i]){
                pivotindex=i;
                 break;
            }else {
                i++;
            }
        }
        if(pivotindex!=-1) {


            System.out.println(nums[i]);
        }else{
            System.out.println(-1);
        }
    }

    static void main() {
        int[]nums={1, 7, 3, 6, 5, 6};
        Findpivot(nums);
    }
}

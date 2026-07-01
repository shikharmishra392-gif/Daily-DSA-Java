package Array;
// isme kya kara hamne 2 pointer approach lagayi jisme ek pinter check krta rahega array ke elements aur ek track rakhega unique elements ka aur firr last me i+i ki value return kra denge jo ki no.of unique element honge

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {

        int j=1;
        int i=0;
        int k;
        while(j<nums.length){

            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                j++;

            }

        }

        return i+1;

    }
}

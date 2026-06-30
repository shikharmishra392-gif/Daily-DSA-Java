package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SeperateZeroandOne {
    public static void ZerosandOnes(int[]arr){
        int i=0;
        int j= arr.length-1;

//        Arrays.sort(arr);
        while(i<j){
            if(arr[i]==1&&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            } else if (arr[i]==0) {
                i++;

            } else if (arr[j]==1) {
                j--;

            }
        }
        for(int val:arr){
            System.out.println(val);
        }
    }

    static void main() {
        int []arr={0,1,0,0,0,1,0};
        ZerosandOnes(arr);
    }
}

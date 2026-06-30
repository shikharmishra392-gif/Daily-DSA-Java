package Array;

public class FindMissingNumber {
    public static void FindmissingNumber(int[]arr,int n){
        int Xorsum=0;
        for(int val:arr){
            Xorsum=Xorsum^val;
        }
        for(int i=0;i<=n;i++){
            Xorsum=Xorsum^i;
        }
        System.out.println(Xorsum);
    }

    static void main() {
        int[]arr={1,2,4,5,6};
       int  n=6;
        FindmissingNumber(arr,n);
    }
}

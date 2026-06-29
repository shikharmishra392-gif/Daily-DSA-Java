package Array;

public class ArrayBasicQuestion {
    // multiply by each element by 10
//    public static void Mulbyn(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            int x= arr[i]*10;
//            arr[i]=x;
//        }
//        for(int val:arr){
//            System.out.println(val);
//        }
//    }
//
//    static void main() {
//        int []arr={2,3,8,4,5};
//        Mulbyn(arr);
//
//    }
    //find element in array
// public static int FindElement(int[]arr,int n){
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==n){
//             System.out.println("element found at index " + i );
//             return i;
//         }
//     }
//     return 0;
// }
//
//    static void main() {
//        int[]arr={2,3,4,7,9};
//        int n=7;
//        FindElement(arr,n);
//    }
    // find the maximum element
//    public static int FindMaximum(int[]arr){
//        int max=0;
//        for(int val:arr){
//            if(val>max){
//                max=val;
//            }
//        }
//        return max;
//    }
//
//    static void main() {
//        int[]arr={5,6,8,100,20};
//        System.out.println( FindMaximum(arr));
//    }
//    public static int SumOfPosNeg(int[]arr){
//        int sumofpositive=0;
//        int sumofnegative=0;
//        for(int val:arr){
//            if(val<0){
//                sumofnegative += val;
//            }
//            else{
//                sumofpositive+= val;
//            }
//        }
//        System.out.println("sum of postive numbers is "+ sumofpositive);
//        System.out.println("sum of negative numbers is "+ sumofnegative);
//        return 0;
//
//    }
//
//    static void main() {
//        int[]arr={-1,-2,4,5,3,-2};
//        SumOfPosNeg(arr);
//    }

    //count number of one and zero
//  public static int SumOfPosNeg(int[]arr){
//      int countofzero=0;
//      int countofones=0;
//      for(int val:arr){
//          if(val==0){
//              countofzero ++;
//          } else if (val==1) {
//              countofones ++;
//
//          }
//
//      }
//      System.out.println("number of zero are "+ countofzero + " number of one are "+ countofones);
//      return 0;
//  }

    //FindFirstUnsorted element in array
//    public static int FindFirstUnsortedElement(int[]arr){
//        int x=arr[0];
//        for(int val:arr){
//            if(val<x){
//                System.out.println("the unsorted elemnt is  "+ val);
//            }
//            x=val;
//        }
//        return 0;
//    }
//
//    static void main() {
//        int[]arr={2,3,4,1,5,6};
//        FindFirstUnsortedElement(arr);
//    }
    //swap alternate element of an array
//    public static void SwapElements(int[]arr){
//        for(int i=0 ;i<arr.length-1; i+=2){
//            int temp=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=temp;
//        }
//        for(int val:arr){
//            System.out.print(val+" , ");
//        }
//    }
//
//    static void main() {
//        int[]arr={2,3,4,1,5,6};
//        SwapElements(arr);
//
//    }


    //print array intersection of elements
//public static void IntersectionOfElements(int []arr,int []brr){
//    boolean x=false;
//    for(int i=0;i<arr.length;i++){
//        for(int j=0;j<brr.length;j++){
//            if(brr[j]==arr[i]) {
//                System.out.print(arr[i] + ",");
//                x= true;
//            }
//        }
//    }
//    if(x==false){
//        System.out.println("no common element");
//    }
//
//}
//
//    static void main() {
//        int []arr={2,3,9,8,7,6};
//        int []brr={3,9,4,1,0,33};
//        IntersectionOfElements(arr,brr);
//    }
    //print alternate extreme element (pehla aur last)
//    public static void AlternateExtremeElement(int[] arr) {
//        int i = 0;
//        int j = arr.length - 1;
//        do {
//            System.out.println(arr[i] + "," + arr[j]);
//            i++;
//            j--;
//        } while (i < (arr.length / 2));
//    }
//
//    static void main() {
//        int []arr={2,3,9,8,7,6};
//        AlternateExtremeElement(arr);
//
//    }
}

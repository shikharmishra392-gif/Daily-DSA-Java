package Array;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayManipulatonProblem {

    // array reverse ka question
//    public static void ReverseAnArray(int[]arr){
//        int temp=0;
//        int i=0;
//        int j=arr.length-1;
//        do{
//            temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//
//        }while(i<=j);
//        for(int val:arr){
//            System.out.print(val+" ");
//        }
//
//    }
//
//    static void main() {
//        int[]arr={2,3,4,5,6,7};
//        ReverseAnArray(arr);
//    }

    //shift element by one
//    public static void Shiftbyone(int[]arr){
//        int temp=arr[arr.length-1];
//        for(int i=arr.length-1;i> 0;i--){
//            arr[i]=arr[i-1];
//            }
//           arr[0]=temp;
//
//        for(int val:arr){
//            System.out.print(val+ " ");
//        }
//
//    }
//
//    static void main() {
//        int[]arr={2,3,4,5,6,7};
//            Shiftbyone(arr);
//
//    }

    // print alternate  extreme element
//public static void AlternateExtremeElement(int[]arr) {
//    int i = 0;
//    int j = arr.length - 1;
//    while(i<=j){
//        if(i==j){
//            System.out.println(arr[i]);
//        } else {
//            System.out.println(arr[i]);
//            i++;
//            System.out.println(arr[j]);
//            j--;
//        }
//    }
//
//}
//
//    static void main() {
//        int[]arr={2,3,4,5,6,7};
//        AlternateExtremeElement(arr);
//}

    //Find the mode(element with highest occurence) of an array
  //bohot gaandu question tha upper se nikla tha baar baar dhekna check krna revise krna hashmap ka concept use hua hain
//    public static int ModeOfArray(int[]arr){
//        HashMap<Integer,Integer> Freq=new HashMap<>();
//        int maxfrequency=0;
//        int maxfrequencyvaalikey=-1;
//       for(int num:arr){
//           Freq.put( num,Freq.getOrDefault(num,0)+1);
//       }
//       for(int key: Freq.keySet()){
//           int Currentkey=key;
//           int Currentkeykifrequency=Freq.get(key);
//           if(Currentkeykifrequency>maxfrequency){
//               maxfrequency=Currentkeykifrequency;
//               maxfrequencyvaalikey=Currentkey;
//           }
//
//       }
//        return maxfrequencyvaalikey;
//
//
//    }
//
//    static void main() {
//        int[]arr={2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,4,4,2,1,1};
//        System.out.println(ModeOfArray(arr));
//    }
//    public static int FindElementwithhighestandlowestfreq(int[]arr){
//        HashMap<Integer,Integer> Hello= new HashMap<>();
//        for(int val:arr){
//            Hello.put(val, Hello.getOrDefault(val,0)+1);
//        }
//        int maxfrequency=-1;
//        int maxfrequencyvaalikey=-1;
//        int minfrequencyvaalikey=-1;
//        int minfrequency=Integer.MAX_VALUE;
//        for(int key: Hello.keySet()){
//            int currentkey=key;
//            int currentkeykifrequncy=Hello.get(key);
//            if(currentkeykifrequncy>maxfrequency){
//                maxfrequency=currentkeykifrequncy;
//                maxfrequencyvaalikey=currentkey;
//            }
//        }
//        System.out.println("maximum frequency elemnt="+ maxfrequencyvaalikey);
//        for(int key2: Hello.keySet()){
//            int currentkey2=key2;
//
//            int currentkeykifrequency2=Hello.get(key2);
//
//            if(currentkeykifrequency2<minfrequency){
//                minfrequency=currentkeykifrequency2;
//                minfrequencyvaalikey=currentkey2;
//            }
//        }
//        System.out.println("min frequency element ="+minfrequencyvaalikey);
//        return 0;
//    }
//
//    static void main() {
//        int[]arr={2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,4,4,4,4,2,1,1};
//          FindElementwithhighestandlowestfreq(arr);
//
//    }
    //find the union of the 2 arrays
//    public static void UnionOfTwoArray(int[]arr,int[]brr){
//        Set<Integer> set=new HashSet<>();
//        for(int val:arr){
//            set.add(val);
//        }
//        for(int vall:brr){
//            set.add(vall);
//        }
//        for(int valll:set){
//            System.out.println(valll);
//        }
//
//    }
//
//
//    static void main() {
//        int []arr={1,2,3,4};
//        int []brr={2,3,8,6};
//        UnionOfTwoArray(arr,brr);
//    }
//        public void rotate(int[] nums, int k) {
//            int x=0;
//            ArrayList<Integer> brr= new ArrayList<>();
//            for(int i=nums.length-k;i<nums.length;i++){
//                brr.add(nums[i]);
//            }
//            for (int a = nums.length - k - 1; a >= 0; a--) {
//                nums[a + k] = nums[a];
//            }
//
//            for (int i = 0; i < k; i++) {
//                nums[i] = brr.get(i);
//            }
//             for(int val:nums){
//                System.out.println(val);
//            }
//        }
//        public  void main(String[] args){
//            int[]nums={1,2,3,4,5,6,7};
//            int k=3;
//            rotate(nums,k);
//        }

    }



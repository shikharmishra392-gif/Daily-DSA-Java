public class bitwisseoperator {
    static void main(String[] args) {
        int a= 0;
        int [] arr={2,2,3,4,5,4,5};
        for(int val:arr){
           a= a^val;

        }
        System.out.println(a);
    }
}

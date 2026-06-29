import static java.lang.Math.sqrt;

public class basicmaths{
    int n;
    static int Primenumber(int n){
        for(int i=2;i<=n;i++){
            int x=1;
            for(int j=2;j<=sqrt(i);j++){
                if(i%j==0){
                    x=1;
                    break;
                }
                else {
                    x=0;
                }
            }
          if (x==0){
              System.out.println(i);
          }
        }
        return 0;
    }

    static void main() {

       Primenumber(100);

    }
}

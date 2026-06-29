package inheritence;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("number of legs");
        int x= sc.nextInt();
        System.out.println("voice produce");
        String y= sc.nextLine();
        System.out.println("gender");
        String z= sc.nextLine();
        System.out.println("colour");
        String c= sc.nextLine();
        System.out.println("name");
        String n= sc.nextLine();





        dog d = new dog(x,y,z,c,n);
        d.hello();
        d.bark();
        d.eat();
    }
}

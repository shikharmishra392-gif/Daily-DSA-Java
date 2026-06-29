package Polymorphism;

public class Main {
    static void main() {
        circle c= new circle();
        dodrawingstuff(c);
//        c.draw();
        rect r = new rect();
        dodrawingstuff(r);


    }
    public static void dodrawingstuff(shape s){
        s.draw();

    }
}

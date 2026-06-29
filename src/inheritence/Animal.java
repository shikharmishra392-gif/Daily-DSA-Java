package inheritence;

public class Animal {
    public int numbersOflegs;
    public String Voicetype;
//    Animal(){
//        this.numbersOflegs= -1;
//        this.Voicetype="";
//
//
//    }
    Animal(int numbersOflegs,String Voicetype){
        this.numbersOflegs=numbersOflegs;
        this.Voicetype=Voicetype;
    }
    void eat(){
        System.out.println("gauri says no ghummi......");

    }
}

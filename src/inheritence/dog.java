package inheritence;

import javax.lang.model.element.Name;

public class dog extends Animal{
    public String Gender;
    public String Colour;
    public String Name;
    dog(int numberOflegs, String Voiceproduce, String Gender,String Colour,String Name){
        super(numberOflegs,Voiceproduce);
        this.Gender=Gender;
        this.Colour=Colour;
        this.Name=Name;
    }

    void hello() {
        System.out.println(Name+" is saying ghummi");
        System.out.println(Name+ "colours is"+Colour);
    }


    void bark(){
        System.out.println(Name+" is barking.....");
    }
}

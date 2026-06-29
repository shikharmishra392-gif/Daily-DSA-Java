import java.util.Scanner;



public class strings {
    static int trimspaces(String str){
        String Ns = str.trim();
        System.out.println(Ns);
        return 0;

    }
//    static int FrequencyCharacter(String str,char ch){
//        int count=0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==ch){
//                count++;
//            }
//        }
//        return count;
//    }
    // question to uppercase without method
//    static String toUppercase(String str){
//        String str1= "" ;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==' '){
//                continue;
//            }
//            else {
//                char ch = (char) ((int)str.charAt(i) - 32);
//                 str1= str1 + ch;
//            }
//
//        }
//        return str1;
//    }
// question -count the number of consonent in string
//    static int countConsonent(String str) {
//        int countvowels=0;
//        int countconsonent=0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'||str.charAt(i) == ' ') {
//                countvowels++;
//            } else {
//                countconsonent++;
//            }
//        }
//        return countconsonent;
//    }
    static void main() {
         Scanner sc= new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        System.out.println("enter the string");

         String str= sc.nextLine();
//        System.out.println("enter character");
//        char ch=sc.next().charAt(0);
//        System.out.println(countConsonent(str));
//        System.out.println(toUppercase(str));
//        System.out.println(FrequencyCharacter(str,ch));
        System.out.println(trimspaces(str));




    }

    }


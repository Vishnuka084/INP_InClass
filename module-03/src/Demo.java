public class Demo {
    public static void main(String[] args) {

        /*  String s1 = new String("abc");  //dynamic object creation
        String s2 = "abc";  //String literals object
        System.out.println(s1); //call s1.toString()-> object-->sub classes inherits
        System.out.println(s2); //call s2.toString()-> object-->sub classes inherits
*/

        /*String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1==s2);//false
        System.out.println(s3==s4);//true*/

        String s1 = "Danapala";
        String s2 = "Danapala";

        if (s1.equals(s2)){
            System.out.println("s1==s2");
        }

        String s3 = new String("danapala");
        String s4 = new String("danapala");

        if (s3.equals(s4)){
            System.out.println("s3==s4");
        }
    }
}
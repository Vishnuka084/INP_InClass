public class Demo {
    public static void main(String[] args) {
        String s1 = new String("abc");  //dynamic object creation
        String s2 = "abc";  //String literals object
        System.out.println(s1); //call s1.toString()-> object-->sub classes inherits
        System.out.println(s2); //call s2.toString()-> object-->sub classes inherits

    }
}

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

        /*
                // == , equals() , equalsIgnoreCase()
                String s1 = "Danapala";
                String s2 = "Danapala";

                if (s1.equals(s2)){
                    System.out.println("s1==s2");
                }

                String s3 = new String("Panapala");
                String s4 = new String("danapala");

                if (s3.equalsIgnoreCase(s4)){
                    System.out.println("s3==s4");
                }*/

        /* String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("s1==s2:"+(s1==s2));//true
        System.out.println("s3==s4:"+(s3==s4));//false
        System.out.println("s1==s3:"+(s1==s3));//false
        System.out.println("abc"=="abc");//true
        System.out.println(new String("abc")== new String("abc"));//false*/

        /*
        String city = "karannagoda";
        //
        String name = "Karannagoda";
        System.out.println("Name :"+name);
        System.out.println("City :"+city);

        name = name.concat("Maya");
        System.out.println("Name :"+name);
        System.out.println("City :"+city);*/

        /*
        //replace
        String s1 = "abc#xyz";
        System.out.println(s1);
        s1 = s1.replace("#" , "@");
        System.out.println(s1);*/

        //substring
        String s1 = "abc@123.com";
        String ext = s1.substring(8);
        System.out.println(ext);
        String mid = s1.substring(4,7);
        System.out.println(mid);

    }
}

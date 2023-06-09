import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Demo {
    public static void main(String[] args) throws IOException {

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

        /* //substring
        String s1 = "abc@123.com";
        String ext = s1.substring(8);
        System.out.println(ext);
        String mid = s1.substring(4,7);
        System.out.println(mid);
*/

        /*
                //substring2
                String s1 = new String("abc");
                System.out.println("Size :"+s1.length());
                int[]x={1,2,3,4};
                System.out.println("Size :"+x.length);
                */

        /*

                String name = "abc";
                System.out.println(name.length());//4
                name.trim();// spaces rid
                System.out.println( name.length());//4
                System.out.println( name.trim().length());//3
                name = name.trim();
                System.out.println(name.length());//3
        */

        /*String s1 = "animals";
        System.out.println(s1.toUpperCase());*/


        //wrapper class
        /*
            * byte - Byte
            * short - Short
            * int - Integer
            * float - Float
            * char - Character
            * boolean - Boolean
            *
            * */

        /* //---boxing --
        int x = 100;
        Integer iOb;
        iOb=x; // illegal 1.4 < // legale auto Boxing (1.5)
        iOb = Integer.valueOf(x); //boxing ---> primitive int --> Integer Object

        //=========================
        Integer iOb2 = new Integer(100);
        int y = iOb2; //autoUnBoxing
        y = iOb2.intValue(); //unBoxing*/

        /*

                File f1 = new File("src/Customer.txt");
                System.out.println("f1 is exists :" +f1.exists());
                System.out.println("f1 is File :" +f1.isFile());
                System.out.println("f1 is directory :" +f1.isDirectory());
                System.out.println("f1 is Read :" +f1.canRead());
                System.out.println("f1 is write :" +f1.canWrite());
        */


        /*
        File f1 = new File("Orders.txt");
        System.out.println("f1 is exists :"+f1.exists());
        boolean isCreated = f1.createNewFile(); //IOException
        System.out.println(isCreated);
        System.out.println("f1 is exists :" +f1.exists());

*/

       /* File f1 = new File("src/photos");
        System.out.println("f1 is exists :"+f1.exists());
        boolean isDeleted = f1.delete();
        System.out.println(isDeleted);
        System.out.println("f1 is exists  :"+f1.exists());
*/


        /*
        // rename-----
        File f1 = new File("src/photos");
        f1.renameTo(new File("src/Images"));

        */

        //Io stream '
        System.out.println("Hello");
        System.out.println(System.out);
        PrintStream ps = System.out;
        ps.println("Hello");

    }
}

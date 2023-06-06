import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
       /* System.out.print("Input a char ;" );
        int code = System.in.read();
        System.out.println("Code :" +(char)code);
        */

        /*System.out.println(System.in);
        BufferedInputStream bis = (BufferedInputStream) System.in;
        Scanner input = new Scanner(bis);
        System.out.println("Input a Number :");
        int x = input.nextInt();
        System.out.println(x);*/


        FileInputStream fis = new FileInputStream("src/Customers.txt");
        int code = fis.read();
        System.out.println("Code "+(char)code);

        code = fis.read();
        System.out.println("Code "+(char)code);

        code = fis.read();
        System.out.println("Code "+(char)code);




    }
}

import java.io.*;

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

        /*

        FileInputStream fis = new FileInputStream("src/Customers.txt");
        int code = fis.read();
        System.out.println("Code "+(char)code);

        code = fis.read();
        System.out.println("Code "+(char)code);

        code = fis.read();
        System.out.println("Code "+(char)code);

*/

        /*FileReader fr = new FileReader("src/Customers.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br .readLine();
        while (line!=null){
            System.out.println(line);
            line = br .readLine();
        }*/



       InputStreamReader inputStreamReader = new InputStreamReader(System.in);
       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Input Your Name :");
        String name = bufferedReader.readLine();
        System.out.println("Name :" +name);
    }
}

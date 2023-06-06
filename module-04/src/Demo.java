import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.print("Input a char ;" );
        int code = System.in.read();
        System.out.println("Code :" +(char)code);

    }
}

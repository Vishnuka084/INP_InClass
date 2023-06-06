import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/A.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream("src/B.txt");
        int code;
        while ((code =  fileInputStream.read())!=-1){
            fileOutputStream1.write(code);
        }
    }
}

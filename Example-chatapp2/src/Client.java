import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",3000);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Hello server");
        printWriter.flush();
    }
}

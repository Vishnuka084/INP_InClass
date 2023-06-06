import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3000);/*node ,react*/
        System.out.println("Server up and running on port 3000");
        Socket connection = serverSocket.accept();
        System.out.println("Connection Established !....");
    }
}

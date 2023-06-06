import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3000);
        System.out.println("Server started");
        Socket acceptedConnection = serverSocket.accept();
        InputStreamReader inputStreamReader =  new InputStreamReader(acceptedConnection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        System.out.println("Client says ,"+str);
    }
}

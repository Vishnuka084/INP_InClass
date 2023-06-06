import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        final int PORT = 8000; //--> int->Integer , double->Double
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("server is up & Running on port :"+PORT);
        Socket socket = serverSocket.accept();


        InputStreamReader inputStreamReader = new InputStreamReader(
                socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String clientData = bufferedReader.readLine();
        System.out.println("Client says,"+clientData);
    }
}

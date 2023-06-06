package lk.ijse;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        final int PORT = 8000;
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("server is up & running on port :"+PORT);
    }
}

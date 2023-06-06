package lk.ijse;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("server is up & running on port :"+port);
    }
}

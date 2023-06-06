package lk.ijse;

import java.io.IOException;
import java.net.Socket;

public class ClientSide {
    public static void main(String[] args) throws IOException {
        final int PORT = 8000;
        Socket socket = new Socket("localhost",PORT);

        //localhost , 127.0.0.1 ,[ipv4]
    }
}

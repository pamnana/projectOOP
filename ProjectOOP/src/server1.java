
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *SERVER
 */
public class server1 {

    public static void main(String args[]) throws IOException {
        try {
            final int port = 999;
            ServerSocket server = new ServerSocket(port);
            int user = 0;
            while (server.isBound()) {
                System.out.println("Waiting for clients...");
                Socket s = server.accept();
                user++;
                System.out.println("Client connected from " + s.getInetAddress().getHostAddress());
                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
                String message = (String) ois.readObject();
                System.out.println("Message Received: " + message);
                ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                oos.writeObject("Hi Client " + message);
            }
        } catch (Exception e) {
            System.out.println("ERROR!");

        }
    }
}

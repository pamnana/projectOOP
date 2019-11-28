
import java.io.*;
import java.net.*;
import java.util.List;

public class server1 {
    public List<RealClient> rc;//list of client
    public static Profile player;
    public static void main(String args[]) throws Exception {
        String clientSentence;
        System.out.println("Waiting...");
        //System.out.println(player.getPort());
        ServerSocket welcomeSocket = new ServerSocket(player.getPort());//player.getPort());
        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            ObjectInputStream coin = new ObjectInputStream(in);
            ObjectOutputStream sout = new ObjectOutputStream(outToClient);
            System.out.println("Server wait on port ");
            clientSentence = inFromClient.readLine();
            outToClient.writeBytes("You win");
        }
    }
}

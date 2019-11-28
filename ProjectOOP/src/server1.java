import java.io.*;
import java.net.*;
public class server1 {
    
public static void main(String args[]) throws Exception {
    String clientSentence, capitalizedSentence;
    System.out.println("Waiting...");
    ServerSocket welcomeSocket = new ServerSocket(5945);//player.getPort());
    while(true) {
        
        Socket connectionSocket = welcomeSocket.accept();
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
        System.out.println("Server wait on port ");
        clientSentence = inFromClient.readLine();
        capitalizedSentence = clientSentence.toUpperCase() + '\n';
        outToClient.writeBytes(capitalizedSentence);
    }
   }
} 
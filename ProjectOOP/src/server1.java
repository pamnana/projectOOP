import java.io.*;
import java.net.*;
class server1 {
public static void main(String argv[]) throws Exception {
String clientSentence, capitalizedSentence;
ServerSocket welcomeSocket = new ServerSocket(5945);
while(true) {
Socket connectionSocket = welcomeSocket.accept();
BufferedReader inFromClient = new BufferedReader(
new InputStreamReader(connectionSocket.getInputStream()));
DataOutputStream outToClient =
new DataOutputStream(connectionSocket.getOutputStream());
clientSentence = inFromClient.readLine();
capitalizedSentence = clientSentence.toUpperCase() + '\n';
outToClient.writeBytes(capitalizedSentence);
}
}
} 
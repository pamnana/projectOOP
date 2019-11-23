// A Java program for a Client 
import java.net.*; 
import java.io.*; 

public class Clientconnection extends Thread{ 
    /*Socket  of Clients*/
    private Socket socket;
    
    /*ID of Clients*/
    private final long clientid;
    public Clientconnection(Socket client, long id)  {
        this.socket = client;
        this.clientid = id;
    }
    /**
     * Returns the id of a player depending on the Socket.
     * @return ID of player
     */
    public long getClientId()  {
        return clientid;
    }
    /**
     * Getter for the Socket.
     * @return the socket of a ClientConnection
     */
    public Socket getSocket()  {
        return socket;
    }
    /**
     * Execution of a Client Connection.
     */
    @Override
    public void run() {
        try {
            while (true) {
                receive();
            }
        } 
        catch (IOException ex) {
            try {
                socket.close();
            }
            catch (IOException io) {
                io.printStackTrace();
            }
        }
    }    
    private void receive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String answer = reader.readLine(); // gets the response of the client
        // TODO do something with it
    }
   
    
    
  public void send(String message) {
        try {
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.println(message);
            writer.flush();
        } catch (IOException e) {
            // TODO
            e.printStackTrace();
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaa
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

public class ClientStart implements Runnable{
 /**
     * Amount of milliseconds to wait before a Timeout occures.
     */
    private final static int TIMEOUT = 3000;
    /**
     * Name of the player.
     */
    private final String name;
    
    /**
     * Socket of Player.
     */
    private final Socket socket;
    
    /**
     * GUI of Client.
     */
    private Chapter2ForMP chap2;
    
    public ClientStart(Chapter2ForMP chap2, ClientConfiguration config){
        String name = config.getName();
        String ipAddr = config.getIpAddr();//edit IpAddress before start
        int port = config.getPort();
        Socket socket = null;
        System.out.println(String.format("%s wants to connect to %s:%d", name, ipAddr, port));
            boolean worked = false;  // lazy workaround
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(ipAddr, port), TIMEOUT);
            worked = true;
        } catch (SocketTimeoutException ex)  {
            chap2.dispose();
            
        } catch (IOException ex) {
            chap2.dispose();
        }

        this.socket = socket;
        this.name = name;
        this.chap2 = chap2;
        if (worked)  {
            new Thread(this).start();
            new Chapter2ForMP().setVisible(true);

        }
        // TODO send the name to the Server
    }
 /**
     * Getter for the name of the Client.
     * @return Name of Client.
     */
    public String getPlayerName()  {
        return name;
    }

    /**
     * Returns this client.
     * @return this client
     */
    public Socket getSocketOfClient()  {
        return socket;
    }
    
    /**
     * Returns the GUI of the Client.
     * @return the GUI of the Client
     */
    public Chapter2ForMP getGui()  {
        return chap2;
    }
    @Override
    public void run() {
while (true)  {
            try {
                receive();
            } catch (SocketException ex)  {
                System.out.println("Server was shut down!");
                // TODO inform client that Server shut down
                System.exit(-1);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
     * Receives a message from the Client Connection.
     * @throws IOException in case something breaks.
     */
    private void receive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String answer = reader.readLine(); // gets the response of the client
        System.out.println(answer);
        // TODO do something with it
    }
    
    /**
     * Writes a message to the Client Connection.
     * @param message Message to write.
     */
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
  

          ;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaa
 */
public class Client {
    /*Client Connection*/
    private final Clientconnection ClientConnection;
     /**
     * Time of Client in Milliseconds.
     */
    private long time = 0;
     /**
     * Protocol of the Client.
     */
    private String protocol;
    /**
     * Default Constructor.
     * @param clientConnection Client Connection to store.
     */
    public Client(Clientconnection ClientConnection)  {
        this.ClientConnection = ClientConnection;
    }
    
    /**
     * Getter for the Client Connection.
     * @return the Client Connection
     */
    public Clientconnection getClientConnection() {
        return ClientConnection;
    }
    
    /**
     * Getter for the time the Client needed.
     * @return needed time of the Client
     */
    public long getTime() {
        return time;
    }
    
    /**
     * Appends some Milliseconds to the existing time
     * @param millis time in Milliseconds to append
     */
    public long appendTime(long millis) {
        return this.time += millis;
    }
    
    /**
     * Getter for the Protocol.
     * @return the protocol of the Client
     */
    public String getProtocol() {
        return protocol;
    }
    /**
     * Appends a message to the Players Protocol.
     * @param msg Message to append
     * @return the new Protocol of the Client
     */
    public String appendToProtocol(String msg) {
        return this.protocol += protocol;
    }
    
    /**
     * Implementation of own toString-Method.
     */
    @Override
    public String toString() {
        return String.format("Client with CC '%s'", ClientConnection);
    }
}

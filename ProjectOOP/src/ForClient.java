/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaa
 */
import java.util.HashMap;
import java.util.Map;

public class ForClient {
    /**
     * Actual Client which has a Connection to the Server.
     */
    private ClientStart client = null;
    
    /**
     * Client Configuration which contains name, IP and Port.
     */
    private ClientConfiguration config = new ClientConfiguration();    
    /**
     * Scenes of the GUI.
     */
    private Map<String, Chapter2> chap2 = new HashMap<>();
    /**
     * Gets the Client which is connected to the Server. Can be <code>null</code>.
     * @return the Client which is connected to the Server
     */
    public ClientStart getClient()  {
        return client;
    }
    /**
     * Gets the Client Configuration.
     * @return the client Configuration
     */
    public ClientConfiguration getClientConfiguration()  {
        return config;
    }
    public Map<String, Chapter2> getScenes()  {
        return chap2;
    }
    public Chapter2 getScene(String key)  {
        return (chap2.containsKey(key) ? chap2.get(key) : null);
    }
    
    /**
     * Main-Method of the Hangman Client.
     * @param args Arguments
     */
    public static void main(String[] args)  {
        Chapter2 chap2 = new Chapter2();
        /*client = new ClientStart(this, config);*/
    }
}
    
    /**
     * Creates the Users GUI.
     */


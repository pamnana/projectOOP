/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaa
 */
import java.io.*;
import java.nio.file.*;
import java.util.stream.Collectors;

import org.json.JSONObject;
public class ServerConfiguration {
     /**
     * Name of Configuration File.
     */
    private final static String CONFIGNAME = "serverconfig.json";
    /**
     * Port of the Server it should listen for Clients.
     */
    private final int port;
    
    /**
     * Marks the Instance as valid or invalid.
     */
    private final boolean valid;
    
    //Default Constructor
    public ServerConfiguration() {
        String fileContent = "";
        try {
            fileContent = Files.readAllLines(Paths.get(CONFIGNAME)).stream().collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException e) {
        }
        if (!fileContent.isEmpty())  {
            JSONObject jsonContent = new JSONObject(fileContent);
            port = jsonContent.getInt("port");
            valid = true;
        }  else  {
            valid = false;
            port = -1;
        }
    }
    //Custom ConStructor
 public ServerConfiguration(int port)  {
        this.port = port;
        valid = true;
        
        JSONObject config = new JSONObject();  
        config.put("port", port);
        
        File file = new File(CONFIGNAME);
        try  {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(config.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException ex)  {
            ex.printStackTrace();
        }
    }
     /** Gets the Port the Server should listen to.
     * @return the Port the Server should listen to
     */
    public int getPort() {
        return port;
    }
    
    /**
     * Checks if an Instance of this Object is valid or invalid.
     * @return <code>true</code> if instance is valid, else <code>false</code>
     */
    public boolean isValid() {
        return valid;
    }
}

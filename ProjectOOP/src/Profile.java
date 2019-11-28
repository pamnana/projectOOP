import java.io.*;
import java.util.Random;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class Profile {
    private String name;
    private int score;
    private String ip;
    private int port;
    public Profile() {
    }

    public Profile(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    
}

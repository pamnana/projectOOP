import java.io.*;
import java.util.Random;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class Profile {
    private String name;
    private int score;

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
    
}

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
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            /*Object obj = parser.parse(new FileReader("src\\file1.txt"));
            JSONArray array = (JSONArray) obj;
            JSONObject obj2;

            Random r = new Random();
            int r_int = r.nextInt(array.size() + 1);
            obj2 = (JSONObject) array.get(r_int);*/

            //Vocab vcb1 = new Vocab((String) obj2.get("chapter"), (String) obj2.get("word"), (String) obj2.get("meaning"));
            

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

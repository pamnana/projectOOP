import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.FileWriter;
import org.json.simple.JSONObject;


public class ReaderTest {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src\\file1.txt"));
            JSONArray array = (JSONArray) obj;
            JSONObject obj2;
            for (int i = 0; i < array.size(); i++) {
                obj2 = (JSONObject) array.get(i);
                System.out.println("- คำที่ " + (i+1) + " -");
                System.out.println("Chapter : "+ obj2.get("chapter"));
                System.out.println("Set : " + obj2.get("set"));
                System.out.println("Word : " + obj2.get("word"));
                System.out.println("Meaning : " + obj2.get("meaning"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

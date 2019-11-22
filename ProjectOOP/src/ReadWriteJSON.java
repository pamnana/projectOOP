/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.io.*;
import java.util.Random;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class ReadWriteJSON {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src\\file1.txt"));
            JSONArray array = (JSONArray) obj;
            JSONObject obj2;

            Random r = new Random();
            int r_int = r.nextInt(array.size() + 1);
            obj2 = (JSONObject) array.get(r_int);

            Vocab vcb1 = new Vocab((String) obj2.get("chapter"), (String) obj2.get("word"), (String) obj2.get("meaning"));

            JSONObject obj_new = new JSONObject();
            JSONArray array_new = new JSONArray();
            obj_new.put("chapter", vcb1.getChapter());
            obj_new.put("set", vcb1.getSet());
            obj_new.put("word", vcb1.getWord());
            obj_new.put("meaning", vcb1.getMeaning());
            array_new.add(obj_new);
            
            FileWriter file = new FileWriter("src\\file2.txt");
            file.write(array_new.toJSONString());
            file.flush();
            file.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

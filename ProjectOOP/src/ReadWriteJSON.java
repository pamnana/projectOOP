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

class Vocab {

    private String chapter;
    private String set;
    private String word;
    private String meaning;

    public Vocab(String chapter, String word, String meaning) {
        this.chapter = chapter;

        this.word = word;
        this.meaning = meaning;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

}

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
            System.out.println("- คำที่ " + (r_int + 1) + " -");
            System.out.println("Chapter : " + obj2.get("chapter"));
            System.out.println("Word : " + obj2.get("word"));
            System.out.println("Meaning : " + obj2.get("meaning"));
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
            System.out.println("Success!");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

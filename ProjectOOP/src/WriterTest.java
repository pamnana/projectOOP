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
import org.json.simple.*; 

class Vocab {
    private String chapter;
    private String set;
    private String word;
    private String meaning;

    public Vocab(String chapter, String set, String word, String meaning) {
        this.chapter = chapter;
        this.set = set;
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
public class WriterTest {
    public static void main(String[] args) {
        Vocab vcb1 = new Vocab("1", "A", "iliterate", "อ่านไม่ออกเขียนไม่ได้");
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        obj.put("chapter", vcb1.getChapter());
        obj.put("set", vcb1.getSet());
        obj.put("word", vcb1.getWord());
        obj.put("meaning", vcb1.getMeaning());
        array.add(obj);
        System.out.println(array);
        
        try {
            FileWriter file = new FileWriter("src\\file2.txt");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
            System.out.println("Success!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

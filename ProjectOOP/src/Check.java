/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Check extends SingleMode {
    private String word = "Hello";
    public int len = 0;
    

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLen() {
        for(int i = 0;i<word.length();++i){
            len = i;
        }
        return len;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.io.*;
import java.net.*;
public class RealClient extends MultiMode implements Runnable{
    private Boolean alphabet;
    private PlayerName player;
    private String Pname;

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = player.getPname();
    }
    
    
    public RealClient(){
    }
    public RealClient(Boolean Var){
        this.alphabet = Var;
    }


    public Boolean getAlphabet() {
        return alphabet;
    }
    
    @Override
    public void run() {
        try{
            String sentence;
            String modifiedSentence;
            Socket clientSocket = new Socket("localhost", 5945);
            DataOutputStream outToServer = new DataOutputStream( clientSocket.getOutputStream() );
            BufferedReader inFromServer = new BufferedReader(
            new InputStreamReader(clientSocket.getInputStream()));
            if(getAlphabet()){
                sentence = "Won";
            }else{
                sentence = "Lose";
            }

            String send = sentence;
            outToServer.writeBytes(send);
            modifiedSentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + modifiedSentence);
            clientSocket.close();
        }catch(Exception e){
        }
    }
}
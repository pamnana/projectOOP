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


    public RealClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static Boolean alphabet;
    private static PlayerName player;
    private String Pname;

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = player.getPname();
    }
    
    

    public RealClient(Boolean Var){
        this.alphabet = Var;
    }


    public static Boolean getAlphabet() {
        return alphabet;
    }
    public static void main(String[] args) {
try{
            String sentence;
            String modifiedSentence;
            Socket clientSocket = new Socket(player.getPip(),5945);//player.getPip(), player.getPort());
            System.out.println("connected");
            DataOutputStream outToServer = new DataOutputStream( clientSocket.getOutputStream() );
            BufferedReader inFromServer = new BufferedReader(
            new InputStreamReader(clientSocket.getInputStream()));
            if(getAlphabet()){
                sentence = "Won";
            }else{
                sentence = "Lose";
            }

            String send = "sss";
            outToServer.writeBytes(send);
            modifiedSentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + modifiedSentence);
            clientSocket.close();
        }catch(Exception e){
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


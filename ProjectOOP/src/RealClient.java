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
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class RealClient extends MultiMode {
    

    public RealClient() {}
    private static Boolean alphabet = false;
    private static Profile player;
    private String Pname;
    private ArrayList<Profile> pnumber; //Array of Player
    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = player.getName();
    }
    
    

    public RealClient(Boolean Var){
        this.alphabet = Var;
    }


    public static Boolean getAlphabet() {
        return alphabet;
    }
    public static void main(String[] args) {
try{
           /* Object obj = parser.parse(new FileReader("src/json/player.json"));
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream oin = new ObjectInputStream(oin);
            ObjectOutputStream oout = new ObjectOutputStream(out);*/
            String sentence;
            String modifiedSentence;
            System.out.println("");
            Socket clientSocket = new Socket(player.getIp(), player.getPort());//player.getPip(), player.getPort();
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);
//            DataOutputStream outToServer = new DataOutputStream( clientSocket.getOutputStream() );
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            if(getAlphabet()){
                sentence = "Won";
            }else{
                sentence = "Lost";
                
            }
            System.out.println(getAlphabet());
            String send = "sss nng";
            outToServer.println(send);
            modifiedSentence = inFromServer.readLine();
            System.out.println("connected");
            System.out.println("FROM SERVER: " + modifiedSentence);
            clientSocket.close();
        }catch(Exception e){
        }
    }

//    @Override
    public void run() {
        
    }
    }


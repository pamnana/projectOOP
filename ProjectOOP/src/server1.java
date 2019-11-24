// A Java program for a Server 
import java.net.*; 
import java.io.*; 
import java.util.ArrayList;
import java.util.List;

public class server1 extends Thread implements Runnable{ 
    /**
     * Server Configuration which contains the Port.
     */
   /* private ServerConfiguration config = new ServerConfiguration();*/
    
    /**
     * ID of the player.
     */
    private static long playerId = 0;
    
    
    /**
     * List of Games.
     */
    private final List<Game> games = new ArrayList<>();
    
    /**
     * Initializes the Game Server and waits permanent for new Clients.
     */
    @Override
    public void run() {
        new Thread(() -> {
            int port = 5555;
            try (ServerSocket server = new ServerSocket(port)) {
                List<Clientconnection> clientlist = new ArrayList<>();
                System.out.println("Game Server waiting on Port " + port + "!");
                while (true) {
                    Socket client = server.accept();

                    synchronized (clientlist) {
                        Clientconnection cc = new Clientconnection(client, playerId);
                        int playerNr = (int) (playerId % 2) + 1;
                        cc.start();

                        clientlist.add(cc);
                        System.out.println("Client " + playerNr + " (playerID: " + playerId + ") accepted!");

                        playerId++; // increase playerId;
                        if (clientlist.size() == 2) {
                            synchronized (games) { // TODO no sync needed?
                                Game game = new Game(clientlist);
                                game.start();
                                games.add(game);
                                clientlist.clear(); // wait for two new clients
                            }
                        }
                    }
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }).start();
    } 
    public static void main(String[] args) {
         int port = Integer.parseInt("5555");
                server1 hangmanServer = new server1();
                hangmanServer.run();
                boolean cmdStart = true;
            }
        }
        

    
   


   /*public static void main(String [] args) {
      final int port = 5555;
      try {
         Thread t = new server1(port);
         t.start();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }*/

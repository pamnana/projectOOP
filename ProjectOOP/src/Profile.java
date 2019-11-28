

public class Profile {
    private String name;
    private int score;
    private String ip;
    private int port = 6789;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return 6789;
    }

    public void setPort(int port) {
        this.port = port;
    }
    
}

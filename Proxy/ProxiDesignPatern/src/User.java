/*
    This class holds basic data for a user connected to the network
    - User name
    - User given age
    - User IP address
 */

public class User {
    private String name;
    private int age;
    private String IP;

    public User(String name, int age, String IP) {
        this.name = name;
        this.age = age;
        this.IP = IP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
}

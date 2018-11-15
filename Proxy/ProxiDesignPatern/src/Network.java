import java.util.ArrayList;

/*
    Network class for getting connected users and display there user names and age
    - List of Users

    Implements INet for displayResults()
 */

public class Network implements INet {
    private ArrayList<User> users;

    // Creates a network //
    // - Gets users connected
    public Network() {
        this.users = getConnectedUsers();
    }

    // Get users connected //
    // - Hard coded for demonstration but if this was a real
    //      server this would be accessing the data base and getting
    //      connected users.
    private ArrayList<User> getConnectedUsers() {

        ArrayList<User> connected = new ArrayList<>();

        // Get users connected to network //
        connected.add(new User("user1", 15, "000.001.004"));
        connected.add(new User("user2", 25, "015.002.152"));
        connected.add(new User("user3", 42, "132.672.900"));
        connected.add(new User("user4", 154, "154.451.154"));
        connected.add(new User("user4", 999, "999.999.999"));

        // Log that users were added //
        System.out.println(connected.size() + " users were loaded to user list");

        // Return connected users //
        return connected;
    }

    @Override
    public void displayResult() {
        for (User user: this.users) {
            System.out.println(user.getName() + " is " + user.getAge() + " years old");
        }
    }
}

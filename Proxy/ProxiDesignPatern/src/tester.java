public class tester {
    public static void main(String[] args) {
        // Create a new Proxi Network //
        INet net1 = new ProxiNet();

        // Display results from network //
        // - First caller which is initialize Network
        net1.displayResult();
        System.out.println("------------------");
        // Display results from network //
        // - Second caller, does not need to initialize Network
        net1.displayResult();
    }
}

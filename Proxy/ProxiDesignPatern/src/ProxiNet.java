/*
    Implementation of a proxi design pattern
    - Implements real network
    - Creates a real network if non has been created

    Implements INet interface for displayResult()
 */

public class ProxiNet implements INet {
    private Network realNetwork = null;

    @Override
    public void displayResult() {
        if (this.realNetwork == null) {
            this.realNetwork = new Network();
        }

        realNetwork.displayResult();
    }
}

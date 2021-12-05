package atm;

public abstract class DefaultTray implements Tray {
    private Tray nextt;
    private final int money;

    public DefaultTray(int bill) {
        money = bill;
    }
    public void setNext(Tray tray) {
        this.nextt = tray;
    }

    public void process(int amount) {
        int number = amount / money;
        if (nextt != null) {
            nextt.process(amount - number* money);
        }
        else {
            if (amount - number* money != 0) {
                throw new IllegalArgumentException("Sorry but no");
            }
        }
        System.out.println("Extracted " + number + " with " + money);
    }
}

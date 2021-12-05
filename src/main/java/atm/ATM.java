package atm;

public class ATM {
    public DefaultTray root;
    public ATM() {
        DefaultTray tray20 = new Tray20();
        DefaultTray tray10 = new Tray10();
        DefaultTray tray5 = new Tray5();
        tray20.setNext(tray10);
        tray10.setNext(tray5);
        root = tray20;
        }

        public void process(int amount) {
            root.process(amount);
        }
    }

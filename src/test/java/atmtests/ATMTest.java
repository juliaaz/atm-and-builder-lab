package atmtests;
import atm.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

public class ATMTest {
    ATM atm;
    @BeforeEach
    void setUp() {
        atm = new ATM();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWrong(){
        ATM atm = new ATM();
        atm.process(1);
    }

    @Test
    public void testCorrect() {
        ATM atm = new ATM();
        atm.process(20);
    }
}

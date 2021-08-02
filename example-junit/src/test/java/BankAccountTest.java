import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test BankAccount class")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(600);
        assertEquals(900, bankAccount.getBalance());
    }
}

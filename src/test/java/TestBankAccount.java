import org.junit.jupiter.api.Test;
import org.example.BankAccount;
import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount
{
    @Test
    public void AccountMustBeUpdateAfterDepositAPositiveAmoutOfMoney()
    {
        BankAccount account = new BankAccount(100, 0.01);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void ThrowExceptionIfWeDepositNegativeValueOfAmount() {
        BankAccount account = new BankAccount(100, 0.01);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }

    @Test
    public void TheSoldStaysTheSameAfterDepositZeroMoney()
    {
        BankAccount account = new BankAccount(100, 0.01);
        account.deposit(0);
        assertEquals(100, account.getBalance());
    }



    @Test
    public void AccountMustBeUpdateAfterWithdrawAnAmoutOfMoney() {
        BankAccount account = new BankAccount(100, 0.01);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void ThrowExceptionIfWithdrawANegativeValueOfAmount() {
        BankAccount account = new BankAccount(100, 0.01);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50));
    }

    @Test
    public void ThrowExceptionIfWithdrawAnAmoutGreaterThanTheBalance() {
        BankAccount account = new BankAccount(100, 0.1);
        assertThrows(IllegalStateException.class, () -> account.withdraw(200));
    }

    @Test
    public void VerifyTheBalanceOfEachAccountAfterTheTransfert() {
        BankAccount account1 = new BankAccount(100, 0.01);
        BankAccount account2 = new BankAccount(50, 0.02);

        account1.transfer(25, account2);
        assertEquals(75, account1.getBalance());
        assertEquals(75, account2.getBalance());
    }

    @Test
    public void ThrowExceptionIfTheTargetAccountDosentExist() {
        BankAccount account1 = new BankAccount(100, 0.05);

        assertThrows(NullPointerException.class, () -> account1.transfer(25, null));
    }

    @Test
    public void ThrowExceptionIfWeTransfertAmoutGreaterThanOurBalance() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(50, 0.05);

        assertThrows(IllegalStateException.class, () -> account1.transfer(200, account2));
    }

    @Test
    public void ThrowExceptionIfWeTransfertNegativeAmout() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(50, 0.05);

        assertThrows(IllegalArgumentException.class, () -> account1.transfer(-25, account2));
    }

    @Test
    public void UpdateBalanceAfterAddingInterest() {
        BankAccount account = new BankAccount(100, 0.05);

        account.addInterest();
        assertEquals(105, account.getBalance());
    }
}

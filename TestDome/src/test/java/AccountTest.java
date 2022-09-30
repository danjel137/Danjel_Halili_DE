import accountTest.Account;
import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
    @Test
    public void AccountCannotOverstepOverdraftLimit(){
        Account account = new Account(20);
        Assert.assertFalse(account.withdraw(30));
    }
    @Test
    public void withdrawCorrectAmount(){
        Account account = new Account(20);
        account.deposit(20);
        account.withdraw(20);
        Assert.assertTrue(account.getBalance() == 0.0);
    }
    @Test
    public void depositCorrectAmount(){
        Account account = new Account(20);
        account.deposit(20);
        Assert.assertTrue(account.getBalance() == 20.0);
    }
    @Test
    public void withdrawReturnCorrectResult(){
        Account account = new Account(20);
        Assert.assertTrue(account.withdraw(20));
    }
    @Test
    public void depositReturnCurrectResult(){
        Account account= new Account(20);
        Assert.assertTrue(account.deposit(20));
    }
}

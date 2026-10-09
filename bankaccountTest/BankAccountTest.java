import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {





        @Test
        public void TestThatNameFieldIsTheSameInAccount(){
            BankAccount account = new BankAccount("tam",2345);
            account.setName("rose");
            assertEquals("rose",account.getName());
        }

        @Test
        public void TestThatDeositAddsToTheBalance(){
            BankAccount account = new BankAccount("jam",2345);
            account.deposit(5000);
            assertEquals(5000,account.getBalance(2345));

        }

        @Test
        public void TestTThatIfDepositLessThanZeroBalanceIsZero(){
            BankAccount account = new BankAccount("jam",2345);

            account.deposit(-5000);
            assertEquals(0.0,account.getBalance(2345));
        }

        @Test
        public void TestThatWithdrawWorks(){
            BankAccount account = new BankAccount("jam",2345);
            account.deposit(5000);
            account.withdraw(2400,2345);
            assertEquals(2600,account.getBalance(2345));
        }

    }


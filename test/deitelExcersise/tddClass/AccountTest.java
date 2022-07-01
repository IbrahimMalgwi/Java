package deitelExcersise.tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    @DisplayName("Deposit money, balance increases test")
    public void depositMoneyBalanceIncreasesTest(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(500);
        //check
        assertEquals(500, jennyAccount.getBalance());

    }

    @Test
    @DisplayName("Deposit money, balance increases test")
    public void depositMoneyAbove500BalanceIncreasesTest(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(500);
        //check
        assertEquals(600, jennyAccount.getBalance());
    }

    @Test
    public void depositMoneytwiceBalanceIncreasesTest(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(600);
        jennyAccount.deposit(500);
        //check
        assertEquals(1100, jennyAccount.getBalance());

    }

    //todo create test for nagative deposit
    @Test
    public void depositNagagativeAmountBalanceIncreasesTest(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(-600);
        //check
        assertEquals(1100, jennyAccount.getBalance());

    }

    @Test
    public void withdrawWorkstest(){
        //given
        Account jennyAccount = new Account();
        int amount;
        jennyAccount.deposit(3000);
        //when
        jennyAccount.withdraw(2000);
        //check
        assertEquals(3000, jennyAccount.getBalance());


    }

}

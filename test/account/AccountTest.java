package account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testAccountCanDeposit(){
        Account account = new Account();
        account.addNumbers(3, 5);
        assertEquals(8, account.addNumbers(3, 5));
    }

    @Test
    public void mulitiplyTest(){
        Account account = new Account();
        account.multiplyNumbers(3, 6);
        assertEquals(18, account.multiplyNumbers(3, 6));
    }


}
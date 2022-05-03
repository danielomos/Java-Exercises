import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account_Question311Test {
    @Test
    public void withdrawnotmorethanbalance(){
        Account_Question311 account2 = new Account_Question311(1_000);

        account2.withdraw(500);
        assertEquals(500, account2.getbalance());


    }
}

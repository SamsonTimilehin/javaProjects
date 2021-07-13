package africa.semicolon.mp3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.Customizer;
import java.security.KeyStore;

import static org.junit.jupiter.api.Assertions.*;

class AtmTest{

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void customer_acct_is_funded(){
        CustomerAccount myAccount = new CustomerAccount();
         myAccount.deposit(400.00);
          assertEquals(400.00, myAccount.getAcountBalance());
    }
    @Test
    void zeroNairaOrNegativeNumberCannotBeDeposited(){
        CustomerAccount myAccount= new CustomerAccount();
        myAccount.deposit(-1.00);
        System.out.println(myAccount.getAcountBalance());
        assertTrue(myAccount.getAcountBalance() != -1.00);

    }
    @Test
    void account_can_withdraw_money() {
     CustomerAccount myAccount= new CustomerAccount();
       myAccount.deposit(400.00);
     myAccount.withdraw(200);
     assertTrue(200 == myAccount.getAcountBalance());

    }
}
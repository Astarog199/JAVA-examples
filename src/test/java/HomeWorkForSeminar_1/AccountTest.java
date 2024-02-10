package HomeWorkForSeminar_1;


import HomeWork.HomeWorkForSeminar_1.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountTest {
    LocalDate today = LocalDate.of(2022, 12, 10);

    @Test
    void testAmountAfterCreate(){
        Account account = new Account(today);
        Assertions.assertEquals(BigDecimal.valueOf(0.0), account.getAmount());
    }

    @Test
    void testAmountAfterPut(){
        Account account = new Account(today);
        BigDecimal balanceBeforePut = account.getAmount();

        account.putAmount(BigDecimal.valueOf(150));
        Assertions.assertEquals(balanceBeforePut.add(BigDecimal.valueOf(150.0)), account.getAmount());
    }

    @Test
    void  testAmountAfterTake() {
        Account account = new Account(today);
        account.putAmount(BigDecimal.valueOf(1000.0));
        BigDecimal balance = account.getAmount();

        account.takeAmount( BigDecimal.valueOf(150.0));
        Assertions.assertEquals(balance.subtract(BigDecimal.valueOf(150.0)), account.getAmount());
    }

    @Test
    void testThrowExceptionWhenAmountIsNegative(){
        Account account = new Account(today);
        account.putAmount(BigDecimal.valueOf(1000.0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.takeAmount(BigDecimal.valueOf(-1)));

//        try {
//            account.takeAmount(BigDecimal.valueOf(-1));
//            Assertions.fail();
//        }catch (IllegalArgumentException e){
//        }
    }
}

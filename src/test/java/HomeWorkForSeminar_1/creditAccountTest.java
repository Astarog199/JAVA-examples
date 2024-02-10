package HomeWorkForSeminar_1;

import HomeWork.HomeWorkForSeminar_1.CreditAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class creditAccountTest {
    LocalDate today = LocalDate.of(2022, 12, 10);
    @Test
    void  test(){
    CreditAccount creditAccount= new CreditAccount(today);
        creditAccount.takeAmount(BigDecimal.valueOf(1500.0));

        Assertions.assertTrue(BigDecimal.valueOf(8485.0).compareTo(creditAccount.getAmount())==0);
    }
}

package HomeWork.HomeWorkForSeminar_1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2022, 12, 10);
        LocalDate now = LocalDate.now();
        long monthBetweenTodayAndNow = ChronoUnit.MONTHS.between(today, now); // количество месяцев между today и now


        Account account = new Account(today);
        account.putAmount(BigDecimal.valueOf(10000));
        account.takeAmount(BigDecimal.valueOf(1500));
        System.out.println(account);

        System.out.println();

        CreditAccount creditAccount= new CreditAccount(today);
        creditAccount.takeAmount(BigDecimal.valueOf(1500));
        System.out.println(creditAccount);

        System.out.println();

        DepositAccount depositAccount = new DepositAccount(today, monthBetweenTodayAndNow);
        depositAccount.putAmount(BigDecimal.valueOf(10000.0));
        depositAccount.takeAmount(1500.0);
        System.out.println(depositAccount);

    }
}

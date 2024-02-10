package HomeWork.HomeWorkForSeminar_1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DepositAccount extends Account {
    private long monthBetweenTodayAndNow;

    public DepositAccount(LocalDate OpeningDate, long monthBetweenTodayAndNow, BigDecimal amount) {
        super(OpeningDate, amount);
        this.monthBetweenTodayAndNow = monthBetweenTodayAndNow;
    }

    public DepositAccount(LocalDate OpeningDate, long monthBetweenTodayAndNow) {
        this(OpeningDate, monthBetweenTodayAndNow, BigDecimal.valueOf(0));
    }


    public void takeAmount(double sum) {
        if (monthBetweenTodayAndNow>1) {
            super.takeAmount(BigDecimal.valueOf(sum));
        } else {
            System.out.println("Приходите через месяц");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
package Examples.Classes.Ex_bankingApp;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.math.BigDecimal.*;

public class CreditAccount extends Account {

    private double percent;

    public CreditAccount(LocalDate OpeningDate, BigDecimal amount, double percent){
        super(OpeningDate, amount);
        this.percent=percent;
    }

    public CreditAccount(LocalDate OpeningDate){
        this(OpeningDate, valueOf(10000.0), 1.0);
    }

    @Override
    public void takeAmount(BigDecimal sum) {
        BigDecimal creditSum = sum.add(sum.multiply(valueOf(percent/100)));
        super.takeAmount(creditSum);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

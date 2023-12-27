package HomeWorkForSeminar_1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {

    private final LocalDate OpeningDate;
    private BigDecimal amount = BigDecimal.ZERO;
    BigDecimal sum;



    public Account(LocalDate OpeningDate){
        this (OpeningDate, BigDecimal.valueOf(0.0));
    }

    public Account(LocalDate OpeningDate, BigDecimal sum){
        this.OpeningDate = OpeningDate;
        putAmount(sum);

    }


    /**
     * Метод возвращает объём средств на счёте
     * @return кол-во средств
     */
    public BigDecimal getAmount(){
        return amount;
    }

    /**
     * Метод пополнения счёта
     */
    public void putAmount(BigDecimal sum) {
        if(sum.compareTo(BigDecimal.valueOf(-0.01))<0){
            throw new IllegalArgumentException("Error: проверьте сумму.");
        }
        this.amount = amount.add(sum);
    }

    /**
     * Метод снятия счёта
     */
    public void takeAmount(BigDecimal sum){
        if(sum.compareTo(BigDecimal.valueOf(-0.01))<0){
            throw new IllegalArgumentException("Error: проверьте сумму.");
        }
        if(amount.compareTo(sum)>0) {
            this.amount =amount.subtract(sum);
        }else{
//            System.out.println("Error: На вашем счёте недостаточно средств.");
            throw new IllegalArgumentException("Error: На вашем счёте недостаточно средств.");
        }
    }

    @Override
    public String toString() {
        return String.format("дата открытия счёта: %s\nколичество средств на счёте %s",OpeningDate, getAmount());
    }
}

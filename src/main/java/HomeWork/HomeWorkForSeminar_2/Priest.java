package HomeWork.HomeWorkForSeminar_2;

import java.util.Random;

public class Priest extends Hero {
    private int mana;
    private String classHero;

    public Priest (String name, int mana, String classHero){
        super(name);
        this.mana = mana;
        this.classHero = classHero;
    }

    public Priest (String name){
        this(name, 100, "Жрец");

    }

    @Override
    public void die() {
        System.out.println("жрец молится");
    }

    public void MinorHealing(Hero target){
        Random random = new Random();
        int heal = random.nextInt(10,25);
        target.GetHealing(heal);
    }

    @Override
    public String toString() {
        return String.format("\nclass: %s",this.classHero + super.toString());
    }

}

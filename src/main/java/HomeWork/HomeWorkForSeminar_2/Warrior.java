package HomeWork.HomeWorkForSeminar_2;

public class Warrior extends Hero {


    private  String classHero;
    public Warrior(String name,String classHero ){
        super(name);
        this.classHero =classHero;

    }
    public Warrior(String name){
        this(name,"Воин" );
    }


    @Override
    public void meleeAttack(Hero target) {
        super.meleeAttack(target);
    }

    @Override
    public void die() {
        System.out.println(String.format("%s: %s, умер", classHero, getName()));
    }

    @Override
    public String toString() {
        return String.format("\nclass: %s",this.classHero + super.toString());

    }
}

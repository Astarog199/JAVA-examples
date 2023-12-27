package HomeWorkForSeminar_2;


import java.util.Random;

/**
 * Базовый класс Hero
 */
public abstract class Hero implements Experience, HeroLeveling {
    private final String name;
    private int level;
    private int maxExperience;
    private int experience;
    private int health;
    private int maxHealth;

    private Hero.State state;

    enum State {
        living, dead
    }

    public Hero(String name) {
        this(name, 1, 1000, 800, 100, 100);
    }

    /**
     * Конструктор
     *
     * @param name       имя персонажа
     * @param level      уровень героя
     * @param experience количество опыта
     * @param health     количество здоровья
     * @param maxHealth  максимальный объём здоровья
     */
    public Hero(String name, int level, int maxExperience, int experience, int health, int maxHealth) {
        this.name = name;
        this.level = level;             // текущий уровень (число)
        this.maxExperience = maxExperience;       // кол-во опыта, необходимое для достижения нового уровня
        this.experience = experience;
        this.health = health;
        this.maxHealth = maxHealth;
        this.state = Hero.State.living;
    }

    public void meleeAttack(Hero target) {
        if(target.getStatus() == State.living) {
            Random random = new Random();
            int damage = random.nextInt(100) + 1;
            target.GetDamage(damage);
            if(target.getStatus() == State.dead){
                setCurrentExpeirence(250);
                setCurrentLevel();
            }
        }else {
            System.out.println("Цель мертва: Атаковать невозможно");
        }
//        System.out.println(target.getStatus() == State.dead);
    }

    public void GetDamage(int damage) {
        if (this.health > 1) {
            if ((this.health - damage > 0)) {
                this.health -= damage;
            } else {
                this.health -= damage;
                die();
                this.state = State.dead;
            }
        }
    }

    public abstract void die();

    public State getStatus(){
        return state;
    }

    public void GetHealing(int healing) {
        if (this.health > 0) {
            if ((healing + this.health) > maxHealth) {
                this.health = maxHealth;
                System.out.println(maxHealth);
            } else {
                this.health += healing;
            }
        }else {
            System.out.println("Цель мертва: Лечение невозможно");
        }
    }



    public String getName() {
        return name;
    }

    @Override
    public int getExpeirence() {
        return 0;
    }

    /**
     *
     * @return текущий уровень
     */
    @Override
    public int getCurrentLevel() {
        return level;
    }

    /**
     *
     * @return кол-во опыта на текущем уровне
     */
    @Override
    public int getCurrentExpeirence() {
        return experience;
    }

    @Override
    public int getLevelExpeirence() {
        return maxExperience-experience;
    }

    @Override
    public void setCurrentLevel() {
        if(experience >= maxExperience){
            experience -=maxExperience;
            this.level++;
        }
    }

    @Override
    public void setCurrentExpeirence(int exp) {
        experience += exp;
    }

    @Override
    public String toString() {
        return String.format("\nName: %s\nLevel:%s\nState:%s\nHealth:%s\nexperience:%s", getName(), level, state, health, experience);
    }
}

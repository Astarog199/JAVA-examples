package HomeWorkForSeminar_2;

public class ProcessingLeveling {

    public void addExp(Experience experience){
        System.out.println("+" + experience.getExpeirence() + "XP");
    }

    public void stateLevel(HeroLeveling heroLeveling){
        System.out.println("Уровень: " + heroLeveling.getCurrentLevel() +
                "Кол-во опыта: " + heroLeveling.getCurrentExpeirence() +
                "\n до следующего уровня осталось " + heroLeveling.getLevelExpeirence() );
    }
}

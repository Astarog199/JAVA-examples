package HomeWorkForSeminar_2;

/**
 * Представьте, что вы разработчик какой-то компьютерной игры.
 * Вам поручили реалзовать механизм "прокачки" вашего игрового персонажа.
 * Необходимо разработать класс-хендлер, который срабасывает на разных событиях,
 * которые ведут к повышению уровня опыта.
 *
 * У каждого обладателя опыта есть 3 параметра:
 * 1. текущий уровень (число)
 * 2. кол-во опыта, необходимое для достижения нового уровня
 * 3. кол-во опыта, добытого на текущем уровне
 *
 * Какие нужны классы и интерфейсы для реализации данной фичи?
 * 1. Интерфейс, описывающий наличие очков опыта и возможности прокачки. У него должны быть методы:
 * 1.1 int getCurrentLevel() - текущий уровень
 * 1.2 int getCurrentExpeirence() - кол-во опыта на текущем уровне
 * 1.3 int getLevelExpeirence() - кол-во опыта, необходимое для достижения следующего уровня
 * 1.4 void setCurrentLevel(int level) - обновляет текущий уровень
 * 1.4 void setCurrentExpeirence(int exp) - обновляет текущее количество очков опыта на текущем уровне
 *
 * 2. Интерфейс, отражающий событие, которое приводит к увеличению опыта У него должны быть метод:
 * 2.1 int getExpeirence() - кол-во очков опыта для зачисления, которое дает данное событие
 *
 * 3. Класс-обработчик, который принимает интерфейсы из пунктов 1 и 2, и обновляет объекту интерфейса 1 очки опыта (и, возможно, поднимает текущий уровень).
 *
 * PS Для полного понимания контекста рекомендуется посмотреть запись семинара от 11 декабря 2023.
 */

public class main {
    public static void main(String[] args) {
        ProcessingLeveling processingLeveling = new ProcessingLeveling();
        Hero hero = new Warrior("Рено Могрейн");
        Hero hero2 = new Priest("Вайтмейн");
        hero.meleeAttack(hero2);
        hero.meleeAttack(hero2);
        hero.meleeAttack(hero2);


        System.out.println();
        processingLeveling.stateLevel(hero);

        System.out.println();

        System.out.println(hero2);

        System.out.println();
        ((Priest) hero2).MinorHealing(hero2);

        System.out.println();
        System.out.println(hero);


    }
}

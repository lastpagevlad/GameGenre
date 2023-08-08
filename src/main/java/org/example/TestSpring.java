package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        RolePlay rolePlay = context.getBean("roleBean", RolePlay.class); //проверка фабричного метода(ролплей приватный, поэтому создание объекта без new)
        System.out.println(rolePlay.getGame());


        GameGenre gameGenre = context.getBean("gamePlay", GameGenre.class); //объект получает значение игры
        gameGenre.GamePlay();
        System.out.println(gameGenre.getDuration()); //вывод продолжительности
        System.out.println(gameGenre.getName()); //вывод названия

        GameGenre gameGenre2 = context.getBean("gamePlay", GameGenre.class);
        gameGenre2.GamePlay();

        boolean comp = gameGenre==gameGenre2; //является ли одним и тем же объекирм
        System.out.println(comp);

        GameGenre gameGenre1 = context.getBean("gameList", GameGenre.class); //объект получает значение списка игр из бинов
        gameGenre1.showGenreList(); //вывод списка


         context.close();
    }
}

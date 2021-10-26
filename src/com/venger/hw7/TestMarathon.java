package com.venger.hw7;

/*
6. Создайте два массива: с участниками и препятствиями.
7. Каждый элемент из массива с участниками должен пройти каждое препятствие из массива с препятствиями.
8. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
Если участник не смог пройти одно из препятствий,то к следующему он не приступает (полностью выбывает из участия в серии препятствий).
9. * Результат выполнения участником конкретного препятствия выводить в консоль.
Например: "Участник[ИМЯ] прошел препятствие[НАЗВАНИЕ] на дистанции[ЗНАЧЕНИЕ]"
"Участник[ИМЯ] не прошел препятствие[НАЗВАНИЕ] на дистанции[ЗНАЧЕНИЕ]. Пройдено[ЗНАЧЕНИЕ]"
 */

import com.venger.hw7.let.Obstacle;
import com.venger.hw7.let.Treadmill;
import com.venger.hw7.let.Wall;
import com.venger.hw7.participant.Athletes;
import com.venger.hw7.participant.Cat;
import com.venger.hw7.participant.Human;
import com.venger.hw7.participant.Robot;

public class TestMarathon {
    public static void main(String[] args) {
        Athletes human = new Human("Alex", 2000, 1000);
        Athletes robot = new Robot("Alice", 1500, 2500);
        Athletes cat = new Cat("Maxim", 800, 70);

        Obstacle obstacle = new Wall("barrier", 90);
        Obstacle obstacle1 = new Wall("barrier", 1500);
        Obstacle obstacle2 = new Wall("barrier", 1200);
        Obstacle obstacle3 = new Treadmill("treadmill", 800);

        Athletes[] gamers = {human, cat, robot};
        Obstacle[] let = {obstacle, obstacle1, obstacle2, obstacle3};

        playMarathon(gamers, let);
    }

    public static void playMarathon(Athletes[] gamers, Obstacle[] let) {
        for (int i = 0; i < let.length; i++) {
            for (int j = 0; j < gamers.length; j++) {
                if (gamers[j].isSuccess()) {
                    System.out.println(let[i].overcome(gamers[j]));
                }
            }
        }
    }
}

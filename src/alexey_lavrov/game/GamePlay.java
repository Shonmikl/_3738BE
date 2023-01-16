package alexey_lavrov.game;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * 1. 10 игроков
 * 2. Каждый играет с каждым
 * 3. Видно кто с кем играет/победитель/проигравший
 * 4. При одинаковых очках лидеров играют повторно.
 * 5. Выбор Action -> Random
 * 6. Main() только один метод который принимает список игроков
 * 7. ничья 0,5 / победа 1 / поражение 0
 * 8. Использовать Semaphore
 */
public class GamePlay {
    public static void go(int playerCount) throws InterruptedException {
        Exchanger<Person> exchanger = new Exchanger<>();
        List<Person> players = PersonBuilder.generate(playerCount, exchanger);
        System.out.println("START");

        play(players);
        System.out.println(players);
        List<Person> winners =
                players.stream()
                        .collect(Collectors.groupingBy(Person::getScore))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByKey())
                        .stream().reduce((doubleListEntry, doubleListEntry2) -> doubleListEntry)
                        .get()
                        .getValue();
        if (winners.size() > 1) {
            System.out.println("PreFinal::::" + winners + ":::::::::::");
            play(winners);
        }
        System.out.println("Winn: ||||||||||||| " + winners.stream().max(Comparator.comparingDouble(Person::getScore)) + " ||||||||||||||||");
    }

    private static void play(List<Person> players) throws InterruptedException {
        ExecutorService es;
        for (int i = 0; i < players.size() - 1; i++) {
            for (int j = i + 1; j < players.size() ; j++) {
                System.out.println("New Round: " + players.get(i).getFirstName() + ":: Score = " + players.get(i).getScore() +"  VS  "+ players.get(j).getFirstName() + ":: Score = " + players.get(j).getScore()) ;
                es = Executors.newFixedThreadPool(2);
                es.execute(players.get(i));
                es.execute(players.get(j));
                es.shutdown();
                es.awaitTermination(1, TimeUnit.DAYS);
                System.out.println("Play: " + players.get(i).getFirstName() + ":: Score = " + players.get(i).getScore() +"  VS  "+ players.get(j).getFirstName() + ":: Score = " + players.get(j).getScore()) ;
                System.out.println("---------------------------------------------------------------");
            }
            System.out.println("--------------|| Player: " + players.get(i).getFirstName() + " is Finish ||---------------");
        }

    }
}
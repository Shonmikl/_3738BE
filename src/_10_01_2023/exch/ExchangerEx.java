package _10_01_2023.exch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

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
public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> anotherPersonList = new ArrayList<>();

        anotherPersonList.add(Action.SCISSORS);
        anotherPersonList.add(Action.PAPER);
        anotherPersonList.add(Action.STONE);

        List<Action> myActionList = new ArrayList<>();

        myActionList.add(Action.PAPER);
        myActionList.add(Action.STONE);
        myActionList.add(Action.STONE);

        new Person("Alexey Ivan", anotherPersonList, exchanger);
        new Person("Mikhail", myActionList, exchanger);
        new Person("Test", myActionList, exchanger);
        new Person("Test2", myActionList, exchanger);

    }
}

enum Action {
    STONE,
    SCISSORS,
    PAPER
}

class Person extends Thread {
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public Person(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action anotherAction) {
        if(myAction == Action.STONE && anotherAction == Action.SCISSORS
        || myAction == Action.SCISSORS && anotherAction == Action.PAPER
        || myAction == Action.PAPER && anotherAction == Action.STONE) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myAction) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
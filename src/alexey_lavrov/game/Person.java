package alexey_lavrov.game;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Exchanger;

@Getter
@Setter
class Person extends Thread {
    private String firstName;
    private Action action;
    private Exchanger<Person> exchanger;

    private Double score = 0.0;

    public Person(String name, Exchanger<Person> exchanger) {
        this.firstName = name;
        this.exchanger = exchanger;
    }

    private double whoWins(Person player1, Person player2) {

        if (player1.getAction() == player2.getAction()) {
            return 0.5;
        } else if (player1.getAction() == Action.STONE && player2.getAction() == Action.SCISSORS
                || player1.getAction() == Action.SCISSORS && player2.getAction() == Action.PAPER
                || player1.getAction() == Action.PAPER && player2.getAction() == Action.STONE) {
            return 1.0;
        }
        return 0;

    }

    public synchronized void addScore(Double add) {
        this.score += add;
    }

    public void run() {
        Person player2;
        try {
            setAction(Action.randomAction());
            player2 = exchanger.exchange(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addScore(whoWins(this, player2));

    }

    @Override
    public String toString() {
        return "Person{ " + getFirstName() + ":" + getScore() + "}";
    }
}
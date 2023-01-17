package HW_2023.StoneScissorsPaper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Exchanger;

@AllArgsConstructor
@Getter
@Setter
public class Person extends Thread {
    private String namenick;
    private Action action;
    private Exchanger<Action> exchanger;
    double count = 0;

    public void setNamenick(String namenick) {
        this.namenick = namenick;
    }

    public String getNamenick() {
        return namenick;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    public void setExchanger(Exchanger<Action> exchanger) {
        this.exchanger = exchanger;
    }

    public Exchanger<Action> getExchanger() {
        return exchanger;
    }

    public Person(String namenick, Action action, double count, Exchanger<Action> exchanger) {
        this.namenick = namenick;
        this.action = action;
        this.count = count;
        this.exchanger = exchanger;
        this.start();
    }

    public Action getRandomAction() {
        int random = (int) (Math.random() * Action.values().length);
        return Action.values()[random];
    }

    public static double whoWins(Action[]myAction, Action[]otherAction) {
        double count = 0;
        myAction = Action.values();
        otherAction = Action.values();
        if (myAction == otherAction)
            count = count + 0.5;
        if (myAction == new Action[]{Action.STONE} && otherAction == new Action[]{Action.SCISSORS}
                || myAction == new Action[]{Action.SCISSORS} && otherAction == new Action[]{Action.PAPER}
                || myAction == new Action[]{Action.PAPER} && otherAction == new Action[]{Action.STONE})
            count = count + 1;
        return count;
    }
    public void run() {
        Action reply;
        for (int i = 0; i < ; i++) {
            
        }{
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
package alexey_lavrov.game;

import java.util.List;
import java.util.Random;

enum Action {
    STONE,
    SCISSORS,
    PAPER;

    private static final List<Action> VALUES =
            List.of(values());
    private static final int SIZE = 3;
    private static final Random RANDOM = new Random();

    public static Action randomAction()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
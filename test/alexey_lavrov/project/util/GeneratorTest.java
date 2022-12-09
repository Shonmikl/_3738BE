package alexey_lavrov.project.util;

import alexey_lavrov.project.models.Bee;
import alexey_lavrov.project.models.Queen;
import alexey_lavrov.project.models.WorkerBee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

    @Test
    void makeBee() throws Exception {
        Bee bee = Generator.makeBee(Queen.class);
        assertTrue( bee instanceof Queen);
        Bee bee2 = Generator.makeBee(WorkerBee.class);
        assertTrue( bee2 instanceof WorkerBee);
    }
}
package alexey_lavrov.project.util;

import alexey_lavrov.project.models.AdultWorkerBee;
import alexey_lavrov.project.models.Bee;
import alexey_lavrov.project.models.WorkerBee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GeneratorTest {

    @Test
    void makeBee() throws Exception{
        Bee bee = Generator.makeBee(AdultWorkerBee.class);
        assertTrue( bee instanceof AdultWorkerBee);
        assertTrue(bee.getName() instanceof String);
        assertTrue(bee.getSize() instanceof Float);
        assertTrue(bee.getBirthday() instanceof Date);
        assertTrue(bee.getId() instanceof Integer);
        assertTrue(bee.getName() instanceof String);
        Bee bee2 = Generator.makeBee(WorkerBee.class);
        assertTrue( bee2 instanceof WorkerBee);
    }

    @Test
    void makeBeeWithException() {
        assertThrows(RuntimeException.class, (Executable) Generator.makeBee(Bee.class));
    }
}
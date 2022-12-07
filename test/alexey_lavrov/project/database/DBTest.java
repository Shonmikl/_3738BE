package alexey_lavrov.project.database;

import alexey_lavrov.project.models.Bee;
import alexey_lavrov.project.models.Drone;
import alexey_lavrov.project.models.Queen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DBTest {
    DB db = new DB();
    Bee firstBee = new Queen(1, "First");
    @BeforeEach
    public void init() {
        db.addBeeToHive(1, firstBee);
        db.addBeeToHive(2, new Bee(2, "Second"));
        db.addBeeToHive(3, new Drone(3, "Third"));
    }
    @Test
    void addBeeToHive() {
        db.addBeeToHive(4, new Bee(4,"New Bee"));
        assertEquals(4, db.getCountBeeInHive());
    }

    @Test
    void getNumberByBee() {
        assertEquals(1,db.getNumberByBee(firstBee));
    }

    @Test
    void catchBeeFromHive() {
        assertEquals(1, db.catchBeeFromHive(firstBee));
    }

    @Test
   void getArrayOfClasses() {
        assertArrayEquals(Arrays.stream(new String[]{"Bee","Queen","Drone"}).sorted().toArray(),db.getArrayOfClasses());
    }

    @Test
    void sendBeeToRest() {
    }

    @Test
    void getRestedBee() {
    }

    @Test
    void getTiredBee() {
    }
}
package alexey_lavrov.project.util;

import alexey_lavrov.project.models.Bee;
import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

@UtilityClass
public class Generator {

    public static <B extends Bee> B makeBee(Class<B> cls)  {
        Random rnd = new Random();
        Faker faker = new Faker();
        try {
            Constructor<B>  beeConstructor= cls.getDeclaredConstructor(Integer.class, String.class);
            B bee = beeConstructor.newInstance(rnd.nextInt(100),faker.address().firstName());
            bee.setBirthday(faker.date().birthday());
            bee.setSize(rnd.nextFloat());
            bee.setIsInHouse(rnd.nextBoolean());
            return bee;
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
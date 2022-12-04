package alexey_khudoshin.motorradProject.util;

import com.github.javafaker.Faker;
import motorradProject.model.Motorrad;

import java.lang.reflect.Constructor;
import java.util.Random;

public class Generator {
    public static <M extends Motorrad> M makeMoto(Class<M> cls) throws Exception {
        Random rnd = new Random();
        Faker faker = new Faker();
        Constructor<M> motoConstructor = cls.getDeclaredConstructor(Integer.class, String.class);
        M moto = motoConstructor.newInstance(rnd.nextInt(1000), faker.address().firstName());
        moto.setMaxSpeed(faker.number().numberBetween(100, 350));
        moto.setVolume((int) rnd.nextFloat());

        return moto;
    }
}

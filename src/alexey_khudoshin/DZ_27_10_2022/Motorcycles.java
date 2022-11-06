package alexey_khudoshin.DZ_27_10_2022;

import java.util.ArrayList;
import java.util.List;

public class Motorcycles {
    private String name;
    int power;
    private String color;
    private int engineVolume;
    private int speed;

    public Motorcycles(String name, int power, String color, int engineVolume, int speed) {
        this.name = name;
        this.power = power;
        this.color = color;
        this.engineVolume = engineVolume;
        this.speed = speed;

    }

    @Override
    public String toString() {
        return "Motorcycles{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                ", speed=" + speed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

//    public static <mot1> void main(String[] args) {
//        String Ural = new String();
//        String green = new String();
//        mot1 Motorcycles = new Motorcycles(Ural, 36, green, 650, 105);
//    }
//
//    public static <mot2>void main(String[] args) {
//        String Jawa = new String();
//        String red = new String();
//        mot2 Motorcycles = new Motorcycles(Jawa, 18, red, 350, 150);

    public static void main(String[] args) {
        List<Motorcycles> list = new ArrayList<>();
        private String Ural, Jawa, MT9, MT10, MT11, IZhPlaneta2, IZhPlaneta3, IZhPlaneta5, IZhPlanetaSport;
        private String green, red, blue, orange, black, cherry;
        Motorcycles mot1 = new Motorcycles(Ural, 36, green, 650, 105);
        Motorcycles mot2 = new Motorcycles(Jawa, 36, red, 350, 150);
        Motorcycles mot3 = new Motorcycles(MT9, 30, black, 650, 95);
        Motorcycles mot4 = new Motorcycles(MT10, 36, cherry, 650, 100);
        Motorcycles mot5 = new Motorcycles(MT11, 36, black, 650, 95);
        Motorcycles mot6 = new Motorcycles(IZhPlaneta2, 15, blue, 350, 90);
        Motorcycles mot7 = new Motorcycles(IZhPlaneta3, 16, red, 350, 100);
        Motorcycles mot8 = new Motorcycles(IZhPlaneta5, 18, red, 350, 110);
        Motorcycles mot9 = new Motorcycles(IZhPlanetaSport, 20, orange, 350, 140);
        list.add(mot1);
        list.add(mot2);
        list.add(mot3);
        list.add(mot4);
        list.add(mot5);
        list.add(mot6);
        list.add(mot7);
        list.add(mot8);
        list.add(mot8);

    }
}

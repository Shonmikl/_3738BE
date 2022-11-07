package alexey_khudoshin.DZ_08_11_2022;

import java.util.*;

public class Moto {
    private String name;
    private int age;
    private String color;
    private int power;
    private byte cylinder;

    public Moto(String name, int age, String color, int power, byte cylinder) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.power = power;
        this.cylinder = cylinder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public byte getCylinder() {
        return cylinder;
    }

    public void setCylinder(byte cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", cylinder=" + cylinder +
                '}';
    }

    public static void main(String[] args) {
        int[] powerArr = new int[]{250, 350, 650, 750};

        ArrayList<String> nameMoto = new ArrayList<String>();
        nameMoto.add("Minsk");
        nameMoto.add("Jawa");
        nameMoto.add("MT");
        nameMoto.add("Ural");
        for (int i = 0; i < nameMoto.size(); i++) {
            System.out.println(nameMoto.get(i));
        }
    }
}

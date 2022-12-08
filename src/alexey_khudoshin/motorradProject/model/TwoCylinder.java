package alexey_khudoshin.motorradProject.model;//package DZ_27_10_2022;

public class TwoCylinder extends Motorrad {
    String systemSeparateOiled;

    public TwoCylinder(String name, int age, String color, int volume, int maxSpeed, String systemSeparateOiled) {
        super(name, age, color, volume, maxSpeed);
    }

    @Override
    public String toString() {
        return "TwoCylinder{" +
                "systemSeparateOiled='" + systemSeparateOiled + '\'' +
                '}';
    }
}

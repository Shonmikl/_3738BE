package alexey_khudoshin.DZ_27_10_2022;

public class TwoCylinder extends Motorcycles{
    String systemDifOiled;

    public TwoCylinder(String name, int power, String color, int engineVolume, int speed, String systemDifOiled) {
        super(name, power, color, engineVolume, speed);
        this.systemDifOiled = systemDifOiled;
    }

    @Override
    public String toString() {
        return "TwoCylinder{" +
                "systemDifOiled='" + systemDifOiled + '\'' +
                '}';
    }
}

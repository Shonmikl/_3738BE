package alexey_khudoshin.DZ_27_10_2022;

public class OneCylinder extends Motorcycles {
    String systemAddOiled;

    public OneCylinder(String name, int power, String color, int engineVolume, int speed, String systemAddOiled) {
        super(name, power, color, engineVolume, speed);
        this.systemAddOiled = systemAddOiled;
    }

    @Override
    public String toString() {
        return "OneCylinder{" +
                "systemAddOiled='" + systemAddOiled + '\'' +
                '}';
    }
}

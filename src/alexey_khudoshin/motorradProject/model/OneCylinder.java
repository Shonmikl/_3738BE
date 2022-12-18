package motorradProject.model;

public class OneCylinder extends Motorrad {
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
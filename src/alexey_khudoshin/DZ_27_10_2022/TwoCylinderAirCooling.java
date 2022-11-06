package alexey_khudoshin.DZ_27_10_2022;

public class TwoCylinderAirCooling extends TwoCylinder{
    String airCooling;
    public TwoCylinderAirCooling(String name, int power, String color, int engineVolume, int speed, String systemDifOiled, String airCooling) {
        super(name, power, color, engineVolume, speed, systemDifOiled);
        this.airCooling = airCooling;
    }

    @Override
    public String toString() {
        return "TwoCylinderAirCooling{" +
                "airCooling='" + airCooling + '\'' +
                '}';
    }
}

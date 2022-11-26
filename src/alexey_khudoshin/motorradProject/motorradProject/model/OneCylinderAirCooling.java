package alexey_khudoshin.motorradProject.motorradProject.model;

import motorradProject.model.OneCylinder;

public class OneCylinderAirCooling extends OneCylinder {
    String airCooling;

    public OneCylinderAirCooling(String name, int power, String color, int engineVolume, int speed, String systemAddOiled, String airCooling) {
        super(name, power, color, engineVolume, speed, systemAddOiled);
        this.airCooling = airCooling;
    }

    @Override
    public String toString() {
        return "OneCylinderAirCooling{" +
                "airCooling='" + airCooling + '\'' +
                '}';
    }
}

package aleksey_babaykin.hw20221027.Car;

import aleksey_babaykin.hw20221027.Enams.CarStatus;

public interface Car{

    String getName();
    void setName(String name);
    CarStatus getStatus();
    int getMaxSpeed();
    void setMaxSpeed(int maxSpeed);
    int getSpeed();
    void onEngine();
    void offEngine();
    void go(int speed);
    void stop();
}
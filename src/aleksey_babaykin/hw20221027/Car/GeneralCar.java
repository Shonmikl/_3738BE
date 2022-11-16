package aleksey_babaykin.hw20221027.Car;

import aleksey_babaykin.hw20221027.Enams.CarStatus;

public abstract class GeneralCar implements Car, Comparable {

    private static final int STOP_SPEED = 0; // TODO created
    private String name;
    private int speed;
    private boolean isCarOn = false;
    private CarStatus status;
    private Engine engine;
    private int maxSpeed;

    public GeneralCar(String name, CarStatus status, Engine engine, int maxSpeed) {
        this.name = name;
        this.status = status;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    protected void setSpeed(int speed) {

        switch (status) {
            case NEW, USED -> {
                if (speed > this.getMaxSpeed()) {
                    System.out.printf("Max car speed is %d. A car is not able to go with the speed %d", getMaxSpeed(), speed);
                    speed = getMaxSpeed();
                }
                this.speed = speed;
                System.out.println("Car speed : " + this.speed);
            }
            case NOTWORKING -> {
                this.speed = STOP_SPEED;
                System.out.println("Please, repair a car, change status. The сar speed : " + this.speed);
            }
            default -> {
                this.speed = STOP_SPEED;
                System.out.println("Please, check a Car status. The car speed : " + this.speed);
            }
        }
    }

    @Override
    public void go(int speed) {
        setSpeed(speed);
    }

    @Override
    public void stop() {
        setSpeed(STOP_SPEED);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public CarStatus getStatus() {
        return status;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void onEngine() {
        this.isCarOn = true;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void offEngine() {
        this.isCarOn = false;
    }

    public boolean isCarOn() {
        return isCarOn;
    }

    public void setCarOn(boolean carOn) {
        this.isCarOn = carOn;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public int compareTo(Object o) {
        GeneralCar generalCar = (GeneralCar) o;
        int comp = this.name.compareTo(generalCar.getName());
        if (this.name.compareTo(generalCar.getName()) == 0) {
            return this.maxSpeed - generalCar.getMaxSpeed();
        }
        return comp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralCar that = (GeneralCar) o;
        if (maxSpeed != that.maxSpeed) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }
}
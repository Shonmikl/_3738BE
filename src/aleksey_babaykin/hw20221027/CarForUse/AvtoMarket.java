package aleksey_babaykin.hw20221027.CarForUse;

import aleksey_babaykin.hw20221027.Car.Car;
import aleksey_babaykin.hw20221027.Car.Engine;
import aleksey_babaykin.hw20221027.Car.GeneralCar;
import aleksey_babaykin.hw20221027.DataBase.DataBase;
import aleksey_babaykin.hw20221027.Enams.CarStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

public class AvtoMarket {
    private List<Car> cars = new ArrayList<>();
    private DataBase dataBase= new DataBase();
    public void addCarToArray(Car car){
        cars.add(car);
    }
    public void arrayToString(){
        System.out.println("\nInit array:");
        for (Car car: cars) System.out.print(((GeneralCar) car).toString() + " | ");
        System.out.println("\n----------------------------------");
    }
    public void createList() {
        for (int i = 0; i <= 14 ; i++){
            switch (i%4){
                case 0:
                    addCarToArray(new CityCar("Toyota N" +i,
                            CarStatus.NEW,
                            "Comfort"));
                    break;
                case 1:
                    addCarToArray(new SportCar("Ferrari N" +i,
                            CarStatus.NOTWORKING,
                            "Sport"));
                    break;
                case 2:
                    addCarToArray(new Truck("Volvo N" +i,
                            CarStatus.USED,
                            new Engine("Disel"),
                            20000));
                    break;
                case 3:
                    addCarToArray(new Tractor("Tractor DW4" +i,
                            CarStatus.NEW,
                            new Engine("Steam")));
                    break;
            }
            dataBase.addItem(cars.get(i));
        }
    }
}
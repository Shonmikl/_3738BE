package homework.project.model;

import homework.project.model.Commerce;

public class Shop extends Commerce {
    public Shop(int id, String type, int area, int price, String manager, int rentalTime, boolean currentStatus) {
        super(id, type, area, price, manager, rentalTime, currentStatus);
    }

    public void rentToBusiness() {
        System.out.println("Для сдачи под магазин");
    }
}
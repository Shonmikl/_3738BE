package homework.project.model;

import homework.project.model.Commerce;

public class Office extends Commerce {
    public Office(int id, String type, int area, int price, String manager, int rentalTime, boolean currentStatus) {
        super(id, type, area, price, manager, rentalTime, currentStatus);
    }

    public void rentToBusiness() {
        System.out.println("Для сдачи под офис");
    }
}
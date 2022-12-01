package homework.project.model;

import homework.project.Interface.Habitable;

public class LivingRoom extends Room implements Habitable {
    public LivingRoom(int id, String type, int area, int price, String manager, int rentalTime, boolean currentStatus) {
        super(id, type, area, price, manager, rentalTime);
    }

    public void informPurposeRoom() {
        System.out.println("Пригодно для жизни");
    }
}

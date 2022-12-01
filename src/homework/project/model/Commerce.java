package homework.project.model;

public abstract class Commerce extends Room {
    public Commerce(int id, String type, int area, int price, String manager, int rentalTime, boolean currentStatus) {
        super(id, type, area, price, manager, rentalTime);
    }

    public abstract void rentToBusiness();

}

package homework.project.model;

public class Room {
    private int id;
    private String type;
    private int area;
    private int price;
    private String manager;
    private int rentalTime;

    public Room(int id, String type, int area, int price, String manager, int rentalTime) {
        this.id = id;
        this.type = type;
        this.area = area;
        this.price = price;
        this.manager = manager;
        this.rentalTime = rentalTime;
            }

    public int getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public int getArea() {
        return this.area;
    }

    public int getPrice() {
        return this.price;
    }

    public String getManager() {
        return this.manager;
    }

    public int getRentalTime() {
        return this.rentalTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setRentalTime(int rentalTime) {
        this.rentalTime = rentalTime;
    }

    public String toString() {
        return "Room{id=" + this.id + ", type='" + this.type + "', area=" + this.area + ", price=" + this.price +
                ", manager='" + this.manager + "', rentalTime=" + this.rentalTime  + "}";
    }

    public void countRent() {
        int sum = this.area * this.price * this.rentalTime;
        System.out.println("Сумма аренды  за  " + this.rentalTime + " месяцев составляет " + sum + " рублей");
    }
}

package _2023_01_24.solid.s;

import java.util.Random;

public class BillCalculator {
    private Order order;

    public BillCalculator(Order order) {
        this.order = order;
    }

    public void calculateBill() {
        int total = new Random().nextInt(1000) * this.order.getQuantity();
        this.order.setTotalBillAmt(total);
        System.out.println("Order: " + this.order.getOrderId()
         + " has " + this.order.getTotalBillAmt());
    }
}
package _2023_01_24.solid.s;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private Customer customer;
    private String orderId;
    private String itemName;
    private int quantity;
    private int totalBillAmt;

    public void prepareOrder() {
        System.out.println("Preparing order: "
        + this.getCustomer());
    }
}

package _08_12_2022.tests.dummyTest;

import _08_12_2022.srcs.dummy.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class DummyObjectDemo {
    /**
     * Sc.1
     */

    public Customer createDummyCustomer() {
        State state = new State("CA");
        City city = new City("La", state);
        Address address = new Address("Smth Street", city);
        Customer customer = new Customer("Alexey", "Khudoshin", address);
        return customer;
    }

    @Test
    public void addCustomerTest() {
        Customer dummy = createDummyCustomer();
        AddressBook addressBook = new AddressBook();
        addressBook.addCustomer(dummy);
        Assertions.assertEquals(1, addressBook.getNumberOfCustomers());
    }

    /**
     * Sc.2
     */

    @Test
    public void addNullCustomerTest() {
        Customer dummy = null;
        AddressBook addressBook = new AddressBook();
        Assertions.assertThrows(NullPointerException.class, () -> addressBook.addCustomer(dummy));
    }

    /**
     * Sc.3
     */

    @Test
    public void addCustomerWithDummyTest() {
        Customer dummy = Mockito.mock(Customer.class);
        AddressBook addressBook = new AddressBook();
        addressBook.addCustomer(dummy);
        Assertions.assertEquals(1, addressBook.getNumberOfCustomers());
    }
}
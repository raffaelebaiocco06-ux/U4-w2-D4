package Es1;

import java.time.LocalDate;
import java.util.List;
public class Order {
    private int id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;


    public Order(int id, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }
    //getter
    public List<Product> getProducts(){
        return products;
    }
    public Customer getCustomer(){
        return customer;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public LocalDate getdeliveryDate() {
        return deliveryDate;
    }
    @Override
    public String toString() {
        return "Order{id=" + id + ", products=" + products + "}";
    }
}

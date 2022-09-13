package model;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private double price;
    private double amount;
    private String information;

    public Product() {
    }

    public Product(String id, String name, double price, double amount, String information) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.information = information;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", information='" + information + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return (int) (getPrice() - o.getPrice());
    }
}

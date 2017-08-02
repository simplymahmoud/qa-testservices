package objects;

public class Product {
    private String name;
    private String price;
    private String brand;
    private String description;
    private String size;
    private String color;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Product(String name, String price, String brand, String description, String size, String color) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

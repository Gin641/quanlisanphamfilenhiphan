import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brandName;
    private double price;
    private String description;
    public Product(){

    }
    public Product(int id,String name, String brandName, double price, String description){
        this.id=id;
        this.name=name;
        this.brandName=brandName;
        this.price=price;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getDescription() {
        return description;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "ID: " + id +
                "\nName: " + name +
                "\nBrand: " + brandName +
                "\nPrice: " + price +
                "\nDescription: " + description + "\n";
    }
}

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private int id;
    private String label;
    private String mark;
    private double price;
    private Date expirationDate;


    Product(int id, String label, String mark, double price, String expirationDate) throws ParseException {
        if (price < 0) {
            throw new Error("price should be true");
        } else {
            this.price = price;
        }
        this.id = id;
        this.label = label;
        this.mark = mark;
        //config expiration data
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.expirationDate = formatter.parse(expirationDate);
    }

    Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new Error("price should be true");
        } else {
            this.price = price;
        }
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    //comparer : this product with other one
    public boolean comparer(Product product1) {
        return product1.getId() == this.id && product1.getLabel().equals(this.label) && product1.getPrice() == this.price;
    }

    //comparer2 : 2 diff products
    public static boolean comparer2products(Product product1, Product product2) {
        return product1.getId() == product2.getId() && product1.getLabel().equals(product2.getLabel()) && product1.getPrice() == product2.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                ", expirationDate= " + expirationDate +
                '}';
    }
}

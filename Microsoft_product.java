import java.util.Scanner;

public class Microsoft_product {
    float product_no;
    String product_name;
    String activation_key;
    float price_of_product;

    public String getActivation_key() {
        return activation_key;
    }
    public float getPrice_of_product() {
        return price_of_product;
    }
    public float getProduct_no() {
        return product_no;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setActivation_key(String activation_key) {
        this.activation_key = activation_key;
    }
    public void setProduct_no(float product_no) {
        this.product_no = product_no;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public void setPrice_of_product(float price_of_product) {
        this.price_of_product = price_of_product;
    }
    void display()
    {
        System.out.println("PRODUCT NO. IS : "+product_no);
        System.out.println("PRODUCT NAME IS :" +product_name);
        System.out.println("ACTIVATION KEY FOR THIS PRODUCT IS :"+activation_key);
        System.out.println("PRICE OF THIS PRODUCT IS : "+price_of_product);
        System.out.println("THIS PROGRAM IS PREPARED BY TANISHQ_VASANI_22CE136");
    }
}
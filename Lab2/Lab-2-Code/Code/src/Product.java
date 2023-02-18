package src;

public class Product {
    /*
     * Product's three attributes
     * 1. product ID
     * 2. product name
     * 3. product price
     */
    private int product_ID;
    private String product_Name;
    private float product_Price;

    /*
     * Overloaded constructor (needed
     * to use the add function from the
     * Client.java)
     */
    public Product(int product_ID, String product_Name, double product_Price){
        this(product_ID, product_Name, (float)product_Price);
    }

    /*
     * Constructor
     * @param product_ID
     * @param product_Name
     * @param product_Price
     */
    public Product(int product_ID, String product_Name, float product_Price){
        this.product_ID = product_ID;
        this.product_Name = product_Name;
        this.product_Price = product_Price;
    }

    /*
     * @return the product_ID
     */
    public int getProductID(){
        return product_ID;
    }

    /*
     * @return the product_Name
     */
    public String getProductName(){
        return product_Name;
    }

    /*
     * @return the product_Price
     */
    public float getProductPrice(){
        return product_Price;
    }

    /*
     * @param name to set with product_Name
     */
    public void setProductName(String name){
        this.product_Name = name;
    }

    /*
     * @param price to set with product_Price
     */
    public void setProductPrice(float price){
        this.product_Price = price;
    }

    /*
     * display function to output the
     * attributes of the product
     * 
     * Use the string class to use function
     * valueOf to convert the following ID
     * and Price into a string
     * 
     * @return String of the whole product
     */
    public String displayProduct(){
        return String.valueOf(product_Price) + " | " + product_Name
        + " | " + String.valueOf(product_ID);
        //String.format(); --> trying to set spaces on the outputs
    }
}

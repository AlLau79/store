package Classes;
public class Item {

    private String title;
    private int quantity;
    private double price;

    public Item(String title, double price, int quantity){
        this.setTitle(title);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public Item(){
        title = "no name. ooooooo";
        price = 10000.0;
        quantity = 1;
    }

    public void setTitle(String s){
        title = s;
    }

    public void setPrice(double p){
        price = p;
    }

    public void setQuantity(int q){
        quantity = q;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
}
